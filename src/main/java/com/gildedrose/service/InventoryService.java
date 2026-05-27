package com.gildedrose.service;

import com.example.GildedRoseSpring.Abstractions.QualityUpdater;
import com.example.GildedRoseSpring.model.Item;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class InventoryService {


    public Item[] distribute(Item[] items){

        for (int i = 0; i < items.length; i++){

            if  (Objects.equals(items[i].name, "Aged Brie")){
                QualityUpdater qualityUpdater = new AgedBrie();
               Item returnedItem = qualityUpdater.updateQuality(items[i]);
                items[i] = returnedItem;
            }

            if  (Objects.equals(items[i].name, "+5 Dexterity Vest")){
                QualityUpdater qualityUpdater = new DexterityVest();
                Item returnedItem = qualityUpdater.updateQuality(items[i]);
                items[i] = returnedItem;

            }

            if  (Objects.equals(items[i].name, "Elixir of the Mongoose")){
                QualityUpdater qualityUpdater = new ElixiroftheMongoose();
                Item returnedItem = qualityUpdater.updateQuality(items[i]);
                items[i] = returnedItem;

            }

            if  (Objects.equals(items[i].name, "Sulfuras, Hand of Ragnaros")){
                QualityUpdater qualityUpdater = new SulfurasHandofRagnaros();
                Item returnedItem = qualityUpdater.updateQuality(items[i]);
                items[i] = returnedItem;

            }

            if  (Objects.equals(items[i].name, "Backstage passes to a TAFKAL80ETC concert")){
                QualityUpdater qualityUpdater = new BackstagePassestoaTAFKAL80ETCconcert();
                Item returnedItem = qualityUpdater.updateQuality(items[i]);
                items[i] = returnedItem;

            }

            if  (Objects.equals(items[i].name, "Conjured Mana Cake")){
                QualityUpdater qualityUpdater = new ConjuredManaCake();
                Item returnedItem = qualityUpdater.updateQuality(items[i]);
                items[i] = returnedItem;

            }

        }

        return items;

   }


}
