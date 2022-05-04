import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel gameInstruct;
    private static JLabel gameFeed;


    public static void main (String [] args){

        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        gameInstruct = new JLabel("Type n,s,e,w");
        gameInstruct.setBounds(10, 400, 80, 25);
        panel.add(gameInstruct);

        userText = new JTextField(20);
        userText.setBounds(110, 400, 100, 25);
        panel.add(userText);

        button = new JButton("Enter"); // creates a new button object
        button.setBounds(110, 430, 100, 25);
        button.addActionListener(new Gui());
        panel.add(button); // adds the button to the panel

        gameFeed = new JLabel("Game Feed");
        gameFeed.setBounds(130, -10, 300, 250);
        panel.add(gameFeed);


        frame.setVisible(true); // makes the frame visible
    }

    public void actionPerformed(ActionEvent e) {

        String user = userText.getText(); // gets the text from the user text field

        if(user.equals("Dakarai"))  {
            gameInstruct.setText("Login Successful");
        } else {
            gameInstruct.setText("Login Failed");
        }

    }
}