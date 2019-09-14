
public class Ques3 {
	public static void met3(int arr[],int a) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				System.out.println("index of element a is = "+ i);
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		int a=8;
		met3(arr,a);
		
	}

}
