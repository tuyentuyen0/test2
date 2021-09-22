package baitap1;

import java.util.Scanner; ;


public class bai2 {

	private int id ;
	private int tuoi ;
	private float diemvan , diemtoan, diemtb ;
	public static void main(String[] args) 
	{
      Scanner input = new Scanner (System.in);
      Scanner scanner =  new Scanner (System.in);
      
      String name ;
      System.out.println("Nhap ten cua ban");
      name = scanner.nextLine();
      System.out.println(name);
      
      int id;
      System.out.println("Nhap id cua ban");
      id = input.nextInt();
      System.out.println(id);
      
      int tuoi;
      System.out.println("Nhap tuoi cua ban");
      tuoi = input.nextInt();
      System.out.println(tuoi);
      
      float diemvan, diemtoan, diemtb;
      
      System.out.println("Nhap diem van cua ban");
      diemvan = input.nextFloat();
      System.out.println(" diemvan la" + diemvan);
      
      System.out.println("Nhap diem toan cua ban");
      diemtoan = input.nextFloat();
      System.out.println(" diemtoan la" + diemtoan);
      
      diemtb = ( diemvan +  diemtoan )/ 2 ;
      System.out.println(" diemtb la" + diemtb);
      
	}

}
