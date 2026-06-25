package com.example;

import com.example.ChainOfResponsibility.AgedBrie;
import com.example.ChainOfResponsibility.ItemHandlerChain;
import com.example.model.Item;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ItemHandlerChainTest {


    AgedBrie agedBrieHandler = new AgedBrie();
    ItemHandlerChain next = mock(ItemHandlerChain.class);

    @Test
    void shouldPassToNextHandlerWhenCurrentCheckPasses() {
        Item item = new Item("random", 2, 2);

        agedBrieHandler.setNextHandler(next);

        when(next.checkNext(item)).thenReturn(true);

        boolean result = agedBrieHandler.updateQuality(item);

        assertTrue(result);
        verify(next).checkNext(item);
    }

    @Test
    void mustNotPassToNextHandlerWhenCurrentCheckPasses() {

        Item item2 = new Item("Aged Brie", 2, 0);

        agedBrieHandler.setNextHandler(next);

        when(next.checkNext(item2)).thenReturn(true);

        boolean result = agedBrieHandler.updateQuality(item2);

        assertFalse(result);
        verify(next).checkNext(item2);
    }

}
