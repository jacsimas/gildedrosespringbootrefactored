package com.example.ChainOfResponsibility;

import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public class BackstagePassestoaTAFKAL80ETCconcert implements ItemHandlerChain {

    ItemHandlerChain next;

    @Override
    public void setNextHandler(ItemHandlerChain next) {
        this.next = next;
    }

    @Override
    public void updateQuality(Item items) {

        if (items.name.equals("Backstage passes to a TAFKAL80ETC concert")) {

            if (items.quality < 50) {
                items.quality = items.quality + 1;

                if (items.sellIn < 11) {
                    if (items.quality < 50) {
                        items.quality = items.quality + 1;
                    }
                }

                if (items.sellIn < 6) {
                    if (items.quality < 50) {
                        items.quality = items.quality + 1;
                    }
                }
            }

            items.sellIn = items.sellIn - 1;

            if (items.sellIn < 0) {

                items.quality = items.quality - items.quality;
            }

        }

        else if (next != null) {
            next.updateQuality(items);
        }
    }

}
