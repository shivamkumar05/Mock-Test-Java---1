import java.util.Scanner;
public class AvgNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();

        int sum = 0;
        int i = 0;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            sum += number;
            i++;
        } while (i < count);

        double average = (double) sum / count;

        System.out.println("Average of a list is : " + average);

    }

}
