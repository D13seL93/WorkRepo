package conversio;

public class Conversion {

	public void convertStringToInt(String data) {
		int result = 0;
		for (int i = 0; i < data.length(); i++) {
			result = result * 10 + data.charAt(i) - '0';
		}
		System.out.println(result);
	}
}
