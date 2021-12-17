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
    private CustWindowListener listenWind = new CustWindowListener();


    private TestKeyboard kb;

    public TestCross(String title) {

        frame = new JFrame(title);
        frame.setSize(200,200);
//        frame.addWindowFocusListener(listenWind);
        panelQuestion = new JPanel();

        butt = new JButton();

        butt.setBackground(Color.red);
        butt.addActionListener(listen);
        butt.addFocusListener(listenWind);


        panelQuestion.add(butt);
        frame.add(panelQuestion);

        frame.pack();
        frame.setVisible(true);
    }

    private class CustomButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            TestKeyboard kb = new TestKeyboard("kb new");
//            while (kb.getLetter() == null){
//                ((JButton) e.getSource()).setText(kb.getLetter());
//            }
//            ((JButton) e.getSource()).setText(kb.getLetter());

//           kb.disposeFrame();
        }
    }

    private class CustWindowListener implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("gainedFocus:" + kb.getLetter());
            butt.setText(kb.getLetter());
        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("WindowOutOfFocus");
        }
    }
}


