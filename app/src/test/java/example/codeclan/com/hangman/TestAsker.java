package example.codeclan.com.hangman;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class TestAsker
{
    Asker asker;

    @Before
    public void before()
    {
        asker = new Asker();
    }

    @Test
    public void getWord()
    {
        asker.setWord("Test");
        assertEquals("Test", asker.getWord());
    }

    @Test
    public void testGetIndices()
    {
        asker.setWord("Tesst");

        ArrayList<Character> guesses = new ArrayList<Character>();
        guesses.add('a');
        guesses.add('e');
        guesses.add('d');
        guesses.add('r');
        guesses.add('s');

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);

        char guess = 's';

        assertEquals(expected, asker.getIndices(guess));
    }

    @Test
    public void canGetCoveredWord(){
        asker.setWord("aubergine");
        assertEquals("aubergine", asker.getWord());
        assertEquals("*********", asker.getCoveredWord());
    }

//    @Test
//    public void canGetIndices(){
//        asker.setWord("Test");
//
//    }



}
