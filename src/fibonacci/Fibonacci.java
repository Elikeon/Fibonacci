/*
 * Jared Craig
 * 24/10/2018
 */

package fibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author jacra1226
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
String Num = JOptionPane.showInputDialog("The first nine fibonacci numbers are listed as follows:" + "\n1,1,2,3,5,8,13,21,34,... " + ""
        + "\nWhat fibonacci term would you like to see?"); 
int Num1 = Integer.parseInt(Num);

   JOptionPane.showMessageDialog(null,"The " + Num1 + "th" + " fibonacci number is "+fib(Num1));
    System.out.println("The " + Num1 + "th" + " fibonacci number is "+fib(Num1));
  }

  public static int fib(int n){
     if(n ==0){
         return 0;
     }
    if((n <=2)) {
      return 1;
    }
    else {
        
      return fib(n - 1) + fib(n-2);
    }
    }
    
}
