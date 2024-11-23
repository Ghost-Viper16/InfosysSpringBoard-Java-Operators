class LogicalOperator
{
public static void main(String args[]) {
	int numOne = 100;
	int numTwo = 20;
	int numThree = 30;
	System.out.println(numOne > numTwo && numOne > numThree);
	System.out.println(numOne > numTwo || numOne > numThree); 
	System.out.println(!numOne > numTwo && numOne > numThree);
}

}