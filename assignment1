public class Main {
	
	  String[] starList = new String[8];
	  String[] spaceList = new String[4];
	  
	  public Main() {
		  String stars = "";
		  for (int i = 0; i < 8; i++) {
			  starList[i] = stars;
			  stars += "*";
		  }
		  String space = "  ";
		  for (int j = 0; j < 4; j++) {
			  spaceList[j] = space;
			  space += " ";
		  }
		  
	  }
	  
	 
	  static void print1() {
		  Main myObj = new Main();
		  for (int i = 1; i <= 4; i++) {
			  System.out.println(myObj.starList[i]);
		  }
	  }
	  
	  static void print2() {
		  Main myObj = new Main();
		  for (int i = 4; i > 0; i--) {
			  System.out.println(myObj.starList[i]);
		  }
	  }
	  
	  static void print3() {
		  Main myObj = new Main();
		  for (int i = 0; i < 4; i++) {
			  String row = myObj.spaceList[4 - i -1] + myObj.starList[2 * i + 1];
			  System.out.println(row);
		  }
	  }
	  
	  static void print4() {
		  Main myObj = new Main();
		  for (int i = 3; i >= 0; i--) {
			  String row = myObj.spaceList[4 - i - 1] + myObj.starList[2 * i + 1];
			  System.out.println(row);
		  }
	  }

	  
	  static void print1LineDots(int number) {
		  String dots = "........";
		  for (int i = 0; i < number; i++) {
			  dots += ".";
		  }		
		  System.out.println(dots);
	  }
	  public static void main(String[] args) {
		  System.out.println("1)");
		  print1();
		  print1LineDots(1);
		  System.out.println("2)");
		  print1LineDots(2);
		  print2();
		  System.out.println("3)");
		  print3();
		  print1LineDots(3);
		  System.out.println("4)");
		  print1LineDots(4);
		  print4();
		 
	  }
	}
