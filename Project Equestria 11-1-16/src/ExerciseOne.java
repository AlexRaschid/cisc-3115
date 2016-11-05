
public class ExerciseOne {
	  public static void distance(int x1, int y1, int x2, int y2){
	  		double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	   		System.out.print("The distance between the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is = " + distance);
	  
	  }
	  
	  
	  
	  public static void main(String[] args){
	  		distance(29, 16, // first point (x,y)
	                 34, 8); // second point(x,y)
	  }
}
