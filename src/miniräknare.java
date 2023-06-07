import java.util.Scanner;
import java.lang.Math;

public class miniräknare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double nummer1, nummer2;
        while (true) {

        System.out.println("Simpel miniräknare");
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");
        System.out.println("3. Division (Första talet/andra talet)");
        System.out.println("4. Multiplikation");
        System.out.println("5. Pythagoras sats");
        System.out.println("6. Grader till radianer");
        System.out.println("7. Radianer till grader");

        System.out.print("Bestäm vilken funktion du vill använda (svara med ett tal 1-7): ");
        int val = scanner.nextInt();
        if (val>7 || val<1){
            System.out.println("Du måste välja ett tal mellan 1 och 7!!");
            return;
        }




        String Svar = "";

        switch (val) {
            case 1:
                System.out.print("Bestäm ditt första nummer: ");
                nummer1 = scanner.nextDouble();

                System.out.print("Bestäm ditt andra nummer: ");
                nummer2 = scanner.nextDouble();

                Svar = nummer1 + nummer2 + "";
                break;
            case 2:
                System.out.print("Bestäm ditt första nummer: ");
                nummer1 = scanner.nextDouble();

                System.out.print("Bestäm ditt andra nummer: ");
                nummer2 = scanner.nextDouble();

                Svar = nummer1 - nummer2 + "";
                break;

            case 3:
                System.out.print("Bestäm ditt första nummer: ");
                nummer1 = scanner.nextDouble();

                System.out.print("Bestäm ditt andra nummer: ");
                nummer2 = scanner.nextDouble();

                System.out.println(nummer2);
                System.out.println(nummer2 <= 0);
                if (nummer2 > 0) {
                    Svar = nummer1 / nummer2 + "";
                } else {
                    Svar = "Du kan inte dela med noll eller ett tal mindre än noll!!";
                }

                break;


            case 4:
                System.out.print("Bestäm ditt första nummer: ");
                nummer1 = scanner.nextDouble();

                System.out.print("Bestäm ditt andra nummer: ");
                nummer2 = scanner.nextDouble();

                Svar = nummer1 * nummer2 + "";
                break;
            case 5:
                System.out.print("Bestäm ditt första nummer: ");
                nummer1 = scanner.nextDouble();

                System.out.print("Bestäm ditt andra nummer: ");
                nummer2 = scanner.nextDouble();

                Svar = (Math.sqrt(nummer1 * nummer1 + nummer2 * nummer2)) + "";
                System.out.println("Hypotenusan är " + Svar + " längdenheter");
                break;
            case 6:
                System.out.print("Bestäm hur många grader vill göra till radianer?: ");
                nummer1 = scanner.nextDouble();

                Svar = (Math.PI/180) * nummer1 + " radianer";
                break;
            case 7:
                System.out.println("Hur många radianer vill du göra till grader?: ");
                nummer1 = scanner.nextDouble();

                Svar = (180/Math.PI) * nummer1 + " grader";

            default:
                break;
        }

        System.out.println("Svaret blir: " + Svar);


        System.out.println("vill du köra igen?(ja/nej)");
        String igen = scanner.next();
        if (igen.toLowerCase().equals("ja")){

             } else return;
        }
    }
}
