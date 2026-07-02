package com.example;

import com.example.ChainOfResponsibility.ConjuredManaCake;
import com.example.ChainOfResponsibility.DexterityVest;
import com.example.ChainOfResponsibility.ItemHandlerChain;
import com.example.model.Item;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DexterityVestHandlerTest {

    @Mock
    ItemHandlerChain nextMock = mock(ItemHandlerChain.class);

    @Test
    public void item_is_modified_when_the_name_equals_DexterityVest() {

        DexterityVest dexterityVestHandler = new DexterityVest();
        Item expected =  new Item("+5 Dexterity Vest", 10, 20);

        Item actual = new Item("+5 Dexterity Vest", 9, 19);

        dexterityVestHandler.updateQuality(expected);

        assertEquals(expected.toString(), actual.toString());;

    }

    @Test
    void passes_item_to_next_handler_when_item_is_not_DexterityVest(){
        DexterityVest dexterityVestHandler = new DexterityVest();

        dexterityVestHandler.setNextHandler(nextMock);

        Item dumbItem = new Item("Random", 11, 2);

        dexterityVestHandler.updateQuality(dumbItem);

        verify(nextMock).updateQuality(dumbItem);
    }

}
