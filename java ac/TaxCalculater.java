import java.util.*;

public class TaxCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");

        float income = sc.nextFloat();
        float tax = 0;
        float salary = income;
        

        if (income <= 500000) {
            System.out.println("Tax are 0 your total salary is: " +income);
            
        }
        else if (income > 500000 && income <= 1000000){
            tax = income*0.2f;
            salary = income - tax;
            System.out.println("Total tax on your salary is 20% so your taxex are: "+tax +  "your salary after tax is: "+salary);
        }
        else{
            tax = income*0.3f;
            salary = income - tax;
            System.out.println("Total tax on your salary is 30% so your taxex are: "+tax  +"your salary after tax is: "+salary);
        }

        sc.close();
    }
    
}