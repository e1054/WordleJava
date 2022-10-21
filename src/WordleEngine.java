public class WordleEngine {

    public static void main(String[] args) {
        WordleInputHandler engine = new WordleInputHandler();

        WordleFrameDrawer wordleFrame = new WordleFrameDrawer();

        DrawWord drawer = wordleFrame.getDrawer();

        wordleFrame.addCell(30);

        engine.setGuess();

        drawer.fillRow(engine.getGuess());

        drawer.setColorCellBorder();

        drawer.changeCellFont();

        drawer.hintGiver(drawer.getAnswer(), 1);

    }
}
