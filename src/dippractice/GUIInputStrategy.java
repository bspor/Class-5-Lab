/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author bspor
 */
public class GUIInputStrategy implements InputStrategy {
    private int messageType = 1;
    
    @Override
    public void inputMessage(String input) {
        input = JOptionPane.showInputDialog("Please enter your text", messageType);   
    }
}
