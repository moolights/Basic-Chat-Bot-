import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int first = input / 1000;
        int second = input % 1000 / 100;
        int third = input % 100 / 10;
        int fourth = input % 1000 % 10;

        if (first == fourth && second == third) {
            System.out.println("1");
        } else {
            System.out.println("117");
        }
    }
}