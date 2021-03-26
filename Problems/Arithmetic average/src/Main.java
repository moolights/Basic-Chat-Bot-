import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        double total = 0;
        double avg = 0.0;
        int start = scan.nextInt();
        int end = scan.nextInt();

        for (; start <= end; start++) {
            if (start % 3 == 0) {
                ++count;
                total += start;
            }
        }
        avg = total / count;
        System.out.println(avg);
    }
}