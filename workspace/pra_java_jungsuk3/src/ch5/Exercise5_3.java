package ch5;

public class Exercise5_3 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50}; 
		int sum = 0;
		
		/*
		알맞은 코드를 넣어 완성하시오 (1) .
		*/
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum="+sum);

	}

}
