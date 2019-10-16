//import java.awt.Point;
import java.io.*;
import java.util.Scanner;


public class PointApp {
	
	public static Point read(Scanner scanner) {
		if (!scanner.hasNext()) return null;
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		return new Point(x,y);
	}
	
	/*public static String getQuadrant(Point p) {
		if (p.x > 0 && p.y > 0) 
			return "quadrant 1"; 

		else if (p.x < 0 && p.y > 0) 
			return "quadrant 2"; 

		else if (p.x < 0 && p.y < 0) 
			return "quadrant 3"; 

		else if (p.x > 0 && p.y < 0) 
			return "quadrant 4"; 

		else if (p.x == 0 && p.y > 0) 
			return "quadrant 0"; //lies at positive y axis

		else if (p.x == 0 && p.y < 0) 
			return "lies at negative y axis"; 

		else if (p.y == 0 && p.x < 0) 
			return "lies at negative x axis";

		else if (p.y == 0 && p.x > 0) 
			return "quadrant 4"; //lies at positive x axis
		
		else
			return "quadrant 0";  //origin
	}
	*/
	
	public static Point combinePoints(Point p1, Point p2) {	
		//int x = (p1.x + p2.x);
		//System.out.println(x);
		//int y = (p1.y + p2.y);
		//System.out.println(y);
		
		return p2.add(p1);	
	}
	
	
	public static void isReflection(Point p1, Point p2) {
		
		if(p1.xReflection().equals(p2)) {
			//across the x-axis
			System.out.println("p1 and p2 are reflections across the x-axis");
		} if(p1.yReflection().equals(p2)) {
			//across the y-axis
			System.out.println("p1 and p2 are reflections across the y-axis");
		}  if (p1.originReflection().equals(p2)) {
			//through the origin
			System.out.println("p1 and p2 are reflections through the origin");
		} 
		
		/* else if (p1.originReflection().equals(p2) && p1.toString().compareTo(p2.toString()) == 0 ) {
			//through the origin
			System.out.println("p1 and p2 are reflections through the origin");
			System.out.println("p1 and p2 are reflections across the x-axis");
			System.out.println("p1 and p2 are reflections across the y-axis");
		}*/
		
	}
	public static void isEquidistant(Point p1, Point p2) {
		if(p1.distance(p1.ORIGIN) == p2.distance(p2.ORIGIN)) {
			System.out.println("p1 and p2 are equidistant from the origin");
		}		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("points.text"));
		
		Point point1 = read(scanner);//(x1,y1)
		Point point2 = read(scanner);//(x2,y2)
		
		
	
		while(point1 != null && point2 != null) {
			Point point3 = combinePoints(point1,point2);//p1+p2
			
			System.out.println("p1: "+ point1.toString() +" (quadrant " + point1.quadrant() + ") / " +
								"p2: "+ point2.toString() +" (quadrant " + point2.quadrant() + ")");
			System.out.println("p1+p2: " + point3.toString() + " (quadrant " + point3.quadrant() + ")"  );
			isReflection(point1, point2);		
			isEquidistant(point1, point2);
			System.out.println("The distance between " + point1.toString() + " and " + point2.toString() + " is " + 
								point1.distance(point2) + "\n");
			
			
			 point1 = read(scanner);//(x1,y1)
			 point2 = read(scanner);//(x2,y2)
		}
		
	}
	
}
