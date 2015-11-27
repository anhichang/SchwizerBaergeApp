package ch.fhnw.oop.PM;

import javafx.collections.ObservableList;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class MountainsPMTest extends TestCase {

    private MountainsPM sut;

    @Before
    public void setUp() throws Exception{
        sut = new MountainsPM();
    }

    @Test
    public void testGetResultate() throws Exception {
        //given
        ObservableList<Mountains> mountains = sut.getResultate();

        //then
        assertTrue(mountains.size()>1);
  //      assertEquals("Albis", mountains.get(0).getBergName());

    //    assertEquals("Zumsteinspitze", mountains.get(mountains.size()-1).getBergName());

    }
}