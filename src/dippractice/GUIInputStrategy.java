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
    private String messageType = "Text";
    private String input;
    
    @Override
    public String inputMessage() {
        input = JOptionPane.showInputDialog("Please enter your text", messageType); 
        return input;
    }
}
