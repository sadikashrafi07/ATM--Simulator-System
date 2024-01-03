package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, occupation, education;
    String formno;
    
    SignupTwo(String formno){
        
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
        
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel Rname = new JLabel("Religion: ");
        Rname.setFont(new Font("Raleway", Font.BOLD, 22));
        Rname.setBounds(100,140,200,30);
        add(Rname);
        
        String valReligion[] = {"Muslim", "Hindu", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel Cname = new JLabel("Categoey: ");
        Cname.setFont(new Font("Raleway", Font.BOLD, 22));
        Cname.setBounds(100,190,200,30);
        add(Cname);
        
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel Inc = new JLabel("Income: ");
        Inc.setFont(new Font("Raleway", Font.BOLD, 22));
        Inc.setBounds(100,240,200,30);
        add(Inc);
        
        String incomecategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel edu = new JLabel("Educational ");
        edu.setFont(new Font("Raleway", Font.BOLD, 22));
        edu.setBounds(100,290,200,30);
        add(edu);
        
        JLabel qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 22));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String educationValues[] = {"Non Graduate", "Graduate", "Post Graduate", "Doctrate", "Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel financial_status = new JLabel("Occupation: ");
        financial_status.setFont(new Font("Raleway", Font.BOLD, 22));
        financial_status.setBounds(100,390,200,30);
        add(financial_status);
        
        String occupationValues[] = {"Salaried", "Self Employed", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
    
        JLabel pan = new JLabel("PAN Number: ");
        pan.setFont(new Font("Raleway", Font.BOLD, 22));
        pan.setBounds(100,440,200,30);
        add(pan);
        
        panTextField= new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number: ");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 22));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        JLabel SCitizens = new JLabel("Senior Citizen: ");
        SCitizens.setFont(new Font("Raleway", Font.BOLD, 22));
        SCitizens.setBounds(100,540,200,30);
        add(SCitizens);
              
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup Sgroup= new ButtonGroup();
        Sgroup.add(syes);
        Sgroup.add(sno);

        JLabel EAccount = new JLabel("Existing Account: ");
        EAccount.setFont(new Font("Raleway", Font.BOLD, 22));
        EAccount.setBounds(100,590,200,30);
        add(EAccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup Egroup= new ButtonGroup();
        Egroup.add(eyes);
        Egroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(new Color(0,0,0));
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        

        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setVisible(true);
        setLocation(350, 10);
    }
    
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }else if (eno.isSelected()){
            existingaccount = "No";
        }
        
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();

        try{
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
}

