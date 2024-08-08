public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(-1,0);
        Point p2 = new Point(6,0);
        Segment s1 = new Segment(p1,p2);
        System.out.println("Długość odcinka: " + s1.getLength());

        Point p3 = new Point(1,1);
        Segment[] perpendiculars = Segment.perpendicular(s1, p3);

        for (Segment s : perpendiculars) {
            System.out.println("Punkt początkowy: (" + s.getStart().x + ", " + s.getStart().y + ")");
            System.out.println("Punkt końcowy: (" + s.getEnd().x + ", " + s.getEnd().y + ")");
        }

        Point[] points = {
                new Point(50, 150),
                new Point(150, 50),
                new Point(250, 150),
                new Point(150, 250)
        };
        Polygon polygon = new Polygon(points);
        System.out.println(polygon.toSvg());

        Polygon copiedPolygon = new Polygon(polygon);
    }
}