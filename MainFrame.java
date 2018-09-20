
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private Container cp;
    private JLabel jlb = new JLabel("game");
    private JPanel jpn = new JPanel(new GridLayout(3, 3, 3, 3));
    private JButton jbtn1 = new JButton();
    private JButton jbtn2 = new JButton();
    private JButton jbtn3 = new JButton();
    private JButton jbtn4 = new JButton();
    private JButton jbtn5 = new JButton();
    private JButton jbtn6 = new JButton();
    private JButton jbtn7 = new JButton();
    private JButton jbtn8 = new JButton();
    private JButton jbtn9 = new JButton();
    private int x = 0;

    public MainFrame() {
        intComp();
    }

    private void intComp() {
        this.setBounds(50, 100, 1000, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3, 3));
        cp.add(jlb, BorderLayout.NORTH);
        jlb.setOpaque(true);
        jlb.setBackground(new Color(255, 248, 0));
        jlb.setFont(new Font(null, Font.BOLD, 70));
        jbtn1.setFont(new Font(null, Font.BOLD, 50));
        jbtn2.setFont(new Font(null, Font.BOLD, 50));
        jbtn3.setFont(new Font(null, Font.BOLD, 50));
        jbtn4.setFont(new Font(null, Font.BOLD, 50));
        jbtn5.setFont(new Font(null, Font.BOLD, 50));
        jbtn6.setFont(new Font(null, Font.BOLD, 50));
        jbtn7.setFont(new Font(null, Font.BOLD, 50));
        jbtn8.setFont(new Font(null, Font.BOLD, 50));
        jbtn9.setFont(new Font(null, Font.BOLD, 50));
        cp.add(jpn, BorderLayout.CENTER);
        jpn.add(jbtn1);
        jpn.add(jbtn2);
        jpn.add(jbtn3);
        jpn.add(jbtn4);
        jpn.add(jbtn5);
        jpn.add(jbtn6);
        jpn.add(jbtn7);
        jpn.add(jbtn8);
        jpn.add(jbtn9);
        jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton tembtn = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("o");
                } else {
                    tembtn.setText("x");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton tembtn = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("o");
                } else {
                    tembtn.setText("x");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton tembtn = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("o");
                } else {
                    tembtn.setText("x");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton tembtn = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("o");
                } else {
                    tembtn.setText("x");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton tembtn = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("o");
                } else {
                    tembtn.setText("x");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton tembtn = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("o");
                } else {
                    tembtn.setText("x");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton tembtn = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("o");
                } else {
                    tembtn.setText("x");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton tembtn = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("o");
                } else {
                    tembtn.setText("x");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn9.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton tembtn = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("o");
                } else {
                    tembtn.setText("x");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
    }

    private void check() {
        if (jbtn1.getText().equals(jbtn2.getText()) && jbtn2.getText().equals(jbtn3.getText()) && !jbtn1.getText().equals("0")) {
            if (jbtn1.getText().equals("o")) {
                jlb.setText("play1win");

            } else {
                jlb.setText("play2win");
            }
        }
    }
}