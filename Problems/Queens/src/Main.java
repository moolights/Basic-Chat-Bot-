import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        int position1 = Math.abs(x1 - x2);
        int position2 = Math.abs(y1 - y2);

        if (x1 == x2 || y1 == y2 || position1 == position2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}