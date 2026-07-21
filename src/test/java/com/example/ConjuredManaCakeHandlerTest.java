package com.example;

import com.example.ChainOfResponsibility.BackstagePassestoaTAFKAL80ETCconcert;
import com.example.ChainOfResponsibility.ConjuredManaCake;
import com.example.ChainOfResponsibility.ItemHandlerChain;
import com.example.model.Item;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ConjuredManaCakeHandlerTest {

    @Mock
    ItemHandlerChain nextMock = mock(ItemHandlerChain.class);

    @Test
    public void item_is_modified_when_the_name_equals_ConjuredManaCake() {

        ConjuredManaCake conjuredManaCakeHandler = new ConjuredManaCake();
        Item item = new Item("Conjured Mana Cake", 3, 6);

        conjuredManaCakeHandler.updateQuality(item);

        assertEquals(item.sellIn, 2);;
        assertEquals(item.quality, 5);;

    }

    @Test
    void passes_item_to_next_handler_when_item_is_not_ConjuredManaCake(){
        ConjuredManaCake conjuredManaCakeHandler = new ConjuredManaCake();

        conjuredManaCakeHandler.setNextHandler(nextMock);

        Item dumbItem = new Item("Random", 11, 2);

        conjuredManaCakeHandler.updateQuality(dumbItem);

        verify(nextMock).updateQuality(dumbItem);
    }

}
