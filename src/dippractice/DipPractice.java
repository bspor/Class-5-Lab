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
        //InputStrategy in = new ConsoleInputStrategy();
        InputStrategy in = new GUIInputStrategy();
     
        //OutputStrategy out = new ConsoleOutputStrategy();
        OutputStrategy out = new GUIOutputStrategy();
        
        MessageService service = new MessageService(in, out);
        
        service.outputMessage();
        
    }
}
