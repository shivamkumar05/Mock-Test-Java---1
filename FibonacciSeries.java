import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        int n1 = 0;
        int n2 = 1;

        System.out.print("Fibonacci Series up to " + numTerms + " terms: ");

        for (int i = 1; i <= numTerms; i++) {
            System.out.print(n1 + " ");

            int nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }
    }
