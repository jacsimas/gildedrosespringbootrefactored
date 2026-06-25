package com.example;

import com.example.ChainOfResponsibility.BackstagePassestoaTAFKAL80ETCconcert;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReturnTrueWhenEqualsBackstagePassestoTAFKA80ETCconcert {

    @Test
    void shouldReturnTrueWhenEqualsBackstagePassestoTAFKA80ETCconcert() {

        BackstagePassestoaTAFKAL80ETCconcert backstagePassestoaTAFKAL80ETCconcert = new BackstagePassestoaTAFKAL80ETCconcert();
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);

        boolean result = backstagePassestoaTAFKAL80ETCconcert.updateQuality(item);
        assertTrue(result);
    }
}
