package java_programming;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {

		//reverse number also same as given num (ex: 121 -->reverse 121)
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r,s=0;
		int t = num;
		while(num>0)
		{
			r = num%10;  //percentage of given num and storing that remainder in r
			System.out.print(r+ " ");
			num = num/10;  //dividing num
			System.out.print(num+ " ");
			s = s*10+r;	
			System.out.print(s+ " ");
			 	
		}
		if(t==s)
		{
			System.out.println("Given number is palindrom:");
		}
		else
		{
			System.out.println("Given num is not palindrom");
		}
	}

}
