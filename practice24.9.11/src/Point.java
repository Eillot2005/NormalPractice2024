public class Point {
    private double x,y,z;
    public Point(double x,double y,double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void setPoint(double x,double y, double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double getDistance(Point p)
    {
        return Math.sqrt(Math.pow((x-p.x),2)+Math.pow((y-p.y),2)+Math.pow((z-p.z),2));
    }
    public static double getD(Point p1,Point p2)
    {
        return Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2)+Math.pow((p1.z-p2.z),2));
    }
}
