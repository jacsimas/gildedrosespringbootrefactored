package com.example.ChainOfResponsibility;

import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ConjuredManaCake extends ItemHandlerChain {



    public void setNextHandler() {

    }


    @Override
    public Item updateQuality(Item items) {

        if (items.name.equals("Conjured Mana Cake")) {

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
        return items;

    }

}
