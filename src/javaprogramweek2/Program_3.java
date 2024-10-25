package javaprogramweek2;

/**
 * Write a Java programme using the following steps.
 *  Declare one instance and one static variable.
 * Declare one instance method.
 *  Declare one static method.
 *  Call both instance and static variables into both instance and static methods inside the print statement.
 *  Declare the Main method.
 *  Call both instance and static methods into the Main method and run the programme.
 */

public class Program_3 {

    //3.1 Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Program_3.surname);
    }

    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Program_3 programme_3 = new Program_3();
        System.out.println(programme_3.name);
        System.out.println(surname);
    }

    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Program_3 programme_3 = new Program_3();
        programme_3.instanceMethod();
        staticMethod();
    }


}
