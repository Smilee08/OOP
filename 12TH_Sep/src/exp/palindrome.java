package exp;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a =new Scanner(System.in);
//P_num=121 is a palindrome
//123 is not a palindrome
System.out.println("Enter the number:");
int P_num=a.nextInt();
a.close();
int remainder,reverse=0,temp;

System.out.println("Entered number:"+P_num);

temp=P_num;
while(P_num>0) {
	remainder=P_num%10;
	reverse=reverse*10+remainder;
	P_num/=10;	
}

if(temp==reverse) {
	System.out.println("Entered is a Palindrome.");
}else {
	System.out.println("Entered number is not a Palindrome.");
}

	}

}
