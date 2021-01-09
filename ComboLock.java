
import java.util.Scanner;

/* Using inheritance because you can't create objects of abstract class */
public class ComboLock extends IComboLock{

/*Creating static methods so that it can be accessed directly within the main method */

     @Override
    public void setCombo(int num1, int num2, int num3){

/*Mixing up the lock numbers */
        int temp = num1;
            num1 = num3;
            num3 = num2;
            num2 = temp;
/* Adding to array */

            lockedCombo[0] = num1;
            lockedCombo[1] = num2;
            lockedCombo[2] = num3;

    }

     @Override
    public void unlock(int num1, int num2, int num3) {

        if(lockedCombo[0] == num1 &&  lockedCombo[1] == num2 
            &&  lockedCombo[2] == num3 ){

            System.out.println("\nCongrats! you have unlocked the lock.");
            setLocked(false);
        }

        else{

             System.out.println("\nSorry! you failed to unlock.");
        }
        
    }
    public static void main(String[] args) {
        //Creating scanner object for user input
        Scanner input = new Scanner(System.in);
        ComboLock c = new ComboLock();


   
        System.out.print("\nEnter Num1 for combination: ");
        int num1 = input.nextInt();
        System.out.print("Enter Num2 for combination: ");
        int num2 = input.nextInt();
        System.out.print("Enter Num3 for combination: ");
        int num3 = input.nextInt();

           
        c.setCombo(num1,num2,num3); //set combination
        c.setLocked(true); //locked 

        if(c.isLocked()){

            System.out.println("\nDevice is locked!");

            System.out.println("\nYou need to choose combination to unlock!");
            System.out.println("\n___ ___ ___");

            while(c.isLocked()){

                System.out.print("\nGuess first place Number: ");
                num1 = input.nextInt();
                System.out.print("Guess second place Number: ");
                num2 = input.nextInt();
                System.out.print("Guess third place Number: ");
                num3 = input.nextInt();

                c.unlock(num1,num2,num3);

            }
           
        }
        else
            System.out.println("Lock is already unlocked!");   
    }       
}
