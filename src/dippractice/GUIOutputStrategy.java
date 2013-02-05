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
public class GUIOutputStrategy implements OutputStrategy {
    
    @Override
    public void ouptutMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
