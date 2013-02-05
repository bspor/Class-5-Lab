/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author bspor
 */
public class ConsoleOutputStrategy implements OutputStrategy {
    
    @Override
    public void ouptutMessage(String msg) {
        System.out.println(msg);
    }
}
