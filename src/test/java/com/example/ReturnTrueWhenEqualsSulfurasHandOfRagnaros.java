package com.example;

import com.example.ChainOfResponsibility.SulfurasHandofRagnaros;
import com.example.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReturnTrueWhenEqualsSulfurasHandOfRagnaros {


    @Test
    public void shouldReturnTrueWhenEqualsSulfurasHandOfRagnaros() {
        SulfurasHandofRagnaros sulfurasHandofRagnaros = new SulfurasHandofRagnaros();
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);

        boolean result = sulfurasHandofRagnaros.updateQuality(item);
        assertTrue(result);
    }

}
