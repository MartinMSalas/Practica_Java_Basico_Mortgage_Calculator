public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

   public Employee(int baseSalary, int hourlyRate){
       setBaseSalary(baseSalary);
       setHourlyRate(hourlyRate);
       numberOfEmployees++;

   }   public Employee(int baseSalary){
       this(baseSalary,0);

   }

    public int calculateWage(int extraHours){

       return baseSalary + (getHourlyRate() * extraHours);
    }

    public int calculateWage(){

       return calculateWage(0);
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary<=0)
            throw new IllegalArgumentException("Salary can not be 0 or less");
        this.baseSalary = baseSalary;

    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }
}
