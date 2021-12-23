public class MethodParameter {

    public static void main(String[] args) {
        sayHello("Kingkin", "Fajar");
        sayHello("Andik", "Firman");
        sayHello("Adam", "Far");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
