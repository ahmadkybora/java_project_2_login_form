package Auth;

import javax.swing.*;
import java.awt.event.*;

public class Login {
    private JFrame form;
    private JLabel lusr;
    private JLabel lpass;
    private JTextField username;
    private JTextField password;
    private JButton submit;

    public void loign() {
        form = new JFrame("Login Form");
        username = new JTextField("inset username");
        password = new JTextField("insert password");
        submit = new JButton("Submit");

        username.setBounds(120, 150, 150, 20);
        password.setBounds(120, 180, 150, 20);
        submit.setBounds(120, 205, 75, 20);

        form.add(username);
        form.add(password);
        form.add(submit);

        form.setSize(400, 500);
        form.setLayout(null);
        form.setVisible(true);
    }
}
