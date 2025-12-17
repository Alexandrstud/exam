package exams.exam;

public class ManagerSalaryStrategy implements SalaryStrategy {
    @Override
    public double calculate(double baseSalary) {
        return baseSalary * 1.5;
    }
}

