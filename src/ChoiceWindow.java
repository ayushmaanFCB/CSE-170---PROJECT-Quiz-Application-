import javax.swing.*;
import java.awt.*;

public class ChoiceWindow {

    MyFrame frame = new MyFrame();

    public void choices(){

        frame.setVisible(true);
        frame.setLayout(new GridLayout(2, 0));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout(0, 3));
        panel1.setBackground(Color.CYAN);
        frame.add(panel1);
        frame.add(panel2);

        JLabel mainLabel = new JLabel("Chose the topic to start the quiz");
        mainLabel.setFont(new Font("Hollywood Hills", Font.ITALIC, 45));
        mainLabel.setForeground(Color.BLACK);
        mainLabel.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(mainLabel, BorderLayout.NORTH);

        JLabel instructions1 = new JLabel("::   Each section has 5 questions in them.");
        JLabel instructions2 = new JLabel( "::   You can select any section.");
        JLabel instructions3 = new JLabel("::   Each question has 20 points. ");
        JLabel instructions4 = new JLabel("::   Maximum points that can be scored is 100");
        JPanel subPanel1 = new JPanel();
        subPanel1.setLayout(new GridLayout(4,0));
        subPanel1.setBackground(Color.CYAN);
        panel1.add(subPanel1, BorderLayout.CENTER);
        JLabel[] instructions = {instructions1, instructions2, instructions3, instructions4};
        for(JLabel instruction : instructions){
            subPanel1.add(instruction);
            instruction.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));
        }

        ImageIcon image1 = new ImageIcon("historyIcon.png");
        JButton button1 = new JButton("HISTORY");
        button1.setIcon(image1);
        JButton button2 = new JButton("SPORTS");
        ImageIcon image2 = new ImageIcon("soccer-icon.png");
        button2.setIcon(image2);
        JButton button3 = new JButton("CURRENT AFFAIRS");
        ImageIcon image3 = new ImageIcon("Apps-File-News-icon.png");
        button3.setIcon(image3);
        JButton[] buttons = {button1, button2, button3};

        for(JButton button : buttons) {
            button.setFont(new Font("Flubber", Font.BOLD, 18));
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.BOTTOM);
            button.setBackground(Color.black);
            button.setForeground(Color.CYAN);
            button.setFocusable(false);
            button.setVisible(true);
            button.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
            panel2.add(button);
        }

        button1.addActionListener(e-> history());
        button2.addActionListener(e -> sports());
        button3.addActionListener(e -> currentAffairs());
        frame.back.addActionListener(e -> back());
    }

    void back(){
        frame.dispose();
        MainScreen mainScreen = new MainScreen();
        mainScreen.mainScreen();
    }

   void history(){
        frame.dispose();
        History history = new History();
        history.history();
    }
    void sports(){
        frame.dispose();
        Sports sports = new Sports();
        sports.sports();
    }
    void currentAffairs(){
        frame.dispose();
        CurrentAffairs currentAffairs = new CurrentAffairs();
        currentAffairs.currentAffairs();
    }
}