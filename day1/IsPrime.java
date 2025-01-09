package week1.day1;

public class IsPrime {
	
	     public static void main(String[] args) 
	     {
	         int num =7;
	         for (int i = 2; i < num -1 ; i++) 
	         { 
	             if ( num%i == 1 ) 
	             {
	            	 System.out.println(num + "is Prime");
	            	 break;
	             } 
	             else 
	             {
	            	 System.out.println(num + " is not a Prime");
	            	 break;
	             }
			}
				
			}
	}

