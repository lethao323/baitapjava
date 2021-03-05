package baitap;
import java.util.Scanner;
public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi;
		int dodai ,sokytuinhoa =0,sokytuinthuong=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Nhap vao chuoi bat ky:");
		chuoi = sc.nextLine();
		
		//===========================
		dodai =chuoi.length();
		System.out.println("Chuoi " + chuoi + " co do dai = " + dodai);
		//============================
		for(int i=0;i<chuoi.length();i++) {
			if(Character.isUpperCase(chuoi.charAt(i))) {
				sokytuinhoa++;
			}
			if(Character.isLowerCase(chuoi.charAt(i))) {
				sokytuinthuong++;
			}
		}
	    System.out.println("Trong chuoi " + chuoi + " co " + sokytuinhoa + " ky tu in hoa, " + "co " + sokytuinthuong + " ky tu in thuong " );
	}

}
