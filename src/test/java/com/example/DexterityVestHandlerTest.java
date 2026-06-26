package com.example;

import com.example.ChainOfResponsibility.DexterityVest;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DexterityVestHandlerTest {

    DexterityVest dexterityVest = new DexterityVest();
    Item item =  new Item("+5 Dexterity Vest", 10, 20);

    @Test
    public void assertEqualsWhenEqualsDexterityVest() {

        Item actual = new Item("+5 Dexterity Vest", 9, 19);

        Item expected = dexterityVest.updateQuality(item);
        assertEquals(expected.toString(), actual.toString());
    }


}
