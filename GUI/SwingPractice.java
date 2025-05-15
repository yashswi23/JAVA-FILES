import javax.swing.*;

public class SwingPractice {
    public static void main(String[] args) {
        // Create the main frame
        JFrame jf = new JFrame("Registration Form");
        jf.setSize(600, 500);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title Label
        JLabel jl = new JLabel("Register Here");
        jl.setBounds(200, 20, 200, 30);
        jf.add(jl);

        // Name Label and TextField
        JLabel jName = new JLabel("Name:");
        jName.setBounds(100, 70, 100, 30);
        jf.add(jName);

        JTextField jtext = new JTextField();
        jtext.setBounds(250, 70, 200, 30);
        jf.add(jtext);

        // Email Label and TextField
        JLabel jEmail = new JLabel("Email:");
        jEmail.setBounds(100, 120, 100, 30);
        jf.add(jEmail);

        JTextField jem = new JTextField();
        jem.setBounds(250, 120, 200, 30);
        jf.add(jem);

        // Password Label and PasswordField
        JLabel jPass = new JLabel("Password:");
        jPass.setBounds(100, 170, 100, 30);
        jf.add(jPass);

        JPasswordField jp = new JPasswordField();
        jp.setBounds(250, 170, 200, 30);
        jf.add(jp);

        // Gender Label
        JLabel jgen = new JLabel("Gender:");
        jgen.setBounds(100, 220, 100, 30);
        jf.add(jgen);

        // Radio Buttons for Gender
        JRadioButton option1 = new JRadioButton("Male");
        option1.setBounds(250, 220, 80, 30);
        jf.add(option1);

        JRadioButton option2 = new JRadioButton("Female");
        option2.setBounds(340, 220, 80, 30);
        jf.add(option2);

        // Group the radio buttons to ensure only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        // Set the frame visibility to true
        jf.setVisible(true);
    }
}
