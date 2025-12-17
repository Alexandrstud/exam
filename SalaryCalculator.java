package exams.exam;

public class SalaryCalculator {

    private SalaryStrategy strategy;

    public SalaryCalculator(SalaryStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateSalary(double baseSalary) {
        return strategy.calculate(baseSalary);
    }
}

