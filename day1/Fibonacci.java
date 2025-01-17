package week1.day1;

public class Fibonacci {
	

		public static void main(String[] args) 
		{
			int range = 8;
			int start = 0;
			int next = 1 ;
			for (int i = 1;i <= range ; i++) {
				System.out.println(start + "");
				int cont = start + next;
				start = next;
				next = cont ;
			}

		}

	}


