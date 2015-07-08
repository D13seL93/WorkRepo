package mathwork;

import java.awt.Point;
import java.util.ArrayList;

import points.CheckPoints;
import points.PolygonPoints;

public class MathWork {

	public static ArrayList<CheckPoints> pointCheck = new ArrayList<CheckPoints>();
	public static ArrayList<PolygonPoints> pointPolygon = new ArrayList<PolygonPoints>();

	public void addListPolygon(PolygonPoints p) {
		pointPolygon.add(p);
	}

	public void addListCheck(CheckPoints p) {
		pointCheck.add(p);
	}

	public void checkNumbers() {
		for (int i = 0; i < pointCheck.size(); i++) {
			if (isInside(pointCheck.get(i).getX(), pointCheck.get(i).getY())) {
				System.out.println("Is inside");
			} else {
				System.out.println("Is not inside");
			}
		}
	}

	private int minFunction(int a, int b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}

	private int maxFunction(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public boolean isInside(int x, int y) {
		int counter = 0;
		int i;
		double xinters;
		Point p1 = null, p2 = null;
		p1 = new Point(pointPolygon.get(0).getX(), pointPolygon.get(0).getY());

		for (i = 1; i <= pointPolygon.size(); i++) {
			p2 = new Point(pointPolygon.get(i % pointPolygon.size()).getX(),
					pointPolygon.get(i % pointPolygon.size()).getY());
			if (y > minFunction(p1.y, p2.y)) {
				if (y <= maxFunction(p1.y, p2.y)) {
					if (x <= maxFunction(p1.x, p2.x)) {
						if (p1.y != p2.y) {
							xinters = (y - p1.y) * (p2.x - p1.x) / (p2.y - p1.y) + p1.x;
							if (p1.x == p2.x || x <= xinters)
								counter++;

						}
					}
				}
			}
			p1 = p2;
		}
		if (counter % 2 != 0) {
			return true;
			} else {
			return false;
			}
	}

}
