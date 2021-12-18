import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TestCross {
    private JFrame frame;
    private JPanel panelQuestion;
    private JButton butt;

    private CustomButtonListener listen = new CustomButtonListener();
//    private CustWindowListener listenWind = new CustWindowListener();
//    private CustWindowListener listenWind = new CustWindowListener();


    private TestKeyboard kb;
    private String l;

    public TestCross(String title) {

        kb = new TestKeyboard("kb new", this);

        frame = new JFrame(title);
        frame.setSize(200,200);
//        frame.addWindowFocusListener(listenWind);
        panelQuestion = new JPanel();

        butt = new JButton();

        butt.setBackground(Color.red);
        butt.addActionListener(listen);
//        butt.addFocusListener(listenWind);


        panelQuestion.add(butt);
        frame.add(panelQuestion);

        frame.pack();
        frame.setVisible(true);
    }

    private class CustomButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
//            String l = kb.getResult();

            if (kb != null) {
                System.out.println("gainedFocus:" + kb.getLetter());
                butt.setText(kb.getLetter());
            }
            

            l = kb.getResult();
            System.out.println(l);
            System.out .println(kb.getLetter());
            if (frame.isFocused()){
                System.out .println(kb.getLetter());
            }

//            butt.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    System.out.println("IM INSIDE SECOND LISTENER");
//                    butt.setText(kb.getLetter());
////                    if (kb.getFrameVisible() == false)
////                    {
////                        JButton butt = TestCross.this.butt;
////
////                    }
////                    String action = ((JButton) e.getSource()).getText();
////                    letter = action;
////                    System.out.println("letter: " + letter);
////                    frame.dispose();
//                }
//
//            });
//            while (kb.getLetter() == null){
//                ((JButton) e.getSource()).setText(kb.getLetter());
//            }
//            ((JButton) e.getSource()).setText(kb.getLetter());

//           kb.disposeFrame();
        }
    }

//    private class CustWindowListener implements FocusListener {
//
//        @Override
//        public void focusGained(FocusEvent e) {
//            System.out.println("gainedFocus:" + kb.getLetter());
//            butt.setText(kb.getLetter());
//        }
//
//        @Override
//        public void focusLost(FocusEvent e) {
//            System.out.println("WindowOutOfFocus");
//        }
//    }
}


