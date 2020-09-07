
import java.util.Scanner;

/*import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  
/**
 *
 * @author frys
 */
public class Calorie {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);  
        // Ask for number of cookies consumed 
        System.out.println("How many cookies have you ate:");
        double numberOfCookiesConsumed = keyboard.nextDouble();
        
        // Calculate Calories consumed 
        double calorieIntake = numberOfCookiesConsumed * 30;
      
        //Display Calorie intake
        System.out.println("You have consumed: " + calorieIntake + " calories");
    }
}



/**
 *
 * @author frys
 */
