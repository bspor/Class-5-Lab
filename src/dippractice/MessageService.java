
package dippractice;

/**
 *
 * @author bspor
 */
public class MessageService {
   private static final String MSG = "Hello!";
   private InputStrategy in;
   private OutputStrategy out;

    public MessageService(InputStrategy in, OutputStrategy out) {
        this.in = in;
        this.out = out;
    }

    public void outputMessage() {
        out.ouptutMessage(in.inputMessage());
//        out.inputMessage(out);
    }
}
