package com.ksnx3684.s1;

import java.util.ArrayList;
import java.util.HashMap;

public class MemberMain {

	public static void main(String[] args) {
//		MemberDTO memberDTO = new MemberDTO();
//		MemberData memberData = new MemberData();
		MemberMenu memberMenu = new MemberMenu();
		
		memberMenu.select();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		map.put("a", ar);
		map.put("b", ar2);

	}

}
