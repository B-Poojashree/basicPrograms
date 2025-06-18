
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
       
        Scanner sc = new Scanner(System.in);
       char op=sc.nextLine().charAt(0);
       int a= sc.nextInt();
       int b= sc.nextInt();
       int r;
       switch(op){
           case '+':  r=a+b ;break;
           case '-':  r=a-b ;break;
           case '*':  r=a*b ;break;
           case '/':  if(b==0){r=0 ;} else{r=a/b; } break;
           
          
           default : r= 0;
       }
       System.out.println(r);
    }  
}