package Main;

import java.util.Scanner;

import checkData.Anagrams;

public class Main {

	public static void main(String[] args) {

		Anagrams start = new Anagrams();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an word for the anagram");
		String anagram = keyboard.next();
		start.getData(anagram);
		keyboard.close();
	}
}
