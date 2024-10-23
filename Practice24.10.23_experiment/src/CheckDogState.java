interface DogState {
    public void showState();
}
class softlyState implements DogState
{
    public void showState() {
        System.out.println("听主人的命令");
    }
}
//代码1
class MeetEnemyState implements DogState
{
    public void showState() {
        System.out.println("狂叫，并冲上去咬敌人");
    }
}
//代码2
class MeetFriendState implements DogState
{
    public void showState() {
        System.out.println("晃动尾巴，表示欢迎");
    }
}
//代码3
class MeetAnotherDog implements DogState
{
    public void showState() {
        System.out.println("嘻嘻");
    }
}
class Dog {
    DogState state;
    public void setState(DogState state) {
        this.state=state;
    }
    public void show() {
        state.showState();
    }
}
public class CheckDogState {
    public static void main(String[] args)
    {
        Dog dog=new Dog();
        System.out.println("狗在主人面前：");
        dog.setState(new softlyState());
        dog.show();
        System.out.println("狗遇到敌人：");
        dog.setState(new MeetEnemyState());
        dog.show();
        System.out.println("狗遇到朋友：");
        dog.setState(new MeetFriendState());
        dog.show();
        System.out.println("狗遇到同伴：");
        dog.setState(new MeetAnotherDog());
        dog.show();
    }
}

//输出结果
/*
狗在主人面前：听主人的命令
狗遇到敌人：狂叫，并冲上去咬敌人
狗遇到朋友：晃动尾巴，表示欢迎
狗遇到同伴：嘻嘻
 */

//用面向接口的思想编写程序，模拟水杯中水在不同温度下可能的状态
/*
interface WaterState {
    public void showState();
}
class SolidState implements WaterState
{
    public void showState() {
        System.out.println("水在冰冻状态");
    }
}
class LiquidState implements WaterState
{
    public void showState() {
        System.out.println("水在液态状态");
    }
}
class GasState implements WaterState
{
    public void showState() {
        System.out.println("水在气态状态");
    }
}
class Water {
    WaterState state;
    public void setState(WaterState state) {
        this.state=state;
    }
    public void show() {
        state.showState();
    }
}
public class CheckWaterState {
    public static void main(String[] args)
    {
        Water water=new Water();
        System.out.printf("水在冰冻状态：");
        water.setState(new SolidState());
        water.show();
        System.out.printf("水在液态状态：");
        water.setState(new LiquidState());
        water.show();
        System.out.printf("水在气态状态：");
        water.setState(new GasState());
        water.show();
    }
}
输出结果：
水在冰冻状态：水在冰冻状态
水在液态状态：水在液态状态
水在气态状态：水在气态状态
 */