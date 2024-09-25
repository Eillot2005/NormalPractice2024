public class Vehicle {
    private double speed;
    private int power;
    /*
    Vehicle(int s,int p)
    {
        speed=s;
        power=p;
    }
     */
    void speedUp(int s)
    {
        speed+=s;
        /*
        if(speed+s>200)
        {
            speed=200;
        }
        else
        {
            speed+=s;
        }
         */
    }
    void speedDown(int s)
    {
        speed-=s;
        /*
        if(speed-s<0)
        {
            speed=0;
        }
        else
        {
            speed-=s;
        }
         */
    }
    double getSpeed()
    {
        return speed;
    }
    void setPower(int p)
    {
        power=p;
    }
    int getPower()
    {
        return power;
    }
    /*
    void brake()
    {
        speed=0;
    }
     */
}
