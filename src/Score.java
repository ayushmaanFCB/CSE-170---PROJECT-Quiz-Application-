import javax.swing.*;
import java.awt.*;

public class Score {

    void score(String message, String topic) {

        ImageIcon dice = new ImageIcon("icon.png");
        String[] responses = {"RE-PLAY", "EXIT", "VIEW ALL ANSWERS"};

        int response = JOptionPane.showOptionDialog(null, message, "SCORE BOX",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, dice, responses, null);

        if (response == 0)
            new MainScreen().mainScreen();

        if (response == 2) {
            JFrame frame = new JFrame();
            frame.setVisible(true);         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setSize(1000, 220);       frame.setResizable(false);
            frame.setLayout(new FlowLayout());

            JLabel l1 = new JLabel();            JLabel l2 = new JLabel();
            JLabel l3 = new JLabel();            JLabel l4 = new JLabel();
            JLabel l5 = new JLabel();

            if (topic.equals("history")) {
                frame.setTitle("HISTORY ANSWERS");
                l1.setText("State that was the first victim of the British policy of ‘Subsidiary Alliance‘ : HYDERABAD");
                l2.setText("The first successful printing press was developed by : GUTENBERG");
                l3.setText("First Western explorer to reach China : MARCO POLO");
                l4.setText("‘The Veda of magical formulas‘ : ATHARAVEDA");
                l5.setText("The disease that killed a third of European population in the 14th century : BUBONIC PLAGUE");
            }

            if (topic.equals("sports")) {
                frame.setTitle("SPORTS ANSWERS");
                l1.setText("‘Lille LOSC, Rennes, OGC Nice, RC Strasbourg‘ belong to : LIGUE 1");
                l2.setText("Longest winning streak in the history of NBA : LOS ANGELES LAKERS");
                l3.setText("Highest number of Laureus World Sports Award for Sportsman of the Year : FEDERER");
                l4.setText("Only two teams to win ‘Sextuple‘ : FC BARCELONA and BAYERN MUNICH");
                l5.setText("Country which ompeted the most times in the Summer Olympics but has 0 golds : PHILLIPINES");
            }

            if (topic.equals("current")) {
                frame.setTitle("CURRENT AFFAIRS ANSWERS");
                l1.setText("Biggest trading partner of the European Union : CHINA");
                l2.setText("Mountain range often called as the ‘Third Pole’ : HINDU KUSH RANGE");
                l3.setText("Agency that has adopted a political declaration to end AIDS by the year 2030 : UN GENERAL ASSEMBLY");
                l4.setText("Uvariopsis dicaprio’, named after Hollywood actor Leonardo DiCaprio is a : TREE");
                l5.setText("Aerospace company that has announced the launch of the ‘DOGE-1 Mission to the Moon’ : SPACE X");
            }

            JLabel[] labels = {l1, l2, l3, l4, l5};
            for(JLabel label : labels){
                label.setForeground(Color.BLACK);
                label.setFont(new Font("Comic Sans", Font.BOLD, 18));
                frame.add(label);
            }

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 2));
            JButton b1 = new JButton("RE-PLAY");      JButton b2 = new JButton("EXIT");
            b1.addActionListener(e -> b1func(frame));
            b2.addActionListener(e -> frame.dispose());
            b1.setFocusable(false);     b1.setFocusable(false);
            panel.add(b1);           panel.add(b2);
            frame.add(panel);
        }
    }

    void b1func(JFrame frame){
        new MainScreen().mainScreen();
        frame.dispose();
    }
}