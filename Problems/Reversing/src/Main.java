import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number % 100 / 10;
        int lastDigit = number % 10;

        int newNumber = lastDigit * 100 + secondDigit * 10 + firstDigit;
        System.out.println(newNumber);
    }
}