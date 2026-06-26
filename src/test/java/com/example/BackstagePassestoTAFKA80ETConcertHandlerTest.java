package com.example;

import com.example.ChainOfResponsibility.BackstagePassestoaTAFKAL80ETCconcert;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackstagePassestoTAFKA80ETConcertHandlerTest {

    BackstagePassestoaTAFKAL80ETCconcert backstagePassestoaTAFKAL80ETCconcert = new BackstagePassestoaTAFKAL80ETCconcert();
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);

    @Test
    void assertEqualsWhenEqualsBackstagePassestoTAFKA80ETCconcert() {

        Item actual = new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21);

        Item expected = backstagePassestoaTAFKAL80ETCconcert.updateQuality(item);
        assertEquals(expected.toString(), actual.toString());
    }
}
