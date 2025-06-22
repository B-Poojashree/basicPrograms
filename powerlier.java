import java.util.*;
public class powerlier {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int x= sc.nextInt();
		int y=sc.nextInt();
		int a;
		if(y%2==1){
			a=(y*x);			
		}
		else{
			a=y/2;	
		}
		System.out.println(x + " power " + y  + " = "+ (power(x,a)*2));
				
	}	
	public static int power(int x,int a){
		if(a==0) { return 1;}
		else{return x*power(x,a-1);}
	}
}