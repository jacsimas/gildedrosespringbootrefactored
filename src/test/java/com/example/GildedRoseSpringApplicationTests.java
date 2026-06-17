package com.example;

import com.example.ChainOfResponsibility.*;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class GildedRoseSpringApplicationTests {


    Item[] items = new Item[]{
        new Item("+5 Dexterity Vest", 10, 20), //
        new Item("Aged Brie", 2, 0), //
        new Item("Elixir of the Mongoose", 5, 7), //
        new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
        new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        // this conjured item does not work properly yet
        new Item("Conjured Mana Cake", 3, 6)};


    @Test
    public void shouldReturnTrueWhenEqualsDexterityVest() {
        DexterityVest dexterityVest = new DexterityVest();

        Item item = new Item("+5 Dexterity Vest", 10, 20);

        boolean result = dexterityVest.updateQuality(item);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenEqualsAGedBrie() {

        AgedBrie agedBrie = new AgedBrie();

        Item item = new Item("Aged Brie", 2, 0);

        boolean result = agedBrie.updateQuality(item);
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenEqualsBackstagePassestoTAFKA80ETCconcert() {

        BackstagePassestoaTAFKAL80ETCconcert backstagePassestoaTAFKAL80ETCconcert = new BackstagePassestoaTAFKAL80ETCconcert();
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);

        boolean result = backstagePassestoaTAFKAL80ETCconcert.updateQuality(item);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenEqualsElexiroftheMongoose() {
        ElixiroftheMongoose elixiroftheMongoose = new ElixiroftheMongoose();
        Item item = new Item("Elixir of the Mongoose", 5, 7);

        boolean result = elixiroftheMongoose.updateQuality(item);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenEqualsSulfurasHandOfRagnaros() {
        SulfurasHandofRagnaros sulfurasHandofRagnaros = new SulfurasHandofRagnaros();
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);

        boolean result = sulfurasHandofRagnaros.updateQuality(item);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenEqualsConjuredManaCake() {
        ConjuredManaCake conjuredManaCake = new ConjuredManaCake();
        Item item = new Item("Conjured Mana Cake", 3, 6);

        boolean result = conjuredManaCake.updateQuality(item);
        assertTrue(result);
    }

   @Test
    void shouldPassToNextHandlerIfFalse(){

   }

}
