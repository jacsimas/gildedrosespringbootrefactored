package com.gildedrose.service;

import com.example.GildedRoseSpring.Abstractions.QualityUpdater;
import com.example.GildedRoseSpring.model.Item;
import org.springframework.stereotype.Service;

@Service
public class BackstagePassestoaTAFKAL80ETCconcert implements QualityUpdater {

    @Override
    public Item updateQuality(Item items) {

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

        return items;

    }

}
