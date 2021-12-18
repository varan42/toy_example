import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestKeyboard extends JDialog implements ActionListener{
//    private JFrame frame;
    private JPanel panelQuestion;
    private JButton butt;
    private String letter;
    private TestCross tc;


//    private CustomButtonListener listen = new CustomButtonListener();

    public TestKeyboard(Frame parent){

        super(parent, "Keyboard", true);
//        this.tc = tc;
//        this.setModalityType(DEFAULT_MODALITY_TYPE);

//        frame = new JFrame();
        panelQuestion = new JPanel();
        butt = new JButton("LETTER");

        butt.setBackground(Color.green);
        butt.addActionListener(this);

        panelQuestion.add(butt);
        getContentPane().add(panelQuestion);

        pack();
        setVisible(false);
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public void setFrameVisible(boolean flag){
        setVisible(flag);
    }

    public void disposeFrame(){
        dispose();
    }

    public boolean getFrameVisible(){
        return isVisible();
    }

    public String getResult(){
        setVisible(true);
        return letter;
    }

    public void actionPerformed(ActionEvent e) {
        String action = ((JButton) e.getSource()).getText();
        setLetter(action);
//            letter = action;
        System.out.println("letter: " + letter);
        setVisible(false);
        dispose();
    }
}

