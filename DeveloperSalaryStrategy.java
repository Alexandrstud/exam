package exams.exam;

public class DeveloperSalaryStrategy implements SalaryStrategy {
    @Override
    public double calculate(double baseSalary) {
        return baseSalary * 1.2;
    }
}
