package com.example;

import com.example.ChainOfResponsibility.ElixiroftheMongoose;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReturnTrueWhenEqualsElexiroftheMongoose {

    @Test
    public void shouldReturnTrueWhenEqualsElexiroftheMongoose() {
        ElixiroftheMongoose elixiroftheMongoose = new ElixiroftheMongoose();
        Item item = new Item("Elixir of the Mongoose", 5, 7);

        boolean result = elixiroftheMongoose.updateQuality(item);
        assertTrue(result);
    }

}
