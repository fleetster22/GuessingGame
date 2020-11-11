import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String question = "How many coders does it take to screw in a light bulb?\n";
        question += "A. It's a server issue\n";
        question += "B. It's a network issue\n";
        question += "C. Only one\n";
        question += "D. Hack all the things\n";
        question += "E. Undefined\n";

        while (true) {
            String answer = JOptionPane.showInputDialog(question);

            if (answer.equals("D")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            } else if (answer.equals("A") || (answer.equals("B") || (answer.equals("C")) || (answer.equals("E")))) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. Try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Enter A, B, C, D, or E");
            }
        }

    }
}
