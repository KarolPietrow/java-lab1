public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(-1,0);
        Point p2 = new Point(6,0);
        Segment s1 = new Segment(p1,p2);
        System.out.println("Długość odcinka: " + s1.getLength());
    }
}