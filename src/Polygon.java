public class Polygon {
    private final Point[] points;

    public Polygon(Point[] points) {
        this.points = points.clone(); // Płytka kopia tablicy
    }

    // Konstruktor kopiujący wykonujący głęboką kopię
    public Polygon(Polygon other) {
        this.points = new Point[other.points.length];

        for (int i = 0; i < other.points.length; i++) {
            Point originalPoint = other.points[i];
            this.points[i] = new Point(originalPoint.x, originalPoint.y);
        }
    }

    public String toSvg() {
        StringBuilder svg = new StringBuilder("<polygon points=\"");

        for (Point point : points) {
            svg.append(point.x).append(",").append(point.y).append(" ");
        }

        svg.append("\" style=\"fill:none;stroke:black;stroke-width:1\" />");
        return svg.toString();
    }
}
