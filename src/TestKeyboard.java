import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestKeyboard extends JDialog {
    private JFrame frame;

    private JPanel panelQuestion;
    private JButton butt;

    private String letter;

    private TestCross tc;

    private CustomButtonListener listen = new CustomButtonListener();

    public TestKeyboard(String title, TestCross tc){

        this.tc = tc;
        this.setModalityType(DEFAULT_MODALITY_TYPE);

        frame = new JFrame(title);
        panelQuestion = new JPanel();
        butt = new JButton("LETTER");

        butt.setBackground(Color.green);
        butt.addActionListener(listen);

        panelQuestion.add(butt);
        frame.add(panelQuestion);

        frame.pack();
        frame.setVisible(false);
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public void setFrameVisible(boolean flag){
        frame.setVisible(flag);
    }

    public void disposeFrame(){
        frame.dispose();
    }

    public boolean getFrameVisible(){
        return frame.isVisible();
    }

    public String getResult(){
        this.frame.setVisible(true);
        return this.getLetter();
    }

    private class CustomButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String action = ((JButton) e.getSource()).getText();
            setLetter(action);
//            letter = action;
            System.out.println("letter: " + letter);
            frame.setVisible(false);
            frame.dispose();
        }
    }
}
