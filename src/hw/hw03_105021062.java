package hw;
import java.util.Scanner;

public class hw03_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J��v�~��");
		int a=scn.nextInt();
		if (a%4==0 && a%100!=0 || a%400==0)
		{
		System.out.println("�O�|�~");
		}else{
		System.out.println("�O���~");
		}
		
		

	}

}
