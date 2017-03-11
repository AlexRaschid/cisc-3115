public class ExerciseFour {
	public static void longestTrip(int x1, int y1,//First location
								   int x2, int y2,//Second location
								   int x3, int y3,//Third Location
								   int x4, int y4){//Fourth Location
		double distancePointOneAndTwo = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		double distancePointOneAndThree = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
		double distancePointOneAndFour = Math.sqrt((x4-x1)*(x4-x1) + (y4-y1)*(y4-y1));
  
		double distancePointTwoAndThree = Math.sqrt((x4-x2)*(x4-x2) + (y4-y2)*(y4-y2));
		double distancePointTwoAndFour = Math.sqrt((x4-x2)*(x4-x2) + (y4-y2)*(y4-y2));
		
		double distancePointThreeAndFour = Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
		
		System.out.println("Distance between points one and one = 0.0");
		System.out.println("Distance between points one and two = " + distancePointOneAndTwo);
		System.out.println("Distance between points one and three = " + distancePointOneAndThree );
		System.out.println("Distance between points one and four = " + distancePointOneAndFour );
		System.out.println("");
		System.out.println("Distance between points two and two = 0.0");
		System.out.println("Distance between points two and three = " + distancePointTwoAndThree );
		System.out.println("Distance between points two and four = " + distancePointTwoAndFour );
		System.out.println("");
		System.out.println("Distance between points three and three = 0.0");
		System.out.println("Distance between points three and four = " + distancePointThreeAndFour );
		
  }
  
  
  
  public static void main(String[] args){
  		longestTrip(29, 16, // first point (x,y)
  					34, 8,// second point(x,y)
  					1,2,// third point(x,y)
  					4,6); // fourth point(x,y)
  }
}
