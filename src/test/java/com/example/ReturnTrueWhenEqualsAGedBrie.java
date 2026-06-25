package com.example;

import com.example.ChainOfResponsibility.AgedBrie;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReturnTrueWhenEqualsAGedBrie {

    AgedBrie agedBrie = new AgedBrie();
    Item item = new Item("Aged Brie", 2, 0);

    @Test
    public void assertEqualsWhenEqualsAGedBrie() {

        Item expected = new Item("Aged Brie", 1, 1);
        Item actual = new Item("Aged Brie", 1, 1);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void shouldReturnTrueWhenEqualsAGedBrie() {
        boolean result = agedBrie.updateQuality(item);
        assertTrue(result);
    }
}
