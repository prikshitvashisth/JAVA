import java.util.Scanner;

public class OddEvenSum {
    
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  int TotalNumber = sc.nextInt();

	int evenSum = 0;
	int oddSum  = 0;
  
  for (int n=TotalNumber; n>0; n--){
      int currNum = sc.nextInt();
	
	if (currNum % 2 == 0){
		evenSum += currNum;	
   }
   else {
	oddSum += currNum;	
   }
	
}
System.out.println("sum of even intergers= " + evenSum);
System.out.println("sum of odd intergers= " + oddSum);


}
}
