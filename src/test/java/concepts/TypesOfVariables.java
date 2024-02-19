package concepts;

public class TypesOfVariables {

    int a = 10; // instance variable
    static  int c = 30; // static variable

    public static void main(String[] args) {
        int b = 20; // local variable
        TypesOfVariables obj = new TypesOfVariables();
        System.out.println(obj.a); // instance variable
        System.out.println(b); // local variable
        System.out.println(c); // static variable
    }
}
