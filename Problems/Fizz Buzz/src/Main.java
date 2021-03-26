import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        int end = scan.nextInt();

        for (; start <= end; start++) {
            if (start % 5 == 0 && start % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (start % 3 == 0) {
                System.out.println("Fizz");
            } else if (start % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(start);
            }
        }
    }
}