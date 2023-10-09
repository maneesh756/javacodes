import java.util.Scanner;

public class LastPrimeBeforeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int lastPrime = 0;
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                lastPrime = i;
            }
        }

        if (lastPrime != 0) {
            System.out.println("The last prime number before " + number + " is: " + lastPrime);
        } else {
            System.out.println("There is no prime number before " + number);
        }

        scanner.close();
    }
}
