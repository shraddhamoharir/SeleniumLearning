
public class DataType {

	public static void main (String [] args ){
		
		int i = 1234567890; 
		float f = 1.2345f;
		long l = 654657688090909766l;
		double d = 1.34234354354354343646456; 
		boolean b = true; 
		char c = 's';
		String s = "String is a class and hence S is in uppercase";
		
		DataType dt = new DataType();
		
		String ts = "TestString";   
		String tsObj = new String();
		
		//String Concatenation
		String s1 = "Ralston";
		String s2 = "Fremont";
		String s3 = "Woods";
		String s4 = s1+s2+s3;  
		System.out.println(s4);       									//no space in the output
		String s5 = s1+" "+s2+" "+s3; 									// Concatenating a space
		System.out.println(s5);
		System.out.println("Ralston "+"Fremont "+"Woods"); 				// Another way
		
		int num1 = 5;
		int num2 = 10;
		float ft1 = 1.2f;
		
		System.out.println(num1+num2);     							  	//int + int  --> int
		System.out.println("Ralston"+10+5+"Fremont");        		 	// int + String ==> String
		System.out.println("Ralston "+(num1+num2)+" Fremont");    	  	//BODMAS rule output is string
		 
		//System.out.println(num1+num2+b);                                     //Cant add anything to boolean
		System.out.println("Ralston "+ft1);                                    //String+ float --> String
		System.out.println(num1 + c);                                //*** Result of int + char --> int, Probably takes ASCII value of char while addition??  Need to explicitly cast the output back to char *******
		
		
		System.out.println(s1 + c);                                   //String + Char --> String
		
		
			
		
		
		
	}
	
	
	
}
