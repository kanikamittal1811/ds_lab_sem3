
public class Ques8 {
	public static void met8(int arr[]) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0 || arr[i]==-1) {
				System.out.println("Array contains 0 or -1");
				c=1;
				break;
			}
			
		}
		if(c==0) {
			System.out.println("Array is without 0 or -1");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5,6,7,0,1,2,-1};
		int arr2[]= {1,2,3,4};
		met8(arr1);
		met8(arr2);
		
	}

}
