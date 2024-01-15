import static java.lang.Integer.parseInt;
import static java.lang.System.*;

public class commandLineArgs {
    public static void main(String[] args) {
        out.println("Hello World");

        int a, b,c;
        a= parseInt(args[0]);
        b= parseInt(args[1]);
        c= a+b;

        out.println("Number of arguments passed: "+args.length);
        out.println("Sum of two numbers: "+c);
    }
}
