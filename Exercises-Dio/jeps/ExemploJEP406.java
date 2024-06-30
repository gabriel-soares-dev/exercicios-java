package jeps;

public class ExemploJEP406 {
    public static void main(String[] args) {
        Shape shape = new Rectangle(5, 10);

        int area = switch (shape) {
            case Circle c -> (int) (Math.PI * Math.pow(c.getRadius(), 2));
            case Rectangle r -> r.getWidth() * r.getHeight();
            case Square s -> s.getSide() * s.getSide();
            default -> throw new IllegalArgumentException("Forma inválida");
        };

        System.out.println("Área: " + area);
    }

    static abstract class Shape {}

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
    }

    static class Rectangle extends Shape {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }

    static class Square extends Shape {
        private int side;

        public Square(int side) {
            this.side = side;
        }

        public int getSide() {
            return side;
        }
    }
}
