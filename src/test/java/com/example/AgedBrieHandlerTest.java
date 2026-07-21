package com.example;

import com.example.ChainOfResponsibility.AgedBrie;
import com.example.ChainOfResponsibility.BackstagePassestoaTAFKAL80ETCconcert;
import com.example.ChainOfResponsibility.ItemHandlerChain;
import com.example.model.Item;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class AgedBrieHandlerTest {

    @Mock
    ItemHandlerChain nextMock = mock(ItemHandlerChain.class);

    @Test
    void following_handler_is_set_to_the_local_field_named_next(){
        AgedBrie agedBrieHandler = new AgedBrie();
        BackstagePassestoaTAFKAL80ETCconcert backstagePassestoaTAFKAL80ETCconcertHandler = new BackstagePassestoaTAFKAL80ETCconcert();

        agedBrieHandler.setNextHandler(backstagePassestoaTAFKAL80ETCconcertHandler);

        ItemHandlerChain itemHandlerChain = agedBrieHandler.next;
        assertEquals(backstagePassestoaTAFKAL80ETCconcertHandler, itemHandlerChain);
    }

    @Test
    public void item_is_modified_when_the_name_equals_AgedBrie() {

        AgedBrie agedBrieHandler = new AgedBrie();
        Item item = new Item("Aged Brie", 2, 0);

        Item actual = new Item("Aged Brie", 1, 1);

        agedBrieHandler.updateQuality(item);

        assertEquals(item.sellIn, 1);;
        assertEquals(item.quality, 1);;
    }

    @Test
    void passes_item_to_next_handler_when_item_is_not_AgedBrie(){
        AgedBrie agedBrieHandler = new AgedBrie();

        agedBrieHandler.setNextHandler(nextMock);

        Item dumbItem = new Item("Random", 11, 2);

        agedBrieHandler.updateQuality(dumbItem);

        verify(nextMock).updateQuality(dumbItem);
    }

}
