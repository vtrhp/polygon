package br.com.vtrhp.polygon;

import br.com.vtrhp.polygon.models.Point;
import br.com.vtrhp.polygon.service.PolygonService;

public class Polygon {

	
	private static PolygonService polygonService;

	// Driver Code
	public static void main(String[] args) {
		polygonService = new PolygonService();
		Point polygon1[] = { new Point(0, 0), new Point(10, 0), new Point(10, 10), new Point(0, 10) };
		int n = polygon1.length;
		Point p = new Point(20, 20);
		if (polygonService.isInside(polygon1, n, p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		p = new Point(5, 5);
		if (polygonService.isInside(polygon1, n, p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		Point polygon2[] = { new Point(0, 0), new Point(5, 5), new Point(5, 0) };
		p = new Point(3, 3);
		n = polygon2.length;
		if (polygonService.isInside(polygon2, n, p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		p = new Point(5, 1);
		if (polygonService.isInside(polygon2, n, p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		p = new Point(8, 1);
		if (polygonService.isInside(polygon2, n, p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		Point polygon3[] = { new Point(0, 0), new Point(10, 0), new Point(10, 10), new Point(0, 10) };
		p = new Point(-1, 10);
		n = polygon3.length;
		if (polygonService.isInside(polygon3, n, p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}