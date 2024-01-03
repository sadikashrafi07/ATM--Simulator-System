package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;

public class Withdrawl extends JFrame implements ActionListener {
    
    JTextField amounttextfield;
    JButton withdraw, back;
    String pinnumber;
    
    Withdrawl(String pinnumber) {
        
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to Withdraw");
        text.setBounds(170,300,400,20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        amounttextfield = new JTextField();
        amounttextfield.setFont(new Font("Raleway", Font.BOLD, 22));
        amounttextfield.setBounds(170, 350, 320, 25);
        image.add(amounttextfield);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == back) {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    } else {
         String amount = amounttextfield.getText();
        try {
            Conn c = new Conn();

            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '" + pinnumber + "'");
                int balances = 0;
                while (rs.next()) {
                    if (rs.getString("type").equals("Deposit")) {
                        balances += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balances -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                if(ae.getSource() != back && balances < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                Date date = new Date();
                String query = "insert into bank values ('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " + amount + " Withdraw Successfully");

                setVisible(false);
                new Transactions(pinnumber).setVisible(true);

            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid amount format");
        }
    }
}

    public static void main(String args[]) {
        new Withdrawl("");
    }
}
