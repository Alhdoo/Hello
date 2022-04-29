public class Point {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "("+x+","+y+")";
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Point)
        {
            System.out.println("bonne class");
            if(this.x==((Point) obj).getX()&&this.y==((Point) obj).getY()) {
                return true;
            }
            return false;
        }
        System.out.println("mauvaise class");
        return false;
    }


}
