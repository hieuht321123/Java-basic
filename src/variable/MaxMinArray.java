package variable;

import java.util.Scanner;

public class MaxMinArray {
   private	int[] arr;
   
   /**
    * khoi tao gia tri cho bien instance khi bat dau khoi tao class bien instance se duoc khoi tao
    * */
   public MaxMinArray(int lenght) {
	   arr = new int[lenght];
   }
   
   /*
    * Nhap gia tri cho mang
    * 
    * */
   
   public void input() {
	   Scanner sc = new Scanner(System.in);
	   for(int i =0; i < arr.length; i++) {
		   System.out.println("Nhap phan tu thu: " +i);
		   arr[i] = sc.nextInt();
	   }
	   
   }
   /*
    * findMaxById
    * */
   public int findMax() {
	   int max= arr[0];
	   for (int i = 0; i < arr.length; i++) {
		if(max < arr[i]) {
			max = arr[i];
		}
	
		   
	}
	return max;
	   
   }
   /*
    * findMaxById
    * */
   public int findMin() {
	   int min= arr[0];
	   for (int i = 0; i < arr.length; i++) {
		if(min > arr[i]) {
			min = arr[i];
		}
	}
	return min;
	   
   }
   
}
