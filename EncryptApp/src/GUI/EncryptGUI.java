package gui;

import CODE.Encryption;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EncryptGUI extends JFrame {
    private JTextField inputField;
    private JButton encryptButton;
    private JLabel resultLabel;

    public EncryptGUI() {
        setTitle("EncryptApp");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel inputLabel = new JLabel("Enter Text:");
        inputLabel.setBounds(30, 30, 100, 25);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(150, 30, 200, 25);
        add(inputField);

        encryptButton = new JButton("Encrypt");
        encryptButton.setBounds(150, 70, 100, 30);
        add(encryptButton);

        resultLabel = new JLabel("Encrypted Text: ");
        resultLabel.setBounds(30, 110, 350, 25);
        add(resultLabel);

        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                Encryption encryption = new Encryption(inputText);
                String encryptedText = encryption.encryptString();
                resultLabel.setText("Encrypted Text: " + encryptedText);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EncryptGUI().setVisible(true);
        });
    }
}
