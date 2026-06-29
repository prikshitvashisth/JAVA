import java.util.Scanner;

class DirectionQuestion {
    
    public static int[] finalDestination(String direction){
        int x = 0;  
        int y = 0;
        
        for(int i = 0; i < direction.length(); i++){
            if (direction.charAt(i) == 'N'){
                y++;
            } else if(direction.charAt(i) == 'S'){
                y--;
            } else if(direction.charAt(i) == 'E'){
                x++;
            } else if(direction.charAt(i) == 'W'){
                x--;
            }
        }
        int[] arr = {x,y};
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the direction string (N, S, E, W): ");
        String direction = sc.nextLine();
        direction = direction.toUpperCase(); 
        int[] arr = finalDestination(direction);
        int x = arr[0];
        int y = arr[1];
        double desplacement = Math.hypot(x,y);
        
        System.out.print("The displacement between (0,0) and (" + x + "," + y + ") is: " + desplacement);
    }
}