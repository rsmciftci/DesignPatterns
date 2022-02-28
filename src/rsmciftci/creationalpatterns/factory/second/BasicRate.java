package rsmciftci.creationalpatterns.factory.second;

public class BasicRate extends NetSalary {

    @Override
    public double calculateNetSalary(double grossIncome) {
        return (grossIncome - 12570) * 0.8 + 12570;
    }
}
