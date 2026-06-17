package com.example.ChainOfResponsibility;

import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public class DexterityVest extends Chain {


    @Override
    public boolean updateQuality(Item items){

        if (items.name.equals("+5 Dexterity Vest")) {

            if (items.quality > 0) {
                items.quality = items.quality - 1;
            }

            items.sellIn = items.sellIn - 1;

            if (items.sellIn < 0) {
                if (items.quality > 0) {
                    items.quality = items.quality - 1;
                }
            }
            System.out.println(items);

            return true;
        } else   return checkNext(items);

    }

}
