
public class Operators {

	public static void main(String[] args) {

//Arithmatic Operators
		System.out.println("Arithmatic Operators");
		int i1 = 10;
		int i2 = 5;
		int i3 = 3;
		
		System.out.println(i1+i2);             //Addition
		System.out.println(i1-i2);             //Substraction
		System.out.println(i1*i2);             //Multiplicaiton
		System.out.println(i1/i3);             //Division
		System.out.println(i1%i3);              //Reminder
		System.out.println("\n");
		
//Unary Operators
		System.out.println("***Unary Operators***");
		int i=10;
		int j = 20;
		int k = 30;
		//Increment Operator
		System.out.println("Increment Operator");
		System.out.println(i++);       //Unary operator doesn't work here as code gets executed from left to right, output remains 10
		System.out.println(i);        // Now the value of "i" would be 11 as ++ gets executed from earlier statement*** IMP to NOTE
		System.out.println(++j);      //++ gets executed before j, Hence output should be 21
		System.out.println("\n");
		
		//Decrement Operator
		System.out.println("Decrement Operator");
		System.out.println(--k);  
		 System.out.println("\n");
		
		//Logical Compliment Operator
		System.out.println("Logical Compliment Operator");
		boolean b = true;
		System.out.println(!b); 
		System.out.println("\n");
		
		//Equality and Relational Operators
		System.out.println("***Equality and Relational Operators***");
		
        System.out.println(i==j);       //Equal to operator, compares two values and results in boolean value output
        System.out.println(i!=k);       //Not equal to, compares two values and results in boolean value
        System.out.println(i>j);        //Greater than
        System.out.println(i<j);        //Less than
        System.out.println(i>=j);       // Greater than equal to
        System.out.println(i<=j);       // Less than equal to
        System.out.println("\n");
        
        //Conditional Operators
        System.out.println("***Conditional Operators***");
        
        System.out.println((i==j)&&(j==k));     //And
        System.out.println((i<=k)|| (k<=j));    //OR 
        
	}

}
