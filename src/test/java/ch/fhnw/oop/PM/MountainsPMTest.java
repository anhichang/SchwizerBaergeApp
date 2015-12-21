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
        assertEquals("Albis, Bürglen", mountains.get(0).getBergName());

        assertEquals("Zumsteinspitze", mountains.get(mountains.size()-1).getBergName());

    }

    @Test
    public void testSave() throws Exception {
        sut.getResultate().get(0).setBergName("Test");
        sut.save();

        MountainsPM secondPM = new MountainsPM();

        //then
        assertEquals(sut.getResultate().size(), secondPM.getResultate().size());
        assertEquals("Test", secondPM.getResultate().get(0).getBergName());

        for(int i=0; i<sut.getResultate().size(); i++){
            assertEquals(sut.getResultate().get(i), secondPM.getResultate().get(i));
        }

        //after
        sut.getResultate().get(0).setBergName("Albis, Bürglen");
        sut.save();
    }

    @Test
    public void testDelete() throws Exception{
        sut.delete(0);
        assertEquals("Allalinhorn", sut.getResultate().get(0).getBergName());
    }
}