public class number1 {

public static void main( String[] args) {
    int myNumber = 3;
    int testNumber = 10;
    String resStr = "";

    if (myNumber < testNumber) 
    {
        resStr = "less then";
       } else if (myNumber > testNumber) 
       {
        resStr = "bigger then";
        } 
        else 
        {
System.out.println("My number is equial to " + testNumber);
}
System.out.println("My number is " + resStr + " " + testNumber);
}
}


