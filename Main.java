package exams.exam;

public class Main {
    public static void main(String[] args) {

        SalaryCalculator managerCalc =
                new SalaryCalculator(new ManagerSalaryStrategy());
        System.out.println("Manager получает зарплату: " + managerCalc.calculateSalary(1000));

        SalaryCalculator developerCalc =
                new SalaryCalculator(new DeveloperSalaryStrategy());
        System.out.println("Developer получает зарплату: " + developerCalc.calculateSalary(1000));

        SalaryCalculator testerCalc =
                new SalaryCalculator(new TesterSalaryStrategy());
        System.out.println("Tester получает зарплату: " + testerCalc.calculateSalary(1000));
    }
}
