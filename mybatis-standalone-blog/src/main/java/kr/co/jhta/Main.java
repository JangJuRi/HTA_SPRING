package kr.co.jhta;

import java.util.List;

import kr.co.jhta.dao.BlogDao;
import kr.co.jhta.dao.CommentDao;
import kr.co.jhta.dto.BlogDto;
import kr.co.jhta.vo.Blog;
import kr.co.jhta.vo.Comment;

public class Main {

	public static void main(String[] args) {
		BlogDao blogDao = new BlogDao();
		CommentDao commentDao = new CommentDao();
		
		/* 신규 게시글 등록 */
//		Blog blog = new Blog("제목2", "hong3", "내용2");
//		blogDao.insertBlog(blog);
//		System.out.println("== 게시글 등록 완료  ==");
		
		/* 모든 게시글 조회 */
		List<BlogDto> dtos = blogDao.getAllBlogs();
		for(BlogDto dto : dtos) {
			System.out.println("===============================");
			System.out.println("글 번호: " + dto.getNo());
			System.out.println("제목: " + dto.getTitle());
			System.out.println("작성자: " + dto.getWriterName());
			System.out.println("===============================");
		}
		
		/* 게시글 번호로 게시글 조회 */
		BlogDto dto = blogDao.getBlogByNo(1);
		System.out.println("============ 상세 정보 ============");
		System.out.println("글 번호: " + dto.getNo());
		System.out.println("제목: " + dto.getTitle());
		System.out.println("작성자: " + dto.getWriterName());
		System.out.println("내용: " + dto.getContent());
		System.out.println("댓글 수: " + dto.getCommentCounts());
		System.out.println("===============================");
		
		/* 댓글 등록하기 */
//		Comment comment = new Comment("hong3", "댓글내용1", 1);
//		commentDao.insertComment(comment);
//		System.out.println("== 댓글 등록 완료 ==");
	}
}
