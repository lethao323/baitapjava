package baitap;
import java.util.Scanner;
import java.text.DecimalFormat;
public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,number;
		float tbc;
		Scanner sc=new Scanner(System.in);
		
		DecimalFormat DecimalFormat =new DecimalFormat("#.##");
		System.out.println("Nhap so nguyen n:");
		n =sc.nextInt();
		//==============
		for(int count=1;count <=n;count++) {
			System.out.println("Nhap so thu " + count + " : ");
			number = sc.nextInt();
			sum +=number;
		}
		tbc = (float) sum/n;
		System.out.println("Trung binh cong = " + DecimalFormat.format(tbc));
	}

}
