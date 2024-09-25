public class User {
    public static void main(String[] args) {
        Vehicle car1,car2;
        car1=new Vehicle();//代码7
        car2=new Vehicle();
        car1.setPower(128);
        car2.setPower(76);
        System.out.println("car1的功率是："+car1.getPower());
        System.out.println("car2的功率是："+car2.getPower());
        car1.speedUp(80);
        car2.speedUp(80);
        System.out.println("car1目前的速度是："+car1.getSpeed());
        System.out.println("car2目前的速度是："+car2.getSpeed());
        car1.speedDown(10);
        car2.speedDown(20);
        System.out.println("car1目前的速度是："+car1.getSpeed());
        System.out.println("car2目前的速度是："+car2.getSpeed());
    }
}

//1. 改进speedUp()方法，使得Vehicle类的speed属性不会超过200。

//2. 改进speedDown()方法，使得Vehicle类的speed属性不会小于0。

//3. 增加一个刹车方法void brake()，Vehicle类的对象调用它将speed变成0。

//4. 设计一个带两个参数的构造方法，并创建一个对象，将其speed设为100，power设为200。
//Vehicle car3=new Vehicle(100,200);

//5. 修改语句Vehicle car1,car2为Vehicle car1=null,car2;  假设删除代码7，程序编译是否能通过？是否能正常预运行？为什么？
//不能通过，因为car1没有初始化，不能调用方法
