package com.example;

import com.example.ChainOfResponsibility.AgedBrie;
import com.example.ChainOfResponsibility.BackstagePassestoaTAFKAL80ETCconcert;
import com.example.ChainOfResponsibility.ItemHandlerChain;
import com.example.model.Item;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BackstagePassestoTAFKA80ETConcertHandlerTest {

    @Mock
    ItemHandlerChain nextMock = mock(ItemHandlerChain.class);

    @Test
    void item_is_modified_when_the_name_equals_BackstagePassestoTAFKA80ETCconcert() {

        BackstagePassestoaTAFKAL80ETCconcert backstagePassestoaTAFKAL80ETCconcertHandler = new BackstagePassestoaTAFKAL80ETCconcert();
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);

        backstagePassestoaTAFKAL80ETCconcertHandler.updateQuality(item);

        assertEquals(item.sellIn, 14);;
        assertEquals(item.quality, 21);;

    }

    @Test
    void passes_item_to_next_handler_when_item_is_not_BackstagePassestoTAFKA80ETCconcert(){
        BackstagePassestoaTAFKAL80ETCconcert backstagePassestoaTAFKAL80ETCconcertHandler = new BackstagePassestoaTAFKAL80ETCconcert();

        backstagePassestoaTAFKAL80ETCconcertHandler.setNextHandler(nextMock);

        Item dumbItem = new Item("Random", 11, 2);

        backstagePassestoaTAFKAL80ETCconcertHandler.updateQuality(dumbItem);

        verify(nextMock).updateQuality(dumbItem);
    }

}
