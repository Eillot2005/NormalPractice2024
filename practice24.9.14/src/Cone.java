public class Cone {
    private Circle bottom;
    private double height;
    public Cone(Circle bottom,double height)
    {
        this.bottom=bottom;
        this.height=height;
    }
    public double getVolume()
    {
        return bottom.getArea()*height/3;
    }
    public double getSurfaceArea()
    {
        return bottom.getArea()+Math.PI*bottom.getRadius()*Math.sqrt(Math.pow(bottom.getRadius(),2)+Math.pow(height,2));
    }
    public Circle getBottom()
    {
        return bottom;
    }
    public void setBottom(Circle bottom)
    {
        this.bottom=bottom;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
}
