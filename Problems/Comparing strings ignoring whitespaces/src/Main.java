import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstString = scan.nextLine().replaceAll(" ", "");
        String secondString = scan.nextLine().replaceAll(" ", "");

        System.out.println(firstString.equals(secondString));
    }
}