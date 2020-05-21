import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class celsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton celsiusConvertButton;
    private JLabel fahrenheitLabel;

    public celsiusConverterGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);

        this.pack();
        celsiusConvertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Grab the text from textfield
                double celsiusDeg = Double.parseDouble(celsiusTextField.getText());
                //Convert the number
                double fahrenheitDeg = (celsiusDeg * 1.8) + 32;
                //Print the number on fahrenheitlabel field
                fahrenheitLabel.setText(fahrenheitDeg + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new celsiusConverterGUI("Celsius Converter");
        frame.setVisible(true);
    }
}
