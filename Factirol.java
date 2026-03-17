public class Factirol {
    public static int Fact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * Fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 9;
        int result = Fact(n);
        System.out.println("Factorial of " + n + " is " + result);
    }
}

