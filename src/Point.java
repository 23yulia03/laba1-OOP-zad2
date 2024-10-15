import java.util.Random;

public class Point {
    private int x; // абсцисса точки
    private int y; // ордината точки
    private char name; // имя точки

    // Конструктор для инициализации точки с заданными координатами и именем
    public Point(int x, int y, char name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    // Конструктор для создания точки с заданным именем и случайными координатами
    public Point(char name) {
        Random random = new Random();
        this.x = random.nextInt(100); // случайное значение по оси X от 0 до 99
        this.y = random.nextInt(100); // случайное значение по оси Y от 0 до 99
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getName() {
        return name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setName(char name) {
        this.name = name;
    }

    // Метод для перемещения точки
    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    // Метод для вычисления расстояния до другой точки
    public double distanceTo(Point otherPoint) {
        int deltaX = otherPoint.getX() - x;
        int deltaY = otherPoint.getY() - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Метод для создания симметричной точки относительно начала координат
    public Point createSymmetric() {
        return new Point(-this.x, -this.y, this.name);
    }

    // Переопределение метода toString() для описания точки
    @Override
    public String toString() {
        return "Точка {" +
                "x = " + x +
                ", y = " + y +
                ", имя = " + name +
                '}';
    }

    // Метод для проверки равенства координат с заданной точкой
    public boolean equals(Point otherPoint) {
        return this.x == otherPoint.getX() && this.y == otherPoint.getY();
    }

    // Метод для сравнения расстояний до заданной точки
    public boolean compare(Point otherPoint) {
        double distanceToOther = this.distanceTo(otherPoint);
        double distanceFromOrigin = this.distanceTo(new Point(0, 0, 'O')); // точка в начале координат
        return distanceToOther < distanceFromOrigin; // возвращает true, если расстояние меньше
    }
}
