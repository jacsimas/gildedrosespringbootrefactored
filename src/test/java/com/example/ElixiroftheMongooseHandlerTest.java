package com.example;

import com.example.ChainOfResponsibility.DexterityVest;
import com.example.ChainOfResponsibility.ElixiroftheMongoose;
import com.example.ChainOfResponsibility.ItemHandlerChain;
import com.example.model.Item;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ElixiroftheMongooseHandlerTest {

    @Mock
    ItemHandlerChain nextMock = mock(ItemHandlerChain.class);

    @Test
    public void item_is_modified_when_the_name_equals_ElexiroftheMongoose() {

        ElixiroftheMongoose elixiroftheMongooseHandler = new ElixiroftheMongoose();
        Item item = new Item("Elixir of the Mongoose", 5, 7);

        elixiroftheMongooseHandler.updateQuality(item);

        assertEquals(item.sellIn, 4);;
        assertEquals(item.quality, 6);;
    }

    @Test
    void passes_item_to_next_handler_when_item_is_not_ElexiroftheMongoose(){
        ElixiroftheMongoose elixiroftheMongooseHandler = new ElixiroftheMongoose();

        elixiroftheMongooseHandler.setNextHandler(nextMock);

        Item dumbItem = new Item("Random", 11, 2);

        elixiroftheMongooseHandler.updateQuality(dumbItem);

        verify(nextMock).updateQuality(dumbItem);
    }

}
