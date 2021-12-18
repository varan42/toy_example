import javax.swing.*;

public class TestGame {

    private TestKeyboard tk;
    private TestCross tc;

    public TestGame(){
        tc = new TestCross("Cross");
//        tk = new TestKeyboard("Keyboard");


//        System.out.println(tk.getLetter());
    }

    public static void main (String [] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new TestGame();

            }
        });
    }

}
