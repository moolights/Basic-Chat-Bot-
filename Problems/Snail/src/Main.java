import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int daySteps = scanner.nextInt();
        int nightSteps = scanner.nextInt();

        System.out.println((distance - nightSteps - 1) / (daySteps - nightSteps) + 1);
    }
}