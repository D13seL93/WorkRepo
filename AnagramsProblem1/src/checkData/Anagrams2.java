package checkData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import file.FileRead;

public class Anagrams2 {

	public ArrayList<String> data = null;

	public void getData(String anagram) {
		FileRead file = new FileRead();
		data = new ArrayList<>(file.getDataForPolygon());
		try {
			processData(anagram);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void processData(String anagram) throws IOException {

		String s1 = anagram.toLowerCase();
		ArrayList<String> second = new ArrayList<>(data);
		for (int i = 0; i < data.size(); i++) {
			for (int j = 0; j < second.size(); j++) {
				String s2 = (data.get(i) + second.get(j)).toLowerCase();
				char c1[] = null;
				char c2[] = null;
				if (s1.length() == s2.length()) {

					c1 = s1.toCharArray();
					c2 = s2.toCharArray();

					Arrays.sort(c1);
					Arrays.sort(c2);

					if (Arrays.equals(c1, c2)) {
						System.out.println("Anagram");
					}
				} else {
					System.out.println("No anagram");
				}
			}
		}
	}
}