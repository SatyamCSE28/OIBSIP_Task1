//                                                            Name: Satyam Kumar Singh
//                                                            STUDENT ID: OIB/A2/IP3354

import javax.swing.JOptionPane;
class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Name: Satyam Kumar Singh\nSTUDENT ID: OIB/A2/IP3354","", JOptionPane.INFORMATION_MESSAGE);
        int randomNumber = (int) (Math.random() * 100) + 1; // Random number between 1 and 100
        int guess = 0;
        int attempts = 0;

        while (guess != randomNumber) {
            String input = JOptionPane.showInputDialog(null, "Guess a number between 1 and 100:");
            guess = Integer.parseInt(input); // Convert input to integer
            attempts++;

            if (guess > randomNumber) {
                JOptionPane.showMessageDialog(null, "Too high! Try again.");
            } else if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Too low! Try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

    }
}