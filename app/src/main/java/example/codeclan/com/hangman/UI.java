package example.codeclan.com.hangman;

import java.util.ArrayList;
import java.util.PriorityQueue;

import example.codeclan.com.hangman.enums.ScriptLine;
import example.codeclan.com.hangman.enums.Stickman;

/**
 * Created by user on 28/06/2017.
 */

public class UI
{
    public static void showGetWord()
    {
        Viewer.printLine(ScriptLine.GETWORD.getScriptLine());
        Viewer.print(ScriptLine.PROMPT.getScriptLine());
    }

    public static void showCoveredWord()
    {
        Viewer.print(ScriptLine.WORDIS.getScriptLine());
    }

    public static void printLine(String string)
    {
        Viewer.printLine(string);
    }

    public static void showInputGuess()
    {
        Viewer.printLine(ScriptLine.BLANKLINE.getScriptLine());
        Viewer.printLine(ScriptLine.GETCHAR.getScriptLine());
        Viewer.print(ScriptLine.PROMPT.getScriptLine());
    }

    public static void showLoseLife()
    {
        Viewer.printLine(ScriptLine.LOSTLIFE.getScriptLine());
    }

    public static void showWon(String word)
    {
        Viewer.printLine(ScriptLine.WON.getScriptLine());
        Viewer.print(ScriptLine.WORDWAS.getScriptLine());
        Viewer.printLine(word);
    }

    public static void showGuessed(ArrayList<Character> guesses)
    {
        Viewer.printLine(ScriptLine.YOUGUESSED.getScriptLine());
        for(Character character : guesses)
        {
            Viewer.printLine(character.toString());
        }
        Viewer.printLine(ScriptLine.BLANKLINE.getScriptLine());
    }

    public static void showLost(String word)
    {
        Viewer.printLine(ScriptLine.LOST.getScriptLine());
        Viewer.print(ScriptLine.WORDWAS.getScriptLine());
        Viewer.printLine(word);
    }

    public static void showLives(int lives)
    {
        switch(lives)
        {
            case 6:
                Viewer.printLine(Stickman.SIX.getStickman());
                break;
            case 5:
                Viewer.printLine(Stickman.FIVE.getStickman());
                break;
            case 4:
                Viewer.printLine(Stickman.FOUR.getStickman());
                break;
            case 3:
                Viewer.printLine(Stickman.THREE.getStickman());
                break;
            case 2:
                Viewer.printLine(Stickman.TWO.getStickman());
                break;
            case 1:
                Viewer.printLine(Stickman.ONE.getStickman());
                break;
        }
    }
}
