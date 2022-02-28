package rsmciftci.creationalpatterns.factory.second;

public class HigherRate  extends NetSalary{

    @Override
    public double calculateNetSalary(double grossIncome) {
        return  (grossIncome - 50270) * 0.6 + (50270 - 12570) * 0.8 + 12570;

    }
}
