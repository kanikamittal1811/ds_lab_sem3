
public class Ques5 {
	public static void met5(int arr[], int a,int p) {
		int arr1[]=new int[arr.length+1];
		int c=0;
		for (int i=0;i<arr1.length;i++) {
			if(i!=p-1) {
				arr1[i]=arr[c];
				c++;
			}
			else {
				arr1[i]=a;
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
		int arr[]= {1,2,3,5,6,7};
		int p=4;
		int a=4;
		met5(arr,a,p);
	}

}
