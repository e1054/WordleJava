import java.util.*;
import java.util.List;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class DrawWord {
    private String answer = "Hudson";
    private String guess = "HLsuwn";

    private List<JButton> getRowCells(int numRow) {
        // Based on number return certain part of ArrayList
        System.out.println(numRow);

        switch (numRow) {
            case 1:
                System.out.println(WordleFrameDrawer.getButtons().subList(0, 6).getClass().getName());
                return WordleFrameDrawer.getButtons().subList(0, 6);

            case 2:
                return WordleFrameDrawer.getButtons().subList(7, 13);

            case 3:
                return WordleFrameDrawer.getButtons().subList(13, 19);

            case 4:
                return WordleFrameDrawer.getButtons().subList(20, 26);

            case 5:
                return WordleFrameDrawer.getButtons().subList(26, 32);

            default:
                return WordleFrameDrawer.getButtons();

        }

    }

    public void hintGiver(String guess, int numGuess) {
        for (JButton btn : getRowCells(numGuess)) {
            // Check for green
            if (btn.getText().equals(Character.toString(answer.charAt(getRowCells(numGuess).indexOf(btn))))) {

                changeCellBgColor(btn, Color.green);
            }

            // Make sure guess letter is in answer
            else if (answer.contains(btn.getText())) {
                // Make sure it's in wrong pos
                if (!btn.getText().equals(Character.toString(answer.charAt(getRowCells(numGuess).indexOf(btn))))) {

                    changeCellBgColor(btn, Color.yellow);
                }

            }

            else {
                changeCellBgColor(btn, Color.LIGHT_GRAY);

            }

        }

    }

    // Iterate through sublist of buttons
    // Check if text content of button is either in the right position or letter
    // Set BG Color of button

    public void fillRow(String word) {

        for (int i = 0; i < word.length(); i++) {

            String gridCellLetter = Character.toString(word.charAt(i));

            WordleFrameDrawer.getButtons().get(i).setText(gridCellLetter);

        }
    }

    public String getGuess() {
        return this.guess;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setColorCellBorder() {
        for (JButton button : WordleFrameDrawer.getButtons()) {
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }

    }

    public void changeCellFont() {
        for (JButton button : WordleFrameDrawer.getButtons()) {
            button.setFont(new Font("Dialog", Font.BOLD, 48));
        }
    }

    public void changeCellBgColor(JButton button, Color color) {

        button.setBackground(color);
        button.setOpaque(true);

    }

    public static void main(String[] args) {

    }

}
