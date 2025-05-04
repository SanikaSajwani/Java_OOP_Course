// CPU.java
public class CPU {
    double price;

    public CPU(double price) {
        this.price = price;
    }

    class Processor {
        double cores;
        String manufacturer;

        public Processor(double cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        public double getCache() {
            return 4.2;
        }
    }

    protected class RAM {
        double memory;
        String manufacturer;

        public RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public double getClockSpeed() {
            return 5.3;
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(299.99);

        CPU.Processor proc = cpu.new Processor(8, "Intel");
        CPU.RAM ram = cpu.new RAM(16, "Kingston");

        System.out.println("CPU price: $" + cpu.price);
        System.out.println("Processor cores: " + proc.cores + ", manufacturer: " + proc.manufacturer);
        System.out.println("Cache size: " + proc.getCache() + " MB");
        System.out.println("RAM size: " + ram.memory + " GB, manufacturer: " + ram.manufacturer);
        System.out.println("Clock speed: " + ram.getClockSpeed() + " GHz");
    }
}
