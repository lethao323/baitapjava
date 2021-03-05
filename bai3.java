package baitap;
import java.util.Scanner;
public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ten;
		System.out.println("nhap vao ten cua ban");
		ten = sc.nextLine();
		int ns ;
		System.out.println("nhap nam sinh cua ban");
		ns = sc.nextInt();
		if(2020-ns< 16)
		    System.out.println("ban "+ten+" o tuoi vi thanh nien");
		if(2020-ns >=18)
		    System.out.println("ban "+ten+" da gia");
		else
		    System.out.println("ban " +ten +" o do tuoi truong thanh");
	}

}
