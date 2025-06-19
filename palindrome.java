import java.util.Scanner;
class palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		StringBuilder sb= new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));	
		}
		String res = sb.toString();
		if(str.equals(res)){
			System.out.println("Palindrome");		
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}