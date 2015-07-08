package com.recognos.operations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.recognos.file.FileData;

public class Anagram {
	public ArrayList<String> data = null;

	public void getData() {
		FileData file = new FileData();
		data = new ArrayList<>(file.getDataForPolygon());
	}

	public void processData() throws IOException {

		getData();

		ArrayList<String> second = new ArrayList<>(data);
		for (int i = 0; i < data.size(); i++) {
			String s1 = data.get(i).toLowerCase();
			for (int j = 0; j < second.size(); j++) {
				String s2 = second.get(j).toLowerCase();
				char c1[] = null;
				char c2[] = null;
				if (s1.length() == s2.length()) {

					c1 = s1.toCharArray();
					c2 = s2.toCharArray();

					Arrays.sort(c1);
					Arrays.sort(c2);

					if (Arrays.equals(c1, c2)) {
						System.out.println("Anagram " + j);
					} else {
						System.out.println("No anagram " + j);
					}
				}
			}
		}
	}
}
