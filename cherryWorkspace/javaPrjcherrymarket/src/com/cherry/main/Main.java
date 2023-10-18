package com.cherry.main;

import java.util.Scanner;

import com.cherry.member.vo.MemberVo;
import com.cherry.qna.controller.QnaController;

public class Main {
	
	public static MemberVo loginMember;
	public static final Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {

		QnaController qc = new QnaController();
		
		while(true) {
			
			//메뉴판
			System.out.println("1. QNA");
			System.out.println("9. 프로그램 종료");
			
			//메뉴 선택
			String num = Main.SC.nextLine();
			switch(num) {
			case "1" : qc.selectMenu(); break;
			case "9" : return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}//main

}//class
