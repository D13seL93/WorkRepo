package com.recognos.main;

import java.io.IOException;

import com.recognos.operations.Anagram;

public class Main {
	public static void main(String[] args) {
		Anagram start = new Anagram();
		try {
			start.processData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
