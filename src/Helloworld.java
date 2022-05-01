public class Helloworld {
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        Point c=new Point(4.2, 2.5);
        Polygone poly = new Polygone();
        poly.addPoint(a);
        poly.addPoint(b);
        poly.addPoint(c);
        poly.affichageTab();
    }
}
