
public class Ques7 {
	public static void met7(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			int c=0;
			for (int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c>1) {
				System.out.println("Frequency of "+" "+arr[i]+" = "+c);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,4,4,5,5,6,7,8,8,8,8};
met7(arr);
	}

}
