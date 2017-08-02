import java.io.Console;

/**
 * Created by Guest on 8/2/17.
 */
public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Enter Rectangle length: ");
        String stringLength = myConsole.readLine();
        int intLength = Integer.parseInt(stringLength);

        System.out.println("Enter rectangle width: ");
        String stringWidth = myConsole.readLine();
        int intWidth = Integer.parseInt(stringWidth);

        Rectangle rectangle = new Rectangle(intLength, intWidth);
        boolean squareResult = rectangle.isSquare();
        System.out.println("Is your rectangle a square too? " + squareResult + "!");
    }
}
