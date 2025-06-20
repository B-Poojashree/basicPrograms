public class multiplecatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int[] arr = {1, 2, 3};

            System.out.println(a / b);          
            System.out.println(arr[5]);       

        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range!");
        } catch (Exception e) {
            System.out.println("Some other error happened.");
        }

        System.out.println("Program continues...");
    }
}
