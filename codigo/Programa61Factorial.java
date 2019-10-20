import java.util.Scanner;
//jacqueline Martinez
//25-06-19
//combinaciones
//permutaciones 

public class Programa61Factorial
{
	public static void main (String [] args)
	{
		long n, r;
		long p,c;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("cuantos elemento?: ");
		n = teclado.nextLong();
		
		System.out.print("De a cuantos se agrupan?: ");
		r = teclado.nextLong();
		
		p = factorial (n) / factorial (n-r);
		System.out.println("\npermutaciones: " + p);
		
		 //c = factorial (n) / (factorial (n-r) * factorial (r));
		//System.out.println("\nCombinaciones: " + c);
	}//main
		
		public static long factorial (long num)
		{
			long res = 1;
			for(int i=1; i<=num; i++)
			{
				res = res*i;
			}	
			
			return res;
		}	
		
}