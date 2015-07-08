package checkData;

import java.util.ArrayList;

import file.FileRead;

public class Anagrams {
	public ArrayList<String> data = null;

	public void getData(String anagram) {
		FileRead file = new FileRead();
		data = new ArrayList<>(file.getDataForPolygon());
		processData(anagram);
	}

	private void processData(String anagram) {

		ArrayList<String> second = new ArrayList<>(data);

		for (int i = 0; i < data.size(); i++) {
			for (int j = 0; j < second.size(); j++) {
				String check = data.get(i) + second.get(j);
				int dataSize = check.length();
				int cnt = 0;
				for (int k = 0; k < anagram.length(); k++) {
					for (int x = 0; x < check.length(); x++) {
						if (Character.toLowerCase(anagram.charAt(k)) == Character.toLowerCase(check.charAt(x))) {
							StringBuilder myName = new StringBuilder(check);
							myName.setCharAt(x, '0');
							check = myName.toString();
							cnt++;
							break;
						}
					}
					if (cnt == dataSize) {
						System.out.println("Am gasit");
						break;
					}
				}
			}
		}
	}
}
