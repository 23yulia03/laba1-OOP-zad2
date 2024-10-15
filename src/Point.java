import java.util.Random;

public class Point {
    private int x; // �������� �����
    private int y; // �������� �����
    private char name; // ��� �����

    // ����������� ��� ������������� ����� � ��������� ������������ � ������
    public Point(int x, int y, char name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    // ����������� ��� �������� ����� � �������� ������ � ���������� ������������
    public Point(char name) {
        Random random = new Random();
        this.x = random.nextInt(100); // ��������� �������� �� ��� X �� 0 �� 99
        this.y = random.nextInt(100); // ��������� �������� �� ��� Y �� 0 �� 99
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

    // ����� ��� ����������� �����
    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    // ����� ��� ���������� ���������� �� ������ �����
    public double distanceTo(Point otherPoint) {
        int deltaX = otherPoint.getX() - x;
        int deltaY = otherPoint.getY() - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // ����� ��� �������� ������������ ����� ������������ ������ ���������
    public Point createSymmetric() {
        return new Point(-this.x, -this.y, this.name);
    }

    // ��������������� ������ toString() ��� �������� �����
    @Override
    public String toString() {
        return "����� {" +
                "x = " + x +
                ", y = " + y +
                ", ��� = " + name +
                '}';
    }

    // ����� ��� �������� ��������� ��������� � �������� ������
    public boolean equals(Point otherPoint) {
        return this.x == otherPoint.getX() && this.y == otherPoint.getY();
    }

    // ����� ��� ��������� ���������� �� �������� �����
    public boolean compare(Point otherPoint) {
        double distanceToOther = this.distanceTo(otherPoint);
        double distanceFromOrigin = this.distanceTo(new Point(0, 0, 'O')); // ����� � ������ ���������
        return distanceToOther < distanceFromOrigin; // ���������� true, ���� ���������� ������
    }
}
