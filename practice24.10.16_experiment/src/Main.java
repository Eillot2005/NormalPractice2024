public class Main {
    public static void main(String[] args) {
        Chinese chinaPeople=new Chinese();
        American americanPeople=new American();
        Beijingman beijingPeople=new Beijingman();
        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();
        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();
        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();
        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera();
        beijingPeople.chinaGongfu();
    }
}

//运行结果：
/*
你好
How do you do
你好
中国人的平均身高为：168.78厘米
American's average height:176.0cm
北京人的平均身高为：172.5厘米
中国人的平均体重为：65.0千克
American's average weight:75.0kg
北京人的平均体重为：70.0千克
坐如钟，站如松，睡如弓
直拳、勾拳、组合拳
花脸、青衣、花旦和丑角
坐如钟，站如松，睡如弓
 */

//1.People类中的public void speakHello() public void averageHeight() public void averageWeight()3个方法的方法体语句能否省略？
//可以省略，因为后面的子类都对这三个方法进行了重写，所以这三个方法的方法体语句可以省略。

//2.能否将class People中的protected double weight, height中的protected改成private?
//不能，因为子类中需要继承父类的属性，如果将protected改成private，子类就无法继承父类的属性了。

//3.能否将class Chinese中的public void speakHello()中的public省略？
//不能，因为子类中重写父类的方法时，访问权限不能低于父类的访问权限，所以不能省略public。

//4.能否在class Chinese中增加成员变量：int height;编译能否通过？
//不能，因为Chinese类和Beijingman类中averageheight()方法中都用double值对height进行赋值，如果在Chinese类中增加int height;编译就会报错。