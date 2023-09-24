import java.awt.event.*;
import javax.swing.*;
public class SimplecatchME implements ActionListener {
    JButton catchme;
    JFrame f;
    public SimplecatchME(){
        f = new JFrame();
        catchme = new JButton("catchme");
        catchme.setBounds(20, 20, 100, 20);
        catchme.addActionListener(this);
        f.add(catchme);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        catchme.setBounds(300,300,100,20);
    }
    public static void main(String[] args) {
        SimplecatchME obj = new SimplecatchME();
    }
}
