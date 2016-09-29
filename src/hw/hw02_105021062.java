package hw;
import java.util.Scanner;
public class hw02_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入性別及身高");
		float a=scn.nextInt();
		float b=scn.nextInt();
		if(a<=1)
		{
			System.out.println((b-80)*0.7);
		}else if(a>=2)
		{
			System.out.println((b-70)*0.6);
		}
		}
		}


