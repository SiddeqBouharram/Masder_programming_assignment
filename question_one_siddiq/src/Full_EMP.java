public class Full_EMP extends EMP_rec {
    // class for Full Time employees

    public double Calc_Bounus(double Salary) {
        // Calculate Bounus Salaey for the Full Time employees as 3%
        Salary = this.getSalary();

        double Bonus_Salary = Salary * 0.03;

        return Bonus_Salary;

    }

    public double Calc_SalaryWBounus(double Salary) {
        // this method calculate the Salary With the Bounus

        return this.getSalary() + Calc_Bounus(Salary);

    }

}
