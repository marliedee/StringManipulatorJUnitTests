package org.pursuit.junittestingappfromscratch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringManipulatorUnitTest {
    private StringManipulator stringManipulator;

    @Before
    public void setUp() throws Exception {
        stringManipulator = StringManipulator.getInstance();

    }

    @Test
    public void check_ifLessThan10_isTrue() {
        boolean answer = true;
        boolean val = stringManipulator.isLessThan10("word");
        Assert.assertEquals(answer, val);
    }

    @Test
    public void check_ifLessThan10_isFalse() {
        boolean answer = false;
        boolean val = stringManipulator.isLessThan10("wordwordword");
        Assert.assertEquals(answer, val);
    }

    @Test
    public void check_isOddLength_isFalse() {
        boolean answer = false;
        boolean val = stringManipulator.isOddLength("wordwordword");
        Assert.assertEquals(answer, val);
    }

    @Test
    public void check_isOddLength_isTrue() {
        boolean answer = true;
        boolean val = stringManipulator.isOddLength("wordwordwor");
        Assert.assertEquals(answer, val);
    }

    @Test
    public void check_ifZipperWords_alternates() {
        String answer = "aoprpalnege";
        String val = stringManipulator.zipperWords("apple", "orange");
        Assert.assertEquals(answer, val);
    }

    @Test
    public void check_ifDeconstructed_separates() {
        String answer = "gdbyooe";
        String val = stringManipulator.deconstructedWord("goodbye");
        Assert.assertEquals(answer, val);
    }

    @After
    public void tearDown() throws Exception {
        stringManipulator = null;
    }
}
