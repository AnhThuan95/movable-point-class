public class TestMovablePoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        p1.setXY(1, 1);
        System.out.println("The point: " + p1.toString());

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setXY(2, 3);
        movablePoint.setSpeed(1,1);
        System.out.println("The point: " + movablePoint.toString());
        movablePoint.move();
        System.out.println("New point: " + movablePoint.toString());
    }
}
