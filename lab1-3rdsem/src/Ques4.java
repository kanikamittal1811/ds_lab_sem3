
public class Ques4 {
	public static void met4(int arr[], int a) {
		int x=0;
		for (int j=0;j<arr.length;j++) {
			if(arr[j]==a) {
				x++;
				
			}
			
		}
		int arr1[]=new int[arr.length-x];
		int c=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]!=a) {
				arr1[c]=arr[i];
				c++;
			}
		}
		System.out.print("{");
		for(int k=0;k<arr1.length;k++) {
			System.out.print(arr1[k]+",");
		}
		System.out.print("}");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,5,7,5,8,5};
int a=5;
met4(arr,a);
	}

}
