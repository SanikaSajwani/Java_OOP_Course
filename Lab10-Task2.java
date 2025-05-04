abstract class Animals {
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals {
    void cats() {
        System.out.println("Cats meow");
    }
    
    void dogs() {} 
}

class Dogs extends Animals {
    void dogs() {
        System.out.println("Dogs bark");
    }
    
    void cats() {}
}

public class Task2 {
    public static void main(String[] args) {
        Animals cat = new Cats();
        Animals dog = new Dogs();

        cat.cats();
        dog.dogs();
    }
}
