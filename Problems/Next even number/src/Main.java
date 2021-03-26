import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enteredNumber = scanner.nextInt();
        int remainder = enteredNumber % 2;
        int newNumber = enteredNumber + (2 - remainder);

        System.out.println(newNumber);
    }
}