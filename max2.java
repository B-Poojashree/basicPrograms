import java.util.*;
class max2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		//System.out.println(arr);
		Arrays.sort(arr);
		System.out.println(arr[n-1]);
	}
}