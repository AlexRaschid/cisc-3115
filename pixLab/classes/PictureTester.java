/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue() {
	  Picture colors = new Picture("swan.jpg");
	  colors.keepOnlyBlue();
	  colors.explore();
	  
  }
  
  
  /** Method to test negate */
  public static void testNegate() {
	  Picture colors = new Picture("swan.jpg");
	  colors.negate();
	  colors.explore();
	  
  }
  
  /** Method to test grayScale */
  public static void testGrayScale() {
	  Picture colors = new Picture("swan.jpg");
	  colors.grayScale();
	  colors.explore();
	  
  }
  
  public static void testFixUnderWater(){
	  Picture colors = new Picture("water.jpg");
	  colors.fixUnderWater();
	  colors.explore();
	  
	  
  }
  
  public static void testMirrorVerticalRightHalf(){
	  
	  	Picture caterpillar = new Picture("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
	  
	  
  }
  
  public static void testMirrorHorizontal(){
		Picture caterpillar = new Picture("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorizontal();
	    caterpillar.explore();
	  
	  
  }
  
  public static void testMirrorHorizontalBotToTop(){
		Picture caterpillar = new Picture("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorizontalBotToTop();
	    caterpillar.explore();
	  
	  
}
  
  
  public static void testMirrorDiagonal(){
		Picture caterpillar = new Picture("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorDiagonal();
	    caterpillar.explore();
	  
	  
}
  
  
  
  public static void testMirrorArms(){
	  
	  	Picture snowman = new Picture("snowman.jpg");
	  	snowman.explore();
	  	snowman.mirrorArms();
	  	snowman.explore();
	  
  }
  
  
  
  public static void testMirrorGull(){
	  
	  	Picture seagull = new Picture("seagull.jpg");
	  	seagull.explore();
	  	seagull.mirrorGull();
	  	seagull.explore();
	  
  }
  
  

  
  /** Method to test the collage method */
  public static void testmyCollage()
  {	    	
		Picture myCollege = new Picture("640x480.jpg");
		myCollege.explore();
		myCollege.myCollage();
		myCollege.explore();
  }
  
  public static void testCopy()
  {
	    Picture canvas = new Picture("640x480.jpg");
	    canvas.createCollage();
	    canvas.explore();
  }
  
  
  
  
  
  
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  
	//One's I made/use
	  //testFixUnderWater();
	  //testGrayScale();
	  //testKeepOnlyBlue();
	  //testNegate();
      //testZeroBlue();r
      //testKeepOnlyBlue();
	  //testMirrorVertical();
	  //testMirrorHorizontal();
	  //testMirrorHorizontalBottomToTop();
	  //testMirrorDiagonal();

	  
	  /**##################Please NOTE#######################*/
	  //For A6, Exercise one. It says to make mirrorVerticalRightToLeft
	  //Method within Picture.java 
	  //and test is by using the testMirrorVertical method.
	  
	  //Since testMirrorVertical is being used already, im going to name it 
	  //testMirrorVerticalRightHalf() instead.
	  //Please do not deduct points for this.
	  
	  //testMirrorVerticalRightHalf();
	  /**##################Please NOTE#######################*/
	  
	  
	
	  
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}