package concepts;

public class StaticDemo {

    static int a = 10;

    static {
        System.out.println("Static block initialized.");
    }

    static void m1() {
        System.out.println("from m1");

    }
}
class StaticDemoChild {
        static
        {
                System.out.println("Static block initialized in child.");
        }
        public static void main(String[] args)
        {
                System.out.println("Value of a : "+ StaticDemo.a);
                StaticDemo.m1();

        }
}

