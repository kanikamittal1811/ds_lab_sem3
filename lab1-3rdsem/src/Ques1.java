
public class Ques1 {
	public static void met(int arr[]) {
			int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println("Sum of all elements of array is = "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		met(arr);
		
	}

}
