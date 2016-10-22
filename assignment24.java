import java.util.Scanner;

public class assignment24 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any three numbers: ");
		a=scn.nextInt();
		b=scn.nextInt();
		c=scn.nextInt();
		String sup = (a>b && a>c)?"a is greater":(b>a && b>c)?"b is greater":"c is greater";
		System.out.println(sup);

	}

}
