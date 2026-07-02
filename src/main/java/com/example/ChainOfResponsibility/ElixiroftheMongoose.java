package com.example.ChainOfResponsibility;

import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ElixiroftheMongoose implements ItemHandlerChain {

    ItemHandlerChain next;

    @Override
    public void setNextHandler(ItemHandlerChain next) {
        this.next = next;
    }

    @Override
    public void updateQuality(Item items) {

        if (items.name.equals("Elixir of the Mongoose")) {

            if (items.quality > 0) {
                items.quality = items.quality - 1;
            }

            items.sellIn = items.sellIn - 1;

            if (items.sellIn < 0) {
                if (items.quality > 0) {
                    items.quality = items.quality - 1;
                }
            }
        }
        else if (next != null) {
            next.updateQuality(items);
        }
    }

}
