package calculator;
import java.util.*;
public class caluclator 
	{
		public static void main( String[] args ) throws Exception
	    {
	        Scanner scan = new Scanner(System.in);
	        char op = 'y';
		        while(true) {
		        System.out.println("Enter First number:\n");
		        int a = scan.nextInt();
		        System.out.println("Enter Second number:\n");
		        int b = scan.nextInt();
		        System.out.println("Enter operation choice:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus\n");
		        int oc = scan.nextInt();
		        oc=oc-1;
		        if(oc<0 || oc>5) throw new Exception("Enter a valid option.");
		        	int[] x = new int[5];
					int[] operations = {
							x[0] = calc.add(a,b),
		        			x[1] = calc.sub(a,b),
		        			x[2] = calc.mul(a,b),
		        			x[3] = calc.div(a,b),
		        			x[4] = calc.md(a,b),
		        	};
					System.out.println(x[oc]);
					System.out.println("Exit (0):");
					int ch = scan.nextInt();
					if(ch==0) {
						break;
					}
		        }
		        
	    }
	}