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
    private String input;

    @Override
    public String inputMessage() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        input = keyboard.nextLine();
        return input;
    }
}
