package Testing;

import BackEnd.Weitage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeitageClassTests {

    @Test
    public void basicTest1() {
        Weitage weitage = new Weitage();
        assertEquals(0, weitage.totalSize());
        weitage.addEntry(5, 90);
        weitage.addEntry(5, 90);
        assertEquals(2, weitage.totalSize());
        assertEquals(90, weitage.evaluateFinalGrade());
    }

    @Test
    public void basicTest2() {
        Weitage weitage = new Weitage();
        weitage.addEntry(5, 73);
        weitage.addEntry(2, 88);
        weitage.addEntry(3, 90);
        assertEquals(3, weitage.totalSize());
        assertEquals(81.1, weitage.evaluateFinalGrade());
    }

    @Test
    public void myADSEndtermWeblabSpecTestScores() {
        Weitage weitage = new Weitage();
        weitage.addEntry(2, 100);
        weitage.addEntry(2, 19);
        weitage.addEntry(3, 64);
        weitage.addEntry(3, 26);
        assertEquals(4, weitage.totalSize());
        assertEquals(50.8, weitage.evaluateFinalGrade());//:(
    }

    @Test
    public void myADSEndtermWeblabSpecTestScoresTestingDeletion() {
        Weitage weitage = new Weitage();
        weitage.addEntry(2, 100);
        weitage.addEntry(2, 19);
        weitage.addEntry(3, 64);
        weitage.addEntry(3, 26);
        assertEquals(4, weitage.totalSize());
        assertEquals(50.8, weitage.evaluateFinalGrade());
        assertFalse(weitage.deleteEntry(2, 99));
        assertFalse(weitage.deleteEntry(4, 44));
        assertTrue(weitage.deleteEntry(3, 26));
        assertEquals(3, weitage.totalSize());
        assertEquals(61.42857142857143, weitage.evaluateFinalGrade());
    }
}
