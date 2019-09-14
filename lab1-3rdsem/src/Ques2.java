
public class Ques2 {
	public static void met2(int arr[], int a) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				System.out.println("Array contains the specified value "+a);
				c=1;
				break;
			}
			
			if(c==0 && i==arr.length-1) {
				System.out.println("Array does not contain the specified value");
				
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		int a=8;
		met2(arr,a);
	}

}
