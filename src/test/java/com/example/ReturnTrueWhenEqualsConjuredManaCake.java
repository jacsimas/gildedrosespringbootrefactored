package com.example;

import com.example.ChainOfResponsibility.ConjuredManaCake;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReturnTrueWhenEqualsConjuredManaCake {

    @Test
    public void shouldReturnTrueWhenEqualsConjuredManaCake() {
        ConjuredManaCake conjuredManaCake = new ConjuredManaCake();
        Item item = new Item("Conjured Mana Cake", 3, 6);

        boolean result = conjuredManaCake.updateQuality(item);
        assertTrue(result);
    }

}
