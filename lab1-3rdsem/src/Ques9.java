
public class Ques9 {
	
	public static int fac(int n) {
		
		if(n==1) {
			return 1;
		}
		else {
			return(n*fac(n-1));
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fac(6));
	}

}
