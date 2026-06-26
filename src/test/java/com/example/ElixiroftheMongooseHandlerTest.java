package com.example;

import com.example.ChainOfResponsibility.ElixiroftheMongoose;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ElixiroftheMongooseHandlerTest {

    ElixiroftheMongoose elixiroftheMongoose = new ElixiroftheMongoose();
    Item item = new Item("Elixir of the Mongoose", 5, 7);

    @Test
    public void assertEqualsWhenEqualsElexiroftheMongoose() {

        Item actual = new Item("Elixir of the Mongoose", 4, 6);

        Item expected = elixiroftheMongoose.updateQuality(item);
        assertEquals(expected.toString(), actual.toString());
    }

}
