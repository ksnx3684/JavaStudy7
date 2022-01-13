package com.ksnx3684.s1;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberData {

	private Scanner sc;
	
	public MemberData() { // 기본 생성자
		this.sc = new Scanner(System.in);
	}
	
//	public ArrayList<MemberDTO> memberlist(){
//		ArrayList<MemberDTO> ar = 
//		for(int i = 0; i < ar.size(); i++) {
//			System.out.println("이름\t별명\t이메일\t전화번호\t생일");
//			System.out.println("----------------------------------------");
//			System.out.println(ar.get(i).);
//		}
//		
//		
//		return null;
//	}
	
	
	public MemberDTO memberadd() {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("이름을 입력하시오");
		memberDTO.setName(sc.next());
		System.out.println("별명을 입력하시오");
		memberDTO.setNickname(sc.next());
		System.out.println("이메일을 입력하시오");
		memberDTO.setEmail(sc.next());
		System.out.println("전화번호를 입력하시오");
		memberDTO.setPhone(sc.next());
		System.out.println("생일을 입력하시오");
		memberDTO.setBirthday(sc.next());
		
		return memberDTO;
	}
	
//	public MemberDTO memberremove() {
//		MemberDTO memberDTO = null;
//		System.out.println("삭제할 사람의 입력하시오");
//	}
}
