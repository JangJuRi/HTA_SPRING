package kr.co.jhta.web;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.jhta.form.BoardForm;
import kr.co.jhta.service.BoardService;
import kr.co.jhta.vo.Board;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Value("${directory.save.freeboard}")
	private String saveDirectory;
	
	@RequestMapping("/list.do")
	public String boardList(Model model) {
		// 게시글 전체 조회
		List<Board> boardList = boardService.getAllBoards();
		// 조회된 게시글을 Model에 담아서 뷰페이지에 전달하기
		model.addAttribute("boards", boardList);
		// 내부이동할 JSP 페이지의 경로 및 이름 반환
		return "board/list";
	}
	
	@RequestMapping("/form.do")
	public String form() {
		return "board/form";
	}
	
	@RequestMapping("/add.do")
	public String addBoard(BoardForm boardForm) throws Exception {
		
		Board board = new Board();
		// title, writer, content, password 필드의 값이 boardForm에서 board로 복사된다.
		BeanUtils.copyProperties(boardForm, board);
		
		// 첨부파일 다루기
		MultipartFile upfile = boardForm.getUpfile();
		if(!upfile.isEmpty()) {
			String filename = upfile.getOriginalFilename();
			filename = System.currentTimeMillis() + filename;	// 파일명 중복 방지
			File file = new File(saveDirectory, filename);
			
			FileCopyUtils.copy(upfile.getInputStream(), new FileOutputStream(file));
			board.setFilename(filename);
		}
		
		boardService.addNewBoard(board);
		
		return "redirect:list.do";
	}
	
	@RequestMapping("/likes.do")
	public String likesBoard(@RequestParam("no") long boardNo, RedirectAttributes redirectAttributes) { // list.jsp 요청 파라미터 no를 boardNo에 넣음
		boardService.increaseBoardLikes(boardNo);
		redirectAttributes.addAttribute("no", boardNo);
		
		return "redirect:detail.do";
	}
	
	@RequestMapping("/detail.do")
	public String datailBoard(@RequestParam("no") long boardNo, Model model) {
		model.addAttribute("board", boardService.getBoardDetail(boardNo));
		
		return "board/detail";
	}
}
