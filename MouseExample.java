import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class MouseExample implements MouseListener {
    JButton b;
    public MouseExample(){
        JFrame f = new JFrame();
        b = new JButton("Cacth me");
        b.setBounds(20, 20, 100, 20);
        b.addMouseListener(this);
        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);       
    }
    public void mouseEntered(MouseEvent me){
        int x = new Random().nextInt(400);
        int y = new Random().nextInt(400);
        b.setBounds(x, y, 100, 20);
    }
    public void mouseClicked(MouseEvent me){
        
    }
    public void mousePressed(MouseEvent me){
        
    }
    public void mouseReleased(MouseEvent me){

    }
    public void mouseExited(MouseEvent me){

    }
    public static void main(String[] args) {
        new MouseExample();
    }
  
    
    
}
