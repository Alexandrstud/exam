package exams.exam;

public class TesterSalaryStrategy implements SalaryStrategy {
    @Override
    public double calculate(double baseSalary) {
        return baseSalary * 1.1;
    }
}

