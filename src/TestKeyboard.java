import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestKeyboard {
    private JFrame frame;

    private JPanel panelQuestion;
    private JButton butt;

    private String letter;

    private CustomButtonListener listen = new CustomButtonListener();
    public TestKeyboard(String title){

        frame = new JFrame(title);
        panelQuestion = new JPanel();
        butt = new JButton("LETTER");

        butt.setBackground(Color.green);
        butt.addActionListener(listen);

        panelQuestion.add(butt);
        frame.add(panelQuestion);

        frame.pack();
        frame.setVisible(true);
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

    private class CustomButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String action = ((JButton) e.getSource()).getText();
            letter = action;
            System.out.println("letter: " + letter);
            frame.dispose();
//            frame.setVisible(false);
        }
    }
}
