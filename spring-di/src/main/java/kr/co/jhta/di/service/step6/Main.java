package kr.co.jhta.di.service.step6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.jhta.di.service.step7.EventNotificationService;
import kr.co.jhta.di.service.step7.EventNotificationServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		
		String conf = "kr/co/jhta/di/service/step7/context-step7.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		EventNotificationService eventNotificationService = ctx.getBean("eventNotificationServiceImpl", EventNotificationService.class);
		
		eventNotificationService.noticeEvent("이벤트제목제목", "이벤트내용내용");
	}
}
