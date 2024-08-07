public class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        int dx = end.x - start.x;
        int dy = end.y - start.y;
        return Math.sqrt(dx*dx+dy*dy);
    }

    public String toSvg() {
        return "<line x1=\"" + start.x +
                "\" y1=\"" + start.y +
                "\" x2=\"" + end.x +
                "\" y2=\"" + end.y +
                "\" style=\"stroke:rgb(0,0,0);stroke-width:2\" />";
    }

    public static

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
