import javax.swing.*;
import java.awt.event.*;
public class login implements ActionListener{
    JTextField tfUserName;
    JTextField tfPassword;
    JFrame f;
    public login(){
         f = new JFrame("Login");
        JLabel l = new JLabel("Username");
        l.setBounds(20, 20, 100, 30);
        f.add(l);
        tfUserName =new JTextField();
        tfUserName.setBounds(140, 20, 100, 30);
        f.add(tfUserName);
        JLabel p = new JLabel("Password");
        p.setBounds(20, 60, 80, 30);
        f.add(p);
        tfPassword  = new JPasswordField();
        tfPassword.setBounds(140, 60, 100, 30);
        f.add(tfPassword);
        JButton b = new JButton("Login");
        b.setBounds(150, 110, 90, 30);
        b.addActionListener(this);
        f.add(b);
        f.setSize(500, 700);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        new login();
        
    }
    public void actionPerformed(ActionEvent ae){ //for accessing here we make global variable
        JLabel message = new JLabel();
       if(tfUserName.getText().equals("admin")&& tfPassword.getText().equals("admin")){ //set username and password == admin
        message.setText("success");
        //   JLabel message = new JLabel("success");
       } 
       else{
        message.setText("invalid username or password");
       }
       message.setBounds(140, 200, 100, 20);
       f.add(message);
       f.repaint();
    }
}