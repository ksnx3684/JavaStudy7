package com.ksnx3684.s1;
import java.util.ArrayList;
import java.util.Scanner;
public class MemberMenu {

	public void select() { // 메뉴 출력
		Scanner sc = new Scanner(System.in);
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
			
			if(select == 1) {
				if(ar.isEmpty()) {
					System.out.println("주소록에 정보가 없습니다.");
				} else {
					for(int i = 0; i < ar.size(); i++) {
						System.out.println("이름\t별명\t이메일\t전화번호\t생일");
						System.out.println("----------------------------------------");
						System.out.print(ar.get(i).getName()+"\t");
						System.out.print(ar.get(i).getNickname()+"\t");
						System.out.print(ar.get(i).getEmail()+"\t");
						System.out.print(ar.get(i).getPhone()+"\t");
						System.out.println(ar.get(i).getBirthday());
					}
				}
				
			} else if(select == 2) {
				
			} else if(select == 3) {
				MemberDTO memberDTO = memberData.memberadd(); // 객체 생성하여 멤버 데이터 추가
				ar.add(memberDTO); // 어레이리스트 ar에 정보 추가
				System.out.println(ar); // 출력
			} else if(select == 4) {
				
			} else {
				System.out.println("프로그램 종료");
				check = !check;
			}
		}
	}
}
