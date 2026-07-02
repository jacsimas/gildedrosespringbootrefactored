package com.example;

import com.example.ChainOfResponsibility.ElixiroftheMongoose;
import com.example.ChainOfResponsibility.ItemHandlerChain;
import com.example.ChainOfResponsibility.SulfurasHandofRagnaros;
import com.example.model.Item;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SulfurasHandOfRagnarosHandlerTest {

    @Mock
    ItemHandlerChain nextMock = mock(ItemHandlerChain.class);

    @Test
    public void item_is_modified_when_the_name_equals_HandOfRagnaros() {

        SulfurasHandofRagnaros sulfurasHandofRagnarosHandler = new SulfurasHandofRagnaros();
        Item expected = new Item("Sulfuras, Hand of Ragnaros", 0, 80);

        Item actual = new Item("Sulfuras, Hand of Ragnaros", 0, 80);

        sulfurasHandofRagnarosHandler.updateQuality(expected);

        assertEquals(expected.toString(), actual.toString());;

    }

    @Test
    void passes_item_to_next_handler_when_item_is_not_HandOfRagnaros(){
        SulfurasHandofRagnaros sulfurasHandofRagnarosHandler = new SulfurasHandofRagnaros();

        sulfurasHandofRagnarosHandler.setNextHandler(nextMock);

        Item dumbItem = new Item("Random", 11, 2);

        sulfurasHandofRagnarosHandler.updateQuality(dumbItem);

        verify(nextMock).updateQuality(dumbItem);
    }

}
