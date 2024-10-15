public class Main {
    public static void main(String[] args) {
        // Создаем точку с заданными координатами
        Point pointA = new Point(3, 5, 'A');
        System.out.println("Точка A: " + pointA);

        // Создаем точку с случайными координатами
        Point randomPoint = new Point('B');
        System.out.println("Случайная точка B: " + randomPoint);

        // Перемещаем точку A
        pointA.move(2, 3);
        System.out.println("После перемещения точки A: " + pointA);

        // Вычисляем расстояние между точками A и B
        double distanceAB = pointA.distanceTo(randomPoint);
        System.out.println("Расстояние между точками A и B: " + distanceAB);

        // Создаем симметричную точку относительно начала координат
        Point symmetricPointA = pointA.createSymmetric();
        System.out.println("Симметричная точка A относительно начала координат: " + symmetricPointA);

        // Проверяем равенство координат точек A и B
        boolean areEqual = pointA.equals(randomPoint);
        System.out.println("Точки A и B равны? " + areEqual);

        // Сравниваем расстояние до точки A с расстоянием до начала координат
        boolean isCloserToOrigin = pointA.compare(new Point(7, 9, 'C'));
        System.out.println("Точка A ближе к началу координат, чем точка (7,9)? " + isCloserToOrigin);
    }
}
