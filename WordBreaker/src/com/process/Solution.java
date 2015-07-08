package com.process;

import java.util.ArrayList;

public class Solution {

	ArrayList<String> words = new ArrayList<String>();

	public void wordBreak(String s) {
		wordBreakHelper(s, 0);
	}

	public void initDictionary() {
		String dictionary[] = { "apple", "pie", "I" };
		for (String element : dictionary) {
			words.add(element);
		}
	}

	private void wordBreakHelper(String theString, int start) {
		String s = theString + " ";

		for (String a : words) {
			int len = a.length();
			int end = start + len;

			if (end > s.length())
				continue;

			if (s.substring(start, start + len).equals(a)) {
				System.out.println(s.substring(start, start + len));
				wordBreakHelper(s, start + len);

			}
		}
	}
}
