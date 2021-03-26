import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;
        int number = scan.nextInt();
        for (int i = 0; i < number; i++) {
            int input = scan.nextInt();

            if (input % 6 == 0) {
                total += input;
            }
        }
        System.out.println(total);
    }
}