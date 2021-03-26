import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int testCase = 20;

        System.out.println(a + b == testCase || b + c == testCase || a + c == testCase);
    }
}