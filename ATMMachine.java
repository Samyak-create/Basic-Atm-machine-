
import java.util.*;

class ATM{
    float Balance=10000;
    int PIN=5674;
     public void checkPin(){
        System.out.println("Enter your PIN");
        Scanner sc=new Scanner (System.in);
        int pin=sc.nextInt();
        if(pin == PIN){
            menu();
        }else{
            System.out.println("Enter a valid pin");
        }
     }
     public void menu (){
        System.out.println("Choose Option");
        System.out.println("1.Check your A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.EXIT");

        Scanner sc=new Scanner (System.in);
        int opt =sc.nextInt();
        if(opt ==1){
            checkBalance();
        }if(opt ==2 ){
            Withdraw();
        }else if(opt ==3){
            depositMoney();
        }else if(opt ==4){
            return;
        }else{
            System.out.println("Enter a valid option");
            menu();
        }

     }

     public void checkBalance(){
        System.out.println("Balance :"+Balance);
        menu();
     }
     public void Withdraw(){
        System.out.println("Enter Amount ");
        Scanner sc=new Scanner (System.in);
        float amount=sc.nextFloat();
        if(amount >Balance){
            System.out.println("Insufficient Balance");
        }else{
            Balance =Balance - amount;
            System.out.println("Money Withdrawl Succesful");

        }
        menu();
     }
     public void depositMoney(){
        System.out.println("Enter the Amount");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money Deposited Successfully");
        menu();
     }
     
    }class ATMMachine {
        public static void main(String args[]){
        
    
            ATM obj=new ATM();
            obj.checkPin();
        }
    
    
}