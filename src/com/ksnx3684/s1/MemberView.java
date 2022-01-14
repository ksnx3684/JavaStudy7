package com.ksnx3684.s1;
import java.util.List;

public class MemberView {
	
	// 한 사람의 정보를 출력하는 메서드
	// 정보가 있으면 출력, 없으면 정보가 없음 출력
	public void search(MemberDTO memberDTO) {
		if(memberDTO != null) {
			System.out.println("이름\t별명\t이메일\t전화번호\t생일");
			System.out.println("----------------------------------------");
			System.out.print(memberDTO.getName()+"\t");
			System.out.print(memberDTO.getNickname()+"\t");
			System.out.print(memberDTO.getEmail()+"\t");
			System.out.print(memberDTO.getPhone()+"\t");
			System.out.println(memberDTO.getBirthday());
			// 2000년 12월 24일
		} else {
			System.out.println("정보가 없습니다.");
		}
	}

	public void view(List<MemberDTO> ar) { // 모든 정보 출력 메서드
		
		if(ar.isEmpty()) {
			System.out.println("주소록에 정보가 없습니다.");
		} else {
			System.out.println("이름\t별명\t이메일\t전화번호\t생일");
			System.out.println("----------------------------------------");
			for(int i = 0; i < ar.size(); i++) {
				MemberDTO memberDTO = ar.get(i);
				System.out.print(memberDTO.getName()+"\t");
				System.out.print(memberDTO.getNickname()+"\t");
				System.out.print(memberDTO.getEmail()+"\t");
				System.out.print(memberDTO.getPhone()+"\t");
				System.out.println(memberDTO.getBirthday());
			}
		}
	}
		
}
