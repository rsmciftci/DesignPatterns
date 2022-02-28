package rsmciftci.creationalpatterns.factory.second;

public class PersonalAllowance extends NetSalary{

    @Override
    public double calculateNetSalary(double grossIncome) {
        return grossIncome;
    }
}
