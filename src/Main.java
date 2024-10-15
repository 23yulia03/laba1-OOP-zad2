public class Main {
    public static void main(String[] args) {
        // ������� ����� � ��������� ������������
        Point pointA = new Point(3, 5, 'A');
        System.out.println("����� A: " + pointA);

        // ������� ����� � ���������� ������������
        Point randomPoint = new Point('B');
        System.out.println("��������� ����� B: " + randomPoint);

        // ���������� ����� A
        pointA.move(2, 3);
        System.out.println("����� ����������� ����� A: " + pointA);

        // ��������� ���������� ����� ������� A � B
        double distanceAB = pointA.distanceTo(randomPoint);
        System.out.println("���������� ����� ������� A � B: " + distanceAB);

        // ������� ������������ ����� ������������ ������ ���������
        Point symmetricPointA = pointA.createSymmetric();
        System.out.println("������������ ����� A ������������ ������ ���������: " + symmetricPointA);

        // ��������� ��������� ��������� ����� A � B
        boolean areEqual = pointA.equals(randomPoint);
        System.out.println("����� A � B �����? " + areEqual);

        // ���������� ���������� �� ����� A � ����������� �� ������ ���������
        boolean isCloserToOrigin = pointA.compare(new Point(7, 9, 'C'));
        System.out.println("����� A ����� � ������ ���������, ��� ����� (7,9)? " + isCloserToOrigin);
    }
}
