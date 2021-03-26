import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int startIndex = scan.nextInt();
        int endIndex = scan.nextInt();

        System.out.println(word.substring(startIndex, endIndex + 1));

    }
}