import java.util.Scanner;

public class checkException {
    public static void main(String[] args) {
        Integer[] arr = {10, 11, 15,null , 25};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to divide: ");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            try {
                int res = division(n, arr[i]);
                System.out.println( res);
            } catch (NullPointerException e) {
                //System.out.println("Cannot divide by zero at index " + i);
                e.printStackTrace();
            }
        }
    }

    public static int division(int n, Integer num) throws NullPointerException {
        if (num == null) {
            throw new NullPointerException("Value is null");
        } else {
            return n / num;
        }
    }
}
