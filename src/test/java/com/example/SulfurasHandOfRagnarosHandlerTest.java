package com.example;

import com.example.ChainOfResponsibility.SulfurasHandofRagnaros;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SulfurasHandOfRagnarosHandlerTest {

    SulfurasHandofRagnaros sulfurasHandofRagnaros = new SulfurasHandofRagnaros();
    Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);

    @Test
    public void assertEqualsWhenEqualsSulfurasHandOfRagnaros() {

        Item actual = new Item("Sulfuras, Hand of Ragnaros", 0, 80);

        Item expected = sulfurasHandofRagnaros.updateQuality(item);
        assertEquals(expected.toString(), actual.toString());
    }

}
