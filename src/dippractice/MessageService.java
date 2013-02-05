
package dippractice;

/**
 *
 * @author bspor
 */
public class MessageService {
//   private static final String MSG = "Hello!";
   private OutputStrategy out;

    public MessageService(OutputStrategy out) {
        this.out = out;
    }
   
    public void outputMessage() {
        out.ouptutMessage("Place Holder");
    }
}
