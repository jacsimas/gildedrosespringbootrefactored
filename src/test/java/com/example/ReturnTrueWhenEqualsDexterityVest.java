package com.example;

import com.example.ChainOfResponsibility.DexterityVest;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReturnTrueWhenEqualsDexterityVest {

    @Test
    public void shouldReturnTrueWhenEqualsDexterityVest() {
        DexterityVest dexterityVest = new DexterityVest();

        Item item = new Item("+5 Dexterity Vest", 10, 20);

        boolean result = dexterityVest.updateQuality(item);
        assertTrue(result);
    }


}
