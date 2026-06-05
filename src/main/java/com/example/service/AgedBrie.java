package com.example.service;

import com.example.Abstractions.QualityUpdater;
import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public class AgedBrie implements QualityUpdater {


    @Override
    public Item updateQuality(Item items) {

                if (items.quality < 50) {
                    items.quality = items.quality + 1;

                }

                items.sellIn = items.sellIn - 1;

            if (items.sellIn < 0) {

                    if (items.quality < 50) {
                        items.quality = items.quality + 1;
                    }
                }

            return items;
     }

}
