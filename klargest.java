import java.util.*;
class klargest {
	public static void main(String args[]){
		int[] arr={3,4,5,6,2,9,7,2,10};
		Arrays.sort(arr);
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int l=arr.length;
		System.out.println(arr[l-k]);
	}
}