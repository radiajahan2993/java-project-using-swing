
package com.mycompany.student_information;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_information extends JFrame {
    private JLabel nameLabel, classLabel, rollLabel, schoolLabel, nationalityLabel;
    private JTextField nameField, classField, rollField, schoolField;
    private JButton submitButton;
    private JComboBox<String> comboBox;
    private JCheckBox checkBox;
    private JRadioButton radioButton;
    private JRadioButton foreignerRadioButton;
    private JRadioButton bangladeshiRadioButton;
    private ButtonGroup nationalityButtonGroup;

    public Student_information() {
        setTitle("Student Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 80, 25);
        add(nameLabel);

        classLabel = new JLabel("Class:");
        classLabel.setBounds(20, 50, 80, 25);
        add(classLabel);

        rollLabel = new JLabel("Roll:");
        rollLabel.setBounds(20, 90, 80, 25);
        add(rollLabel);

        schoolLabel = new JLabel("School Name:");
        schoolLabel.setBounds(20, 130, 100, 25);
        add(schoolLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 20, 200, 25);
        add(nameField);

        classField = new JTextField();
        classField.setBounds(120, 50, 200, 25);
        add(classField);

        rollField = new JTextField();
        rollField.setBounds(120, 90, 200, 25);
        add(rollField);

        schoolField = new JTextField();
        schoolField.setBounds(120, 130, 200, 25);
        add(schoolField);

        comboBox = new JComboBox<>();
        comboBox.setBounds(20, 170, 100, 25);
        comboBox.addItem("male");
        comboBox.addItem("female");
        add(comboBox);

        nationalityLabel = new JLabel("Nationality:");
        nationalityLabel.setBounds(20, 200, 120, 25);
        add(nationalityLabel);

        foreignerRadioButton = new JRadioButton("Foreigner");
        foreignerRadioButton.setBounds(20, 230, 140, 25);
        add(foreignerRadioButton);

        bangladeshiRadioButton = new JRadioButton("Bangladeshi");
        bangladeshiRadioButton.setBounds(20, 260, 160, 25);
        add(bangladeshiRadioButton);

        nationalityButtonGroup = new ButtonGroup();
        nationalityButtonGroup.add(foreignerRadioButton);
        nationalityButtonGroup.add(bangladeshiRadioButton);

        checkBox = new JCheckBox("CheckBox");
        checkBox.setBounds(20, 290, 180, 25);
        add(checkBox);
        
        
        radioButton = new JRadioButton("Radio Button");
        radioButton.setBounds(20,320,210,25);
        add(radioButton);
        
        submitButton = new JButton("Submit");
        submitButton.setBounds(20, 350, 240, 25);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String className = classField.getText();
                String roll = rollField.getText();
                String schoolName = schoolField.getText();
                String selectedOption = (String) comboBox.getSelectedItem();
                boolean radioButtonSelected = radioButton.isSelected();
                boolean checkBoxSelected =checkBox.isSelected();
                String selectedNationality = "";

                if (foreignerRadioButton.isSelected()) {
                    selectedNationality = "Foreigner";
                } else if (bangladeshiRadioButton.isSelected()) {
                    selectedNationality = "Bangladeshi";
                }


                String message = "Name: " + name +
                        "\nClass: " + className +
                        "\nRoll: " + roll +
                        "\nSchool Name: " + schoolName +
                        "\nSelected Option: " + selectedOption +
		        "\nNationality: " + selectedNationality +
                        "\nRadio Button Selected: " + radioButtonSelected +
                        "\nCheck Box Selected: " + checkBoxSelected;

                JOptionPane.showMessageDialog(null, message, "Student Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(submitButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Student_information();
    }
}
