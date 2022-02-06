import javax.swing.*;
import java.awt.*;

public class MainScreen {

    MyFrame frame = new MyFrame();

    void mainScreen(){

        frame.setVisible(true);
        frame.setLayout(new GridLayout(2, 0));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.CYAN);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 8));

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        ImageIcon bulb = new ImageIcon("main.png");
        label1.setIcon(bulb);
        label2.setFont(new Font("Jokerman", Font.BOLD, 50));
        label2.setText("QUIZ APPLICATION");
        panel1.add(label1);
        panel1.add(label2);
        JLabel label3 = new JLabel();
        label3.setFont(new Font("Segoe Script", Font.BOLD, 22));
        label3.setText("Come take a quick check of how intelligent you are !!!");
        panel1.add(label3);

        panel2.setBackground(Color.BLACK);
        panel2.setBorder(BorderFactory.createLineBorder(Color.CYAN, 8));
        panel2.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("This quiz test has 3 sections : History, Sports and Current Affairs.");
        JLabel l2 = new JLabel("Please read the instructions in the Help Menu before starting.");
        JLabel l3 = new JLabel("The scores will be displayed in the end after the submission of the test.");
        JLabel[] l = {l1, l2, l3};
        for(JLabel x : l){
            x.setFont(new Font("Salina", Font.BOLD, 23));
            x.setForeground(Color.CYAN);
            panel2.add(x);
        }

        ImageIcon start = new ImageIcon("Start-icon.png");
        JButton go = new JButton("START !!!");
        go.setForeground(Color.CYAN);
        go.setBackground(Color.BLACK);
        go.setBorder(BorderFactory.createLineBorder(Color.CYAN,5));
        go.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
        go.setIcon(start);
        go.setFocusable(false);
        go.addActionListener(e -> launch());
        panel2.add(go);

        frame.back.addActionListener(e -> frame.dispose());

        frame.add(panel1);
        frame.add(panel2);
    }

    void launch(){
        ChoiceWindow choice = new ChoiceWindow();
        choice.choices();
        frame.dispose();
    }
}
