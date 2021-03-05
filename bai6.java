package baitap;
import java.util.Scanner;
public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp=1;
		long giai_thua =1; 
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap n:");
			n =sc.nextInt();
		}while (temp<=0);
        while(temp<=n) {
        	giai_thua *=temp;
        	temp ++;
        }
        System.out.println( n + "! = " + giai_thua);
 
	}

}
