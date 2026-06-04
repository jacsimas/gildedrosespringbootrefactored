package com.gildedrose;

import com.gildedrose.model.Item;
import com.gildedrose.service.InventoryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class GildedRoseSpringApplicationTests {

    Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6) };


    InventoryService app = new InventoryService();

    @Test
    public void foo() {

        app.distribute(items);
        assertEquals("+5 Dexterity Vest", items[0].name);
        assertEquals("Aged Brie", items[1].name);
        assertEquals("Elixir of the Mongoose", items[2].name);
        assertEquals("Sulfuras, Hand of Ragnaros", items[3].name);
        assertEquals("Sulfuras, Hand of Ragnaros", items[4].name);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", items[5].name);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", items[6].name);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", items[7].name);
        assertEquals("Conjured Mana Cake", items[8].name);
    }

    @Test
    public void updateQualityTest() {

        app.distribute(items);
        assertEquals(9, items[0].sellIn);
            assertEquals(19, items[0].quality);


        assertEquals(1, items[1].sellIn);
        assertEquals(1, items[1].quality);

        assertEquals(4, items[2].sellIn);
        assertEquals(6, items[2].quality);

        assertEquals(0, items[3].sellIn);
        assertEquals(80, items[3].quality);

        assertEquals(-1, items[4].sellIn);
        assertEquals(80, items[4].quality);


        assertEquals(14, items[5].sellIn);
        assertEquals(21, items[5].quality);

        assertEquals(9, items[6].sellIn);
        assertEquals(50, items[6].quality);

        assertEquals(4, items[7].sellIn);
        assertEquals(50, items[7].quality);

        assertEquals(2, items[8].sellIn);
        assertEquals(5, items[8].quality);

    }

}
