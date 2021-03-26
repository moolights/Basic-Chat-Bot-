import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reesesCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean weekendParty = weekend && reesesCups >= 15 && reesesCups <= 25;

        boolean regularParty = !weekend && reesesCups >= 10 && reesesCups <= 20;

        System.out.println(weekendParty || regularParty);
    }
}