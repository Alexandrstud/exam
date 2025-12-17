package exams.exam;

public class Main {
    public static void main(String[] args) {

        SalaryCalculator managerCalc =
                new SalaryCalculator(new ManagerSalaryStrategy());
        System.out.println(managerCalc.calculateSalary(1000));

        SalaryCalculator developerCalc =
                new SalaryCalculator(new DeveloperSalaryStrategy());
        System.out.println(developerCalc.calculateSalary(1000));

        SalaryCalculator testerCalc =
                new SalaryCalculator(new TesterSalaryStrategy());
        System.out.println(testerCalc.calculateSalary(1000));
    }
}
