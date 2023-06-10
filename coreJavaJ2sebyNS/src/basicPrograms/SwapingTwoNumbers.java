package basicPrograms;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
	int number1=10;
	int number2=20;
	System.out.println("before swaping");
	System.out.println("number1 ="+number1);
	System.out.println("number2 ="+number2);
	//swapping logic 
	int temp=number2;
	number2=number1;
	number1=temp;
	System.out.println("after swaping");
	System.out.println("number1 ="+number1);
	System.out.println("number2 ="+number2);	
	// swapping logic without creating new varible
	int a=10;
	int b=20;

	System.out.println(" before swapping without creating new varible");
	System.out.println(a);
	System.out.println(b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(" after swapping without creating new varible");
	System.out.println(a);
	System.out.println(b);
	

	}

}
