package rsmciftci.creationalpatterns.factory.second;

public class NetSalaryFactory {

    public double calculateNetSalary(double grossIncome){
        if(grossIncome > 150_000){
            return new AdditionalRate().calculateNetSalary(grossIncome);
        }else if(grossIncome > 50270 && grossIncome < 150_000){
            return new HigherRate().calculateNetSalary(grossIncome);
        }else if(grossIncome > 12570 && grossIncome < 50270){
            return new BasicRate().calculateNetSalary(grossIncome);
        }else if(grossIncome <= 12570){
            return new PersonalAllowance().calculateNetSalary(grossIncome);
        }else{
            return 0;
        }

    }
}
