import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 1 extends JFrame {
    private JTextField heightField;
    private JTextField weightField;
    private JTextField bmiField;

    public BMICalculator() {
        setTitle("BMI CALCULATOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel heightLabel = new JLabel("Height (m):");
        heightField = new JTextField(10);

        JLabel weightLabel = new JLabel("Weight (kg):");
        weightField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateBMI();
            }
        });

        bmiField = new JTextField(10);
        bmiField.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        
        panel.add(new JLabel("Height (m):"));
        panel.add(heightField);
        panel.add(new JLabel("Weight (kg):"));
        panel.add(weightField);
        panel.add(new JLabel("BMI:"));
        panel.add(bmiField);
        
        panel.add(new JPanel());
        panel.add(calculateButton);

        add(panel);
        setVisible(true);
    }

    private void calculateBMI() {
        try {
            double height = Double.parseDouble(heightField.getText());
            double weight = Double.parseDouble(weightField.getText());
            double bmi = weight / (height * height);
            bmiField.setText(String.format("%.2f", bmi));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BMICalculator();
            }
        });
    }
}
