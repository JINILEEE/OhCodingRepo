package com.cherry.qna.controller;

import com.cherry.main.Main;
import com.cherry.qna.service.QnaService;
import com.cherry.qna.vo.QnaVo;

public class QnaController {
	
	private final QnaService service;

	//기본 생성자
	public QnaController() {
		service = new QnaService();
	}
	
	// 메뉴선택
	public void selectMenu() {
		System.out.println("======= QnA Menu =======");
		
		System.out.println("1. 문의글 작성");
		System.out.println("2. 문의글 목록 (최신순)");
		System.out.println("3. 문의글 상세조회 (번호)");
		System.out.println("4. 관리자 답변작성");
		System.out.println("5. 관리자 답변수정");
		
		String num = Main.SC.nextLine();
		switch(num) {
		case "1" : write();break;
//		case "2" : qnaList();break;
//		case "3" : qnaDetailByNo();break;
//		case "4" : answer();break;
//		case "5" : editAnswer();break;
		}
		
	}//selectMenu end
	
	// 문의글 작성
	public void write() {
		
		try {
			System.out.println("------- 문의글 작성 -------");
			
			//로그인 여부
			if(Main.loginMember == null) {
				throw new Exception("회원만 문의글 작성이 가능합니다.");
			}
			
			// 데이터
			System.out.print("제목: ");
			String title = Main.SC.nextLine();
			System.out.print("내용: ");
			String content = Main.SC.nextLine();
			
			QnaVo vo = new QnaVo();
			vo.setTitle(title);
			vo.setContent(content);
			
			// 서비스
			int result = service.write(vo);
			
			// 결과
			if(result != 1) {
				throw new Exception();
			}
			System.out.println("문의글 작성 완료 !!!");
		}catch(Exception e) {
			System.out.println("문의글 작성 실패 ...");
			e.printStackTrace();
		}
			
	}//write end
	
	
	
}
