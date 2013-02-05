/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author bspor
 */
public class DipPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStrategy in = new ConsoleInputStrategy();
        
        //OutputStrategy out = new ConsoleOutputStrategy();
        
        MessageService service = new MessageService();
        
        
        service.outputMessage();
        
    }
}
