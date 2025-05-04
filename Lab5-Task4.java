public class User {
    public int age;
    public String name;

    public static void main(String[] args) {
        User user = new User();
        user.name = "Teo";
        user.age = 24;

        System.out.println("My name is " + user.name + " and I'm " + user.age + " years old.");
    }
}
