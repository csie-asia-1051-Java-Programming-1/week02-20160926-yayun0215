package ex;
import java.util.Scanner;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021062 鄭雅韵
 */

public class ex03_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float a=297;
		a = a-(297%30);
		if (a<30){
			System.out.println("免費");
		}else{
			if(a>=30 && a<=120 )
				System.out.println(a*30);
			else if(a>120 && a<240)
			{		a=a-120;
					System.out.println(a*4/3+120);
			}
			else if(a>240)
			{
				a=a-210;
				System.out.println(a*2+240);
			}
	  }
	 }
	}

	


