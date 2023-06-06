import java.util.Scanner;

public class miniräknare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");
        System.out.println("3. Division (Första talet/andra talet)");
        System.out.println("4. Multiplikation");

        System.out.print("Bestäm vilken funktion du vill använda (svara med ett tal 1-4): ");
        int val = scanner.nextInt();
        if (val>4 || val<1){
            System.out.println("Du måste välja ett tal mellan 1 och 4!!");
            return;
        }

        System.out.print("Bestäm ditt första nummer: ");
        double nummer1 = scanner.nextDouble();

        System.out.print("Bestäm ditt andra nummer: ");
        double nummer2 = scanner.nextDouble();

        double Svar = 0;

        switch (val) {
            case 1:
                Svar = nummer1 + nummer2;
                break;
            case 2:
                Svar = nummer1 - nummer2;
                break;

            case 3:
                if (nummer2 != 0) {
                    Svar = nummer1 / nummer2;
                } else {
                    System.out.println("Du kan inte dela med noll!!");
                    System.exit(0);
                }
                break;
            default:
                return;

            case 4:
                Svar = nummer1 * nummer2;
        }

        System.out.println("Svaret blir: " + Svar);
    }
}
