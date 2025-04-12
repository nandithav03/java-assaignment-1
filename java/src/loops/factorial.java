package loops;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		int fact=1;
		while(num!=0) {
			 fact=fact*num;
			 num--;
		}
		System.out.println("the factorial of given number is:" +fact);
		}

}
