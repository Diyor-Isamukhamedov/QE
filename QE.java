import java.util.Scanner;

public class QE {

    public static void main(String[]args) {
         /*
        A program that calculates all the roots of
        a quadratic equation
         */
        double a, b, c;
        double D;
        System.out.println("\t\t \\ \\ \\ WELCOME DEAR GUEST! \\ \\ \\ ");
        System.out.println("\n\tThe program solves an equation of the form:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("\tHere, \'a\', \'b\', and \'c\' are real numbers and \'a\' can't be equal to 0.");
        System.out.println("\tThe formula for calculating the roots of a quadratic equation:");
        System.out.println("x1,2 = (-b ± √(b^2-4ac)) / (2a)");
        System.out.println("\tThe term (b^2-4ac) is known as the discriminant of a quadratic equation.\n"
                + "It specifies the nature of roots. That is,");
        System.out.println("1. If discriminant > 0, roots are real and different;");
        System.out.println("2. If discriminant = 0, roots are real and equal;");
        System.out.println("3. If discriminant < 0, roots are complex and different.");
        System.out.println("\tENTER a, b and c: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a = ");
        a = in.nextDouble();
        System.out.println("Enter b = ");
        b = in.nextDouble();
        System.out.println("Enter c = ");
        c = in.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("\tMy congratulations!" +
                    ". The roots of equation : x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("The equation has a single root: x = " + x);
        }
        else {
            System.out.println("I'm sorry. Equation has no real roots!");
        }
    }
}
