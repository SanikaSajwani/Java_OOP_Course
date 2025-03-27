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
}

// Main Class
public class Main {
    public static void main(String[] args) {
        trapezium obj1 = new trapezium();
        System.out.println("Perimeter of obj1: " + obj1.perimeter_shape());

        trapezium obj2 = new trapezium(5.5, 7.56, 3.45, 1.50);
        System.out.println("Perimeter of obj2: " + obj2.perimeter_shape());

        trapezium obj3 = new trapezium(obj2);
        System.out.println("Perimeter of obj3: " + obj3.perimeter_shape());
    }
}

