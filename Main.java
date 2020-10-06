import java.util.Scanner;

/**
 * for loops examples
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //creat the count variable
    int count = 1;
    //create wile loop to count
    while(count <= 10){
    //print number to the concole
    System.out.println(count);
    //increase the counter
    count = count + 1;
    }

    //do the same thing with a for loop
    for(int count2 = 1; count2 <= 10; count2++){
    //loop action print the number
    System.out.println("Loop " + (count2+1));
    }

    //do the same thing with a for loop
    for(int count2 = 1; count2 <= 10; count2++){
    //loop action print the number
    System.out.println("Loop " + (count2+1));
    }



  }
}
