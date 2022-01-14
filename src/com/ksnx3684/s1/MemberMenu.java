package com.ksnx3684.s1;
import java.util.ArrayList;
import java.util.Scanner;
public class MemberMenu {

	public void select() { // 메뉴 출력
		Scanner sc = new Scanner(System.in);
		MemberView memberView = new MemberView(); // 멤버 뷰 객체 생성
		MemberData memberData = new MemberData(); // 멤버 데이터 객제 생성
		ArrayList<MemberDTO> ar = new ArrayList<>(); // 주소록 인원을 담을 어레이리스트 생성
		boolean check = true;
		while(check) {
			System.out.println("1. 주소록 전체 명단 출력");
			System.out.println("2. 주소록 명단 검색");
			System.out.println("3. 주소록 명단 추가");
			System.out.println("4. 주소록 명단 제거");
			System.out.println("5. 프로그램 종료");
			
			int select = sc.nextInt();
			
			if(select == 1) { // 전체 명단 출력
				
				memberView.view(ar);
				
			} else if(select == 2) { // 명단 검색
				
				MemberDTO memberDTO = memberData.membersearch(ar); // membersearch로부터 반환된 값을 memberDTO에 넣기
				memberView.search(memberDTO); // 넣은 값을 토대로 search 메서드 실행하여 찾기
				 
			} else if(select == 3) { // 명단 추가
				
				MemberDTO memberDTO = memberData.memberadd(); // 객체 생성하여 멤버 데이터 추가
				ar.add(memberDTO); // 어레이리스트 ar에 정보 추가
				System.out.println(ar); // 출력
				
			} else if(select == 4) { // 명단 제거
				
				boolean flag = memberData.memberremove(ar);
				if(flag)
					System.out.println("삭제 성공");
				else {
					System.out.println("삭제 실패");
				}
			} else {
				System.out.println("프로그램 종료");
				check = !check;
			}
		}
	}
}
