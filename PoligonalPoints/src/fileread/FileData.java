package fileread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import mathwork.MathWork;
import points.CheckPoints;
import points.PolygonPoints;

public class FileData {

	// http://bbs.dartmouth.edu/~fangq/MATH/download/source/Determining%20if%20a%20point%20lies%20on%20the%20interior%20of%20a%20polygon.htm
	public void getDataForPolygon() {
		File file = new File("points.txt");
		BufferedReader reader = null;
		int cnt = 0;
		PolygonPoints poly = null;
		CheckPoints check = null;
		MathWork math = new MathWork();
		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;

			while ((text = reader.readLine()) != null) {
				String[] data = text.split("\\s*(=>|,|\\s)\\s*");

				if (cnt == 1 && data.length == 2) {
					poly = new PolygonPoints(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
					math.addListPolygon(poly);
				}

				if (cnt == 2 && data.length == 2) {
					check = new CheckPoints(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
					math.addListCheck(check);
				}

				if (data.length == 1) {
					cnt++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
			}
		}

	}
}
