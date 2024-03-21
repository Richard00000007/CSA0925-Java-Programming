abstract class Shape {
    abstract double getArea();
    abstract double getVolume();
}

class Sphere extends Shape {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone extends Shape {
    double radius;
    double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double getArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    double getVolume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

class Cylinder extends Shape {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cone cone = new Cone(3, 4);
        Cylinder cylinder = new Cylinder(2, 6);

        System.out.println("Area and Volume of Sphere:");
        System.out.println("Area: " + sphere.getArea());
        System.out.println("Volume: " + sphere.getVolume());

        System.out.println("\nArea and Volume of Cone:");
        System.out.println("Area: " + cone.getArea());
        System.out.println("Volume: " + cone.getVolume());

        System.out.println("\nArea and Volume of Cylinder:");
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
