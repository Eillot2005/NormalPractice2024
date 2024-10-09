public class Land {
    public static void main(String[] args) {
        Village.setWaterAmount(200);//代码1
        int leftWater = Village.lookWaterAmount();//代码2
        System.out.println("水井中有"+leftWater+"升水");
        Village zhaoZhuang,maJiaHeZi;
        zhaoZhuang = new Village("赵庄");
        maJiaHeZi = new Village("马家河子");
        zhaoZhuang.setPeopleNumber(80);
        maJiaHeZi.setPeopleNumber(120);
        zhaoZhuang.drinkWater(50);//代码3
        leftWater=maJiaHeZi.lookWaterAmount();//代码4
        String name=maJiaHeZi.name;
        System.out.println(name+"发现井中水有"+leftWater+"升水");
        maJiaHeZi.drinkWater(100);
        leftWater=zhaoZhuang.lookWaterAmount();//代码5
        name=zhaoZhuang.name;
        System.out.println(name+"发现井中水有"+leftWater+"升水");
        int peopleNumber=zhaoZhuang.getPeopleNumber();
        System.out.println("赵庄的人口"+peopleNumber);
        peopleNumber=maJiaHeZi.getPeopleNumber();
        System.out.println("马家河子的人口"+peopleNumber);
    }
}

/*
运行结果：
水井中有200升水
赵庄喝了50升水
马家河子发现井中水有150升水
马家河子喝了100升水
赵庄发现井中水有50升水
赵庄的人口80
马家河子的人口120
 */

//1.代码3是否可以是"Village.drinkWater(50);"?
//不可以，因为drinkWater是非静态方法，必须通过对象调用

//2.代码4是否可以是"Village.lookWaterAmount();"?
//可以，因为lookWaterAmount是静态方法，可以通过类名调用

//3.Land类的main方法中的倒数第二行代码是否可以改为peopleNumber=Village.getPeopleNumber();?
//不可以，因为getPeopleNumber是非静态方法，必须通过对象调用

//4.能否将void drinkWater(int n){}改为static void drinkWater(int n){}?
//不能，因为drinkWater方法中使用了非静态成员变量name，所以不能将drinkWater方法改为静态方法

//5.分析此程序运行的内存模型
//1.程序运行时，首先加载Land类，然后加载Village类
//2.给Village类的静态成员变量waterAmount分配内存空间，初始化为0
//3.然后，执行Land类的main方法
//4.创建Village类的两个对象zhaoZhuang和maJiaHeZi
//5.给zhaoZhuang对象的非静态成员变量分配内存空间
//6.程序运行结束,释放内存空间