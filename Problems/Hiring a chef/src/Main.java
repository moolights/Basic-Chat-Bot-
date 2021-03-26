import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String chefName;
        int age;
        String educationLevel;
        int yearsExp;
        String cuisineType;

        chefName = scan.next();
        age = scan.nextInt();
        scan.nextLine();
        educationLevel = scan.next();
        yearsExp = scan.nextInt();
        scan.nextLine();
        cuisineType = scan.next();

        System.out.println("The form for " + chefName + " is completed. We will contact you " +
                "if we need a chef that cooks " + cuisineType + " dishes.");

    }
}