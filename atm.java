import java.util.Scanner;
public class atm {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int pin = 1011; 
        int balance = 20000; 
        int withdraw=0;
        int deposit=0;
        Scanner sc =new Scanner(System.in); 

        System.out.println("Welcome to the BS bank \n");

        System.out.println("Please enter your A.T.M pin: "); //asking to enter the pin
        pin =sc.nextInt();
        if(pin == 1011 ){                
            while(true) {
                System.out.println("BS bank  A.T.M");
                System.out.println("Enter the required option you want \n");  // asking user to choose required opearation
                System.out.println("Select option 1 for withdraw");
                System.out.println("Select option 2 for deposit");
                System.out.println("Select option 3 for Check balance");
                System.out.println("Select option 4 for receipt");
                System.out.println("Select option 5 for exit()");

                int n =sc.nextInt();
                switch (n) {
                case 1 :                                                  // case1 for withdraw
                    System.out.println("Enter money to withdraw");
                    withdraw=sc.nextInt();
                    if(balance >= withdraw) {
                        balance=balance-withdraw;
                        System.out.println("Please collect your money \n");
                        System.out.println("Available balance is "+balance);
                        break;
                    } else {
                        System.out.println("Insufficient money ");
                    }
                    
    
                case 2 :                                                        // case2  for deposit
                    System.out.println("Enter money to be deposit");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Your money succefully deposited ");
                    System.out.println(" ");
                    break;
    
                case 3 :                                                        //case3 for balnce enquiry
                    System.out.println("Balance : "+balance);
                    System.out.println(" ");
                    break;
    
                case 4 :                                                        // case4 for receipt
                    System.out.println("Welcome to BS bank ATM ");
                    System.out.println("deposited amount"+deposit);
                    System.out.println("withdrwan amount"+withdraw);
                    System.out.println("Available balance"+balance);
                    System.out.println("Thanks for Coming...");
                    System.out.println("Visit again");
                    break;
                case 5:
                    System.out.println("BS bank A.T.M");
                    System.out.println("Thanks for coming...");
                    System.out.println("Visit Again");
                    System.exit(0);
                    
                }
            }

        }
        else {
                System.out.println("Enter the correct pin");
        }

        
    }
}
