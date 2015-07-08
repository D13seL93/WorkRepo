package main;

import fileread.FileData;
import mathwork.MathWork;

public class Main {

	public static void main(String[] args) {

		FileData file = new FileData();
		MathWork math = new MathWork();
		file.getDataForPolygon();
		math.checkNumbers();

	}

}
