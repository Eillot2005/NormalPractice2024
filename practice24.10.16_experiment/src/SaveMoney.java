public class SaveMoney {
    public static void main(String[] args) {
        int amount = 8000;
        ConstructionBank bank1 = new ConstructionBank();
        bank1.savedMoney = amount;
        bank1.year = 8.236;
        bank1.setInterestRate(0.035);
        double interest1 = bank1.computerInterest();
        BankOfDalian bank2 = new BankOfDalian();
        bank2.savedMoney = amount;
        bank2.year = 8.236;
        bank2.setInterestRate(0.035);
        double interest2 = bank2.computerInterest();
        System.out.printf("两个银行利息相差%f元\n", interest2 - interest1);
    }
}

//运行结果：
/*
8000元存在建设银行8年零236天的利息是2428.800000元
8000元存在大连银行8年零236天的利息是2466.560000元
两个银行利息相差37.760000元
 */

//1. 参照建设银行和大连银行再编写一个商业银行，让程序输出8000元存在商业银行8年零236天的利息
/*
public class BusinessBank extends Bank {
    double year;
    public double computerInterest() {
        super.year = (int)year;
        double r=year-(int)year;
        int day=(int)(r*1000);
        double yearInterest=super.computerInterest();
        double dayInterest=day*0.00015*savedMoney;
        interest=yearInterest+dayInterest;
        System.out.printf("%d元存在商业银行%d年零%d天的利息是%f元\n",savedMoney,(int)year,day,interest);
        return interest;
    }
}
public class SaveMoney {
    public static void main(String[] args) {
        int amount = 8000;
        BusinessBank bank3 = new BusinessBank();
        bank3.savedMoney = amount;
        bank3.year = 8.236;
        bank3.setInterestRate(0.035);
        double interest3 = bank3.computerInterest();
        System.out.printf("8000元存在商业银行8年零236天的利息是%f元\n", interest3);
    }
}
//运行结果：
8000元存在商业银行8年零236天的利息是2454.800000元
 */

//2. 如果将Bank类中成员变量year的访问权限设为private，编译能否通过？如果不能，请修改程序（修改后的程序输出结果不变）
/*
编译不能通过，修改后的程序如下：
再Bank类中添加一个public方法getYear(int year)用于获取year的值
public int getYear() {
    return year;
}
*/
