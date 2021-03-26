import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String testCase = "J";
        String input = scan.nextLine();

        System.out.println(input.toUpperCase().startsWith(testCase));
    }
}