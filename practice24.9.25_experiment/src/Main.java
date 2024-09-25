public class Main {
    public static void main(String[] args) {
        TV haierTV = new TV();
        haierTV.setChannel(5);//代码2
        System.out.println("haierTV的频道是：" + haierTV.getChannel());
        Family zhangsanFamily = new Family();
        zhangsanFamily.buyTV(haierTV);
        System.out.println("zhangsanFamily开始看电视节目");
        zhangsanFamily.seeTV();
        int m=2;
        System.out.println("zhangsanFamily换到"+m+"频道");
        zhangsanFamily.remoteControl(m);
        System.out.println("haierTV的频道是：" + haierTV.getChannel());
        System.out.println("zhangsanFamily再看电视节目");
        zhangsanFamily.seeTV();
    }
}

//1. 省略代码2，程序是否能正常运行？如果可以，输出结果是什么？
//不能正常运行，因为没有初始化频道

//2. 在主类的main方法最后下面添加如下代码，并解释输出效果：
//Family lisiFamily = new Family();
//lisiFamily.buyTV(haierTV);
//listFamily.seeTV();
//解释：输出“经济频道”，因为haierTV的频道最后是2，lisiFamily调用seeTV()方法，输出频道2对应的节目

//3. 创建一个TV对象changhongTV，并使zhangsanFamily对象与其组合
//TV changhongTV = new TV();
//changhongTV.setChannel(3);
//zhangsanFamily.buyTV(changhongTV);
//System.out.println("zhangsanFamily开始看电视节目");
//zhangsanFamily.seeTV();

//4. 将void setChannel(int m)方法改为static void setChannel(int m)，程序是否能正常运行？为什么？
//不能，因为channel是实例变量，静态方法不能访问实例变量