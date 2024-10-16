public class BankOfDalian extends Bank {
    double year;
    public double computerInterest() {
        super.year = (int)year;
        double r=year-(int)year;
        int day=(int)(r*1000);
        double yearInterest=super.computerInterest();//代码2
        double dayInterest=day*0.00012*savedMoney;
        interest=yearInterest+dayInterest;
        System.out.printf("%d元存在大连银行%d年零%d天的利息是%f元\n",savedMoney,(int)year,day,interest);
        return interest;
    }
}
