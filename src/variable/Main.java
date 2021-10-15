package variable;

public class Main {
	public static void main(String[] args) {
		MaxMinArray maxMinArr = new MaxMinArray(5);
		
		maxMinArr.input();
		System.out.println(maxMinArr.findMax());

		System.out.println(maxMinArr.findMin());
	}
}
