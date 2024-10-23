interface ComputerWeight
{
    public double computerWeight();
}
class Television implements ComputerWeight
{
    //代码1
    public double computerWeight()
    {
        return 3.5;
    }
}
class Computer implements ComputerWeight
{
    //代码2
    public double computerWeight()
    {
        return 2.67;
    }
}
class WashingMachine implements ComputerWeight
{
    //代码3
    public double computerWeight()
    {
        return 13.8;
    }
}
class Truck
{
    ComputerWeight[] goods;
    double totalWeight=0;
    Truck(ComputerWeight[] goods)
    {
        this.goods=goods;
    }
    public void setGoods(ComputerWeight[] goods)
    {
        this.goods=goods;
    }
    public double getTotalWeight()
    {
        //代码4
        for(int i=0;i<goods.length;i++)
        {
            totalWeight+=goods[i].computerWeight();
        }
        return totalWeight;
    }
}
public class CheckCarWeight
{
    public static void main(String[] args)
    {
         ComputerWeight[] goods=new ComputerWeight[650];
         for(int i=0;i<goods.length;i++)
         {
              if(i%3==1)
              {
                goods[i]=new Television();
              }
              else if(i%3==2)
              {
                goods[i]=new Computer();
              }
              else
              {
                goods[i]=new WashingMachine();
              }
         }
         Truck truck=new Truck(goods);
        System.out.printf("货车装载的货物重量：%-8.5f kg\n",truck.getTotalWeight());
        goods=new ComputerWeight[68];
        for(int i=0;i<goods.length;i++)
        {
            if(i%2==0) {
                goods[i] = new Television();
            }
            else
            {
                goods[i]=new WashingMachine();
            }
        }
        truck.setGoods(goods);
        System.out.printf("货车装载的货物重量：%-8.5f kg\n",truck.getTotalWeight());
    }
}
// Output:
/*
货车装载的货物重量：4330.82000 kg
货车装载的货物重量：4919.02000 kg
 */

//请在实验的基础上再编写一个实现ComputerWeight接口的类，比如Refrigerrator,这样货车装载的货物中就可以有Refrigerrator类型的货物了。
/*
class Refrigerator implements ComputerWeight
{
    public double computerWeight()
    {
        return 25.0;
    }
}
class Truck
{
    ComputerWeight[] goods;
    double totalWeight=0;
    Truck(ComputerWeight[] goods)
    {
        this.goods=goods;
    }
    public void setGoods(ComputerWeight[] goods)
    {
        this.goods=goods;
    }
    public double getTotalWeight()
    {
        for(int i=0;i<goods.length;i++)
        {
            totalWeight+=goods[i].computerWeight();
        }
        return totalWeight;
    }
}
 */
//当系统增加了一个实现ComputerWeight接口的类后，Truck类需要进行修改吗？
//不需要，因为Truck类中的goods数组是ComputerWeight类型的，所以只要新的类实现了ComputerWeight接口，就可以放入goods数组中。

//当i%3==2改为i%3==1时，输出结果有什么变化？
/*
货车装载的货物重量：6734.90000 kg
货车装载的货物重量：7323.10000 kg
 */