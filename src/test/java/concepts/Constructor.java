package concepts;

public class Constructor {

     String name;
     int age;

     Constructor(String name, int age) {
         this.name = name;
         this.age = age;
     }

     Constructor () {
         this.name = "JohnDoe";
         this.age = 40;
     }

    public static void main(String[] args) {
        Constructor obj = new Constructor("John", 30); // parameterized constructor
        System.out.println(obj.name);
        System.out.println(obj.age);

        Constructor obj1 = new Constructor(); // default constructor
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }
}
