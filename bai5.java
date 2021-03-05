package baitap;
import java.util.Scanner;
public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number,sum = 0;
		do
		{
			System.out.println("Nhap so:");
			number = sc.nextInt();
			sum += number;
			if(sum>100)
				break;
		}while(number>0);
		System.out.println("Tong =" + sum);

	}

}
