/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import java.util.Scanner;

/**
 *
 * @author bspor
 */
public class ConsoleInputStrategy implements InputStrategy {
    
    @Override
    public void inputMessage(String input) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        input = keyboard.nextLine();
    }
}
