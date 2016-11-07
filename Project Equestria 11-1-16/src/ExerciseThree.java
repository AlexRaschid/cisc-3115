public class ExerciseThree {
	public static void longestTrip(int x1, int y1,//First location
								   int x2, int y2,//Second location
								   int x3, int y3){//Third Location


				double distanceOneTwo = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
				double distanceOneThree = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
				double distanceTwoThree = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
				
				
				double /*Two is vertex*/ angleOneTwoThree = Math.acos( ((distanceOneTwo * distanceOneTwo) - (distanceOneThree * distanceOneThree) - (distanceTwoThree * distanceTwoThree)) / (2 * distanceOneTwo * distanceOneThree) );
				double /*Three is vertex*/angleTwoThreeOne = Math.acos( ((distanceOneTwo * distanceOneTwo) - (distanceOneThree * distanceOneThree) - (distanceTwoThree * distanceTwoThree)) / (2 * distanceOneTwo * distanceOneThree) );
				double /*One is vertex*/ angleThreeOneTwo = Math.acos( ((distanceOneTwo * distanceOneTwo) - (distanceOneThree * distanceOneThree) - (distanceTwoThree * distanceTwoThree)) / (2 * distanceOneTwo * distanceOneThree));
		
				System.out.println("From Point One, turn " + angleThreeOneTwo + " degreese and walk " + distanceOneTwo + " to reach Point Two.");
				System.out.println("From Point Two, turn " + angleOneTwoThree + " degreese to your right and walk " + distanceTwoThree + " miles to reach point Three.");
				System.out.println("To return to Point One from Point three, turn " + angleTwoThreeOne + " degreese to your right and walk " + distanceOneThree + " miles.");
	}

	public static void main(String[] args){
	longestTrip(1,2,//First Point/Place
				3,4,//Second Point/Place
				5,6);//Third Point/place
				
	}
}
