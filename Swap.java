//Program for swapping of two numbers without using third variable

class Swap

{
    
	public static void main(String args[])

 	{

	        int a=10, b=20;

	        System.out.println("Before Swapping \n");

 	        System.out.println("Value of a: \n"+a);

	        System.out.println("Value of b:\n"+b);

	        a=a+b;
	
        b=a-b;
	
        a=a-b;
	
        System.out.println("After Swapping \n");
	
        System.out.println("Value of a: \n"+a);
 
	        System.out.println("Value of b:\n"+b);
 
       
    }

}