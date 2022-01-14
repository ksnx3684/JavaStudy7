package com.ksnx3684.s1;
import java.util.List;
import java.util.Scanner;

public class MemberData {

	private Scanner sc;
	
	public MemberData() { // 기본 생성자
		this.sc = new Scanner(System.in);
	}
	
	// 이름을 입력 받아서 같은 이름이 있는 MemberDTO를 찾아서 return
	public MemberDTO membersearch(List<MemberDTO> ar) { // 매개변수로 리스트 ar에서 데이터를 받아서 검색
		System.out.println("찾을 이름을 입력하시오");
		String name = sc.next();
		MemberDTO memberDTO = null; // MemberView search에서 매개변수로 memberDTO를 받아야 하므로 여기서 null값으로 생성
		for(int i = 0; i < ar.size(); i++) {
			if(ar.get(i).getName().equals(name)) {
				memberDTO = ar.get(i); // memberDTO에 찾은 값을 넣음
				break; // 탈출
			}
		}
		return memberDTO; // 반환
	}
	
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
	
	public boolean memberremove(List<MemberDTO> ar) {
		boolean flag = false;
		System.out.println("삭제할 이름을 입력하시오");
		String name = sc.next();
		for(int i = 0; i < ar.size(); i++) {
			if(ar.get(i).getName().equals(name)) {
				ar.remove(i);
				flag = true;
				break;
			}
		}
		return flag;
	}
	
}
