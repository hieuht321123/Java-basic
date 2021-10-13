package flowcontrol;

public class TestArray {
	public static void main(String[] args) {
		
		int [] arr = {3,4,23,2,433,3,2,212};
		
		System.out.println(findByMaxArr(arr));
		
		int [][] arr2 = {{1,3,4,6}, {3,6,54,32}};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr2[i][j] +" ");
				
			}
			System.out.println();
		}
			
	}
	public static int findByMaxArr(int arr[]) {
		int max = arr[0];
	for (int i = 0; i < arr.length; i++) {
			if(arr [i] > max) {
				max = arr [i];
			}
		}

	return max;
	}
  }
	
	

