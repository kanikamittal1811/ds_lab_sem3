
public class Ques6 {
	public static void met6(int arr[]) {
		int max=arr[0];
		int min=arr[0];
		for (int i=1;i<arr.length;i++)
		{
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Maximum value is = "+ max);
		System.out.println("Minimum value is = "+ min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		met6(arr);
	}

}
