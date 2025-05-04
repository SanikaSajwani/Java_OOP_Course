public class Tank {
    private int capacity;

    public Tank() {
        this.capacity = 0;
    }

    public void fill(int amount) {
        capacity += amount;
        System.out.println("Tank filled. Current level: " + capacity);
    }

    public void empty(int amount) {
        if (amount <= capacity) {
            capacity -= amount;
        } else {
            capacity = 0;
        }
        System.out.println("Tank emptied. Current level: " + capacity);
    }

    @Override
    protected void finalize() throws Throwable {
        if (capacity != 0) {
            System.out.println("Warning: Tank not empty before cleanup. Level: " + capacity);
        } else {
            System.out.println("Tank is properly emptied before cleanup.");
        }
        super.finalize();
    }

    public static void main(String[] args) {
        Tank t = new Tank();
        t.fill(50);
        t.empty(20);
        t = null;

        System.gc();
    }
}
