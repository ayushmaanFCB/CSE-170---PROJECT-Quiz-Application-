import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JMenuBar bar = new JMenuBar();
    JMenu file = new JMenu("FILE");
    JMenu help = new JMenu("HELP");
    JMenuItem close = new JMenuItem("Exit");
    JMenuItem back = new JMenuItem("Back");
    JMenuItem instructions = new JMenuItem("Instructions");

    MyFrame(){

        // this.setVisible(true);
        this.setTitle("QUIZ TIME - Simple Quick Quiz");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(720, 500);
        this.setResizable(false);
        ImageIcon image = new ImageIcon("Logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.WHITE);

        close.addActionListener(e-> this.dispose());
        file.add(close);                file.add(back);
        help.add(instructions);         instructions.addActionListener(e->instruct());
        bar.add(file);                  bar.add(help);
        this.setJMenuBar(bar);
    }

    void instruct(){
        JFrame frame = new JFrame("INSTRUCTIONS");
        frame.setLayout(new GridLayout(4,0));       frame.setVisible(true);
        frame.setSize(700, 180);
        JLabel label1 = new JLabel("1.  You can select any section from the 3 sections available.");
        JLabel label2 = new JLabel("2.  In the test, Multiple Choices are not allowed.");
        JLabel label3 = new JLabel("3.  Once submitted, answers can't be edited.");
        JLabel label4 = new JLabel("4.  Answers can be viewed after submission.");
        JLabel[] labels = {label1, label2, label3, label4};
        for(JLabel label : labels){
            label.setFont(new Font("Comic Sans", Font.BOLD, 20));
            frame.add(label);
        }
    }
}