////////////////////////////////////////////////////////////////////
// [Mattia] [Brunello] [2009096]
// [Samuel] [Peron] [1225423]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss.model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class EItemTest {

    EItem item;

    @Before
    public void initialize() {
        item = new EItem(EItem.itemType.PROCESSOR, 50.0, "Ryzen");
    }

    @Test
    public void testGetItemType() {
        assertEquals(EItem.itemType.PROCESSOR, item.getType());
    }

    @Test
    public void testGetName() {
        assertEquals("Ryzen", item.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(50.0, item.getPrice(), 1e-8);
    }

    @Test
    public void testSetNegativePrice() {
        try {
            new EItem(EItem.itemType.PROCESSOR, -50.0, "Ryzen");
        } catch (IllegalArgumentException e) {
            assertEquals("Il prezzo deve essere maggiore 0", e.getMessage());
        }
    }
}