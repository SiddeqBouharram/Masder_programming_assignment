public class Part_EMP extends EMP_rec {
    // class for Part Time employees

    public double Calc_Bounus(double Salary) {
        // Calculate Bounus Salaey for the Part Time employees as 3%

        Salary = this.getSalary();

        double Bonus_Salary = Salary * 0.015;

        return Bonus_Salary;

    }

}
