package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton savingaccount, fdaccount, currentaccount, Rdaccount;
    JCheckBox atmcard, internetbanking, mobilebanking, alerts, cheque, estatement, declaration;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
        
        this.formno=formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        savingaccount = new JRadioButton("Saving Account");
        savingaccount.setFont(new Font("Raleway", Font.BOLD, 16));
        savingaccount.setBackground(Color.WHITE);
        savingaccount.setBounds(100, 180, 200, 20);
        add(savingaccount);
        
        fdaccount = new JRadioButton("Fixed Deposit Account");
        fdaccount.setFont(new Font("Raleway", Font.BOLD, 16));
        fdaccount.setBackground(Color.WHITE);
        fdaccount.setBounds(350, 180, 300, 20);
        add(fdaccount);
        
        currentaccount = new JRadioButton("Current Account");
        currentaccount.setFont(new Font("Raleway", Font.BOLD, 16));
        currentaccount.setBackground(Color.WHITE);
        currentaccount.setBounds(100, 220, 200, 20);
        add(currentaccount);
        
        Rdaccount = new JRadioButton("Recurring Deposit Account");
        Rdaccount.setFont(new Font("Raleway", Font.BOLD, 16));
        Rdaccount.setBackground(Color.WHITE);
        Rdaccount.setBounds(350, 220, 300, 20);
        add(Rdaccount);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(savingaccount);
        groupaccount.add(fdaccount);
        groupaccount.add(currentaccount);
        groupaccount.add(Rdaccount);
        
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel cnumber = new JLabel("XXXX-XXXX-XXXX-7986");
        cnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        cnumber.setBounds(330, 300, 300, 30);
        add(cnumber);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 400, 300, 20);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 300, 30);
        add(services);
        
        atmcard = new JCheckBox("ATM CARD");
        atmcard.setBackground(Color.WHITE);
        atmcard.setFont(new Font("Raleway", Font.BOLD, 16));
        atmcard.setBounds(100,500,200,30);
        add(atmcard);
        
        internetbanking = new JCheckBox("Internet Banking");
        internetbanking.setBackground(Color.WHITE);
        internetbanking.setFont(new Font("Raleway", Font.BOLD, 16));
        internetbanking.setBounds(350,500,200,30);
        add(internetbanking);
        
        mobilebanking = new JCheckBox("Mobile Banking");
        mobilebanking.setBackground(Color.WHITE);
        mobilebanking.setFont(new Font("Raleway", Font.BOLD, 16));
        mobilebanking.setBounds(100,550,200,30);
        add(mobilebanking);
        
        alerts = new JCheckBox("EMAIL & SMS Alerts");
        alerts.setBackground(Color.WHITE);
        alerts.setFont(new Font("Raleway", Font.BOLD, 16));
        alerts.setBounds(350,550,200,30);
        add(alerts);
        
        cheque = new JCheckBox("Cheque Book");
        cheque.setBackground(Color.WHITE);
        cheque.setFont(new Font("Raleway", Font.BOLD, 16));
        cheque.setBounds(100,600,200,30);
        add(cheque);
        
        estatement = new JCheckBox("E-Statement");
        estatement.setBackground(Color.WHITE);
        estatement.setFont(new Font("Raleway", Font.BOLD, 16));
        estatement.setBounds(350,600,200,30);
        add(estatement);
        
        declaration = new JCheckBox("I hearby declare that the above entered details are correct to the best of my knowledge");
        declaration.setBackground(Color.WHITE);
        declaration.setFont(new Font("Raleway", Font.BOLD, 12));
        declaration.setBounds(100,680,600,30);
        add(declaration);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,820);
        setLocation(350, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit) {
            String accountType = null;
            if(savingaccount.isSelected()) {
                accountType = "Saving Account";
            } else if(fdaccount.isSelected()){
                accountType =  "Fixed Deposit Account";
            } else if(currentaccount.isSelected()) {
                accountType = "Current Account";
            } else if(Rdaccount.isSelected()) {
                accountType = "Reccuring Deposit Account";
            }
            
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if (atmcard.isSelected()) {
                facility = facility + " ATM CARD" + ", ";
            }if (internetbanking.isSelected()) {
                facility = facility + " Internet Banking" + ", ";
            }if (mobilebanking.isSelected()) {
                facility = facility + " Mobile Banking" + ", ";
            }if (alerts.isSelected()) {
                facility = facility + " EMAIL & SMS Alerts" + ", ";
            }if (cheque.isSelected()) {
                facility = facility + " Cheque Book" + ", ";
            }if (estatement.isSelected()) {
                facility = facility + " E-Statement" + ", ";
            }if (!facility.isEmpty()) {
                facility = facility.substring(0, facility.length() - 2);
            }
            
            try {
                if (accountType.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"', '" +accountType+ "', '" +cardnumber+ "', '" +pinnumber+ "', '" +facility+ "')";
                    String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number " + cardnumber + "\n Pin: "+pinnumber);
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }
            } catch(Exception e) {
                System.out.println(e);
            }
            
        } else if(ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new SignupThree("").setVisible(true);
    }
}
