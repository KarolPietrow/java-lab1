public class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        int dx = end.x - start.x;
        int dy = end.y - start.y;
        return Math.sqrt(dx*dx+dy*dy);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
