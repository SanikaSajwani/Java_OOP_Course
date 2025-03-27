// superclass
public class LengthDetail {
    float length;
    float width;

    public LengthDetail() {
        this.length = -1;
        this.width = -1;
    }

    public LengthDetail(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public LengthDetail(LengthDetail LD) {
        this.length = LD.length;
        this.width = LD.width;
    }

    public float perimeter_shape() {
        return (2 * (length + width));
    }
}

// subclass 
public class trapezium extends LengthDetail {
    float a;
    float b;

    public trapezium() {
        super();
        this.a = -1;
        this.b = -1;
    }

    public trapezium(float length, float width, float a, float b) {
        super(length, width);
        this.a = a;
        this.b = b;
    }

    public trapezium(trapezium LD) {
        super(LD.length, LD.width);
        this.a = LD.a;
        this.b = LD.b;
    }

    public float total_length() {
        return super.perimeter_shape() + a + b;
    }

    public void display(){
       System.out.println("Length: " + length + " cm");
       System.out.println("Width: " + width + " cm");
       System.out.println("a: " + a + " cm");
       System.out.println("b: " + b + " cm");
       System.out.println("Perimeter: " + total_length() + " cm");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        trapezium obj1 = new trapezium();
        System.out.println("Trapezium 1: "); 
        obj1.display();

        trapezium obj2 = new trapezium(5.5, 7.56, 3.45, 1.50);
        System.out.println("Trapezium 2: ");
        obj2.display());

        trapezium obj3 = new trapezium(obj2);
        System.out.println("Trapezium 3: ");
        obj3.display();
    }
}

