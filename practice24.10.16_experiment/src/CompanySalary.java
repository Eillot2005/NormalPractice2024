abstract class Employee
{
    public abstract double earnings();
}
//代码1
class YearWorker extends Employee
{
    public double earnings()
    {
        return 12000;
    }
}
//代码2
class MonthWorker extends Employee
{
    public double earnings()
    {
        return 12*2300;
    }
}
//代码3
class WeekWorker extends Employee
{
    public double earnings()
    {
        return 52*780;
    }
}

class Company
{
    Employee[] employee;
    double salaries = 0;
    Company(Employee[] employee)
    {
        this.employee = employee;
    }
    public double salariesPay()
    {
        salaries = 0;
        //代码4
        for(int i = 0; i < employee.length; i++)
        {
            salaries = salaries + employee[i].earnings();
        }
        return salaries;
    }
}

public class CompanySalary
{
    public static void main(String[] args)
    {
        Employee[] employee = new Employee[29];
        for(int i = 0; i < employee.length; i++)
        {
            if(i % 3 == 0)
            {
                employee[i] = new WeekWorker();
            }
            else if(i % 3 == 1)
            {
                employee[i] = new MonthWorker();
            }
            else if(i % 3 == 2)
            {
                employee[i] = new YearWorker();
            }
        }
        Company company = new Company(employee);
        System.out.println("公司薪水总额：" + company.salariesPay()+"元");
    }
}

//运行结果：
//公司薪水总额：789600.0元

//1. 如果子类YearWorker不重写earnings()方法，编译将出现什么错误？
//YearWorker is not abstract and does not override abstract method earnings() in Employee

//2. 再增加一种雇员，并计算公司一年的总薪水
/*
class DayWorker extends Employee
{
    public double earnings()
    {
        return 365*80;
    }
}
public class CompanySalary
{
    public static void main(String[] args)
    {
        Employee[] employee = new Employee[30];
        for(int i = 0; i < employee.length; i++)
        {
            if(i % 4 == 0)
            {
                employee[i] = new DayWorker();
            }
            else if(i % 4 == 1)
            {
                employee[i] = new WeekWorker();
            }
            else if(i % 4 == 2)
            {
                employee[i] = new MonthWorker();
            }
            else
            {
                employee[i] = new YearWorker();
            }
        }
        Company company = new Company(employee);
        System.out.println("公司薪水总额：" + company.salariesPay()+"元");
    }
}
//运行结果：
//公司薪水总额：793200.0元
 */

//3. 再class ConpanySalary中如果将语句：else if(1%3==2)错写为else if(i%3==1)，编译能否通过？是否能过运行？
//不能。NullPointerException: Cannot invoke "Employee.earnings()" because "this.employee[i]" is null，因为employee[i]没有赋值，所以会报空指针异常。
