
import javax.swing.*;

public class Utility {

    public static JButton getElementsJButton(JButton[] arr) {
        for (JButton JButton : arr) {

            return JButton;
        }
        return new JButton();

    }

    public static char getElementsString(String string) {
        for (char letter : string.toCharArray()) {

            return letter;
        }
        return '\u0000';

    }

    public static void sleepThread(int seconds) {
        try {
            Thread.sleep((long) seconds * 1000);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
