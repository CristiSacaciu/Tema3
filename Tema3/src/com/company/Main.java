package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static JTextField fNameInput;
    private static JTextField lNameInput;
    private static JTextField ageInput;
    private static JRadioButton maleInput;
    private static JRadioButton femaleInput;
    private static JCheckBox isMarriedInput;
    private static JTextArea addressInput;
    private static JButton butonSave;
    private static ButtonGroup group;
    private static JLabel firstNameLabel;
    private static JLabel lastNameLabel;
    private static JLabel ageLabel;
    private static JLabel genderLabel;
    private static JLabel addressLabel;
    public static String answer;
    public static String gender;

    public static void main(String[] args) {
        JPanel jPanel = buildPanel();
        addActionToButon(jPanel);

    }

    private static void addActionToButon(JPanel panel) {
        butonSave.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String fnameValue = fNameInput.getText();
                        String lnameValue = lNameInput.getText();
                        Integer ageValue = Integer.parseInt(ageInput.getText());
                        Boolean isMarriedValue = Boolean.parseBoolean(isMarriedInput.getText());
                        String addressValue = addressInput.getText();
                        if(maleInput.isSelected()){
                            gender = "Male";
                        }
                        if(femaleInput.isSelected()) {
                            gender = "Female";
                        }
                        if(isMarriedValue == false){
                            answer="No";
                        }else{
                            answer="Yes";
                        }


                    Form form = new Form(fnameValue, lnameValue, ageValue, gender, answer, addressValue);


                    JLabel fNameLabel = new JLabel("First Name: "+form.getFname());
                        fNameLabel.setBounds(10, -20, 300, 100);

                        JLabel lNameLabel = new JLabel("Last Name: "+form.getLname());
                        lNameLabel.setBounds(10, 10, 300, 100);

                        JLabel ageLabel = new JLabel("Age: "+form.getAge());
                        ageLabel.setBounds(10, 40, 300, 100);

                        JLabel genderLabel = new JLabel("Gender: "+form.getGender());
                        genderLabel.setBounds(10, 70, 300, 100);

                        JLabel isMarriedLabel = new JLabel("Married: "+form.getMarried());
                        isMarriedLabel.setBounds(10, 110, 300, 100);

                        JLabel addressLabel = new JLabel("Address: "+form.getAddress());
                        addressLabel.setBounds(10, 140, 300, 100);
                        setAddComponentsVisibility(false);
                        panel.add(fNameLabel);
                        panel.add(lNameLabel);
                        panel.add(ageLabel);
                        panel.add(genderLabel);
                        panel.add(isMarriedLabel);
                        panel.add(addressLabel);
                        panel.updateUI();
                        System.out.println(addressInput.getText());

                    }
                }
        );
    }

    private static JPanel buildPanel() {
        JFrame frame = new JFrame("Introduceti datele camerei");
        frame.setSize(400, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);

        return panel;
    }
    private static void setAddComponentsVisibility(boolean b) {
        fNameInput.setVisible(b);
        lNameInput.setVisible(b);
        ageInput.setVisible(b);
        isMarriedInput.setVisible(b);
        maleInput.setVisible(b);
        femaleInput.setVisible(b);
        addressInput.setVisible(b);
        isMarriedInput.setVisible(b);
        butonSave.setVisible(b);
        firstNameLabel.setVisible(b);
        lastNameLabel.setVisible(b);
        ageLabel.setVisible(b);
        genderLabel.setVisible(b);
        addressLabel.setVisible(b);


    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(10, 20, 80, 25);
        panel.add(firstNameLabel);

        fNameInput = new JTextField(20);
        fNameInput.setBounds(100, 20, 165, 25);
        panel.add(fNameInput);

        lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(10, 50, 80, 25);
        panel.add(lastNameLabel);

        lNameInput = new JTextField(20);
        lNameInput.setBounds(100, 50, 165, 25);
        panel.add(lNameInput);

        ageLabel = new JLabel("Age");
        ageLabel.setBounds(10, 80, 80, 25);
        panel.add(ageLabel);

        ageInput = new JTextField(20);
        ageInput.setBounds(100, 80, 165, 25);
        panel.add(ageInput);

        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(10, 130, 100, 25);
        panel.add(genderLabel);

        maleInput = new JRadioButton("Male");
        maleInput.setBounds(100,130,70,25);
        panel.add(maleInput);

        femaleInput = new JRadioButton("Female");
        femaleInput.setBounds(180,130,200,25);
        panel.add(femaleInput);

        isMarriedInput = new JCheckBox("Married?");
        isMarriedInput.setBounds(10,170,100,25);
        panel.add(isMarriedInput);

        addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(10, 210, 80, 25);
        panel.add(addressLabel);

        addressInput = new JTextArea("asdfsadfasdfsadfasdfsadfasdfsadf",10,300);
        addressInput.setBounds(100,210,165,80);
        panel.add(addressInput);

        butonSave = new JButton("Save");
        butonSave.setBounds(10, 300, 200, 25);
        panel.add(butonSave);
    }

}
