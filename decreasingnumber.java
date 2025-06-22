public class decreasingnumber {
    public static void main(String[] args) {
        int n = 5;
        printDescending(n);      }

    static void printDescending(int n) {
        if (n == 0) return;        
        System.out.print(n + " ");  
        printDescending(n - 1);         }
}
