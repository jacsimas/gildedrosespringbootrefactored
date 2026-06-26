package com.example;

import com.example.ChainOfResponsibility.ConjuredManaCake;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConjuredManaCakeHandlerTest {

    ConjuredManaCake conjuredManaCake = new ConjuredManaCake();
    Item item = new Item("Conjured Mana Cake", 3, 6);

    @Test
    public void assertEqualsWhenEqualsConjuredManaCake() {

        Item actual = new Item("Conjured Mana Cake", 2, 5);

        Item expected = conjuredManaCake.updateQuality(item);
        assertEquals(expected.toString(), actual.toString());
    }

}
