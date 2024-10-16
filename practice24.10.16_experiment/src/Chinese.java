public class Chinese extends People{
    public void speakHello() {
        System.out.println("你好");
    }
    public void averageHeight() {
        height = 168.78;
        System.out.println("中国人的平均身高为：" + height + "厘米");
    }
    //代码1
    public void averageWeight() {
        weight = 65;
        System.out.println("中国人的平均体重为：" + weight + "千克");
    }
    public void chinaGongfu() {
        System.out.println("坐如钟，站如松，睡如弓");
    }
}
