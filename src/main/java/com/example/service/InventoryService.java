package com.example.service;

import com.example.model.Item;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class InventoryService {


    AgedBrie agedBrie;
    DexterityVest dexterityVest;
    ElixiroftheMongoose elixiroftheMongoose;
    SulfurasHandofRagnaros sulfurasHandofRagnaros;
    BackstagePassestoaTAFKAL80ETCconcert backstagePassestoaTAFKAL80ETCconcert;
    ConjuredManaCake conjuredManaCake;

    public InventoryService(AgedBrie agedBrie, DexterityVest dexterityVest, ElixiroftheMongoose elixiroftheMongoose, SulfurasHandofRagnaros sulfurasHandofRagnaros, BackstagePassestoaTAFKAL80ETCconcert backstagePassestoaTAFKAL80ETCconcert, ConjuredManaCake conjuredManaCake){
        this.agedBrie = agedBrie;
        this.dexterityVest = dexterityVest;
        this.elixiroftheMongoose = elixiroftheMongoose;
        this.sulfurasHandofRagnaros = sulfurasHandofRagnaros;
        this.backstagePassestoaTAFKAL80ETCconcert = backstagePassestoaTAFKAL80ETCconcert;
        this.conjuredManaCake = conjuredManaCake;
    }


    public Item[] distribute(Item[] items){

        for (int i = 0; i < items.length; i++){

            items[i] = IsAgedBrie(items[i]);

            items[i] = IsDexterityVest(items[i]);

            items[i] = IsElixiroftheMongoose(items[i]);

            items[i] = IsSulfurasHandofRagnaros(items[i]);

            items[i] = IsBackstagepassestoaTAFKAL80ETCconcert(items[i]);

            items[i] = IsConjuredManaCake(items[i]);

        }

        return items;

    }

    public Item IsAgedBrie(Item items){

        if  (Objects.equals(items.name, "Aged Brie")){
            return agedBrie.updateQuality(items);
        } else {
            return items;
        }
    }

    public Item IsDexterityVest(Item items){
        if  (Objects.equals(items.name, "+5 Dexterity Vest")){
            return dexterityVest.updateQuality(items);
        }
        else {
            return items;
        }
    }

    public Item IsElixiroftheMongoose(Item items){
        if  (Objects.equals(items.name, "Elixir of the Mongoose")){
            return elixiroftheMongoose.updateQuality(items);
        }
        else {
            return items;
        }
    }

    public Item IsSulfurasHandofRagnaros(Item items){
        if  (Objects.equals(items.name, "Sulfuras, Hand of Ragnaros")){
            return sulfurasHandofRagnaros.updateQuality(items);
        }
        else {
            return items;
        }
    }

    public Item IsBackstagepassestoaTAFKAL80ETCconcert(Item items){
        if  (Objects.equals(items.name, "Backstage passes to a TAFKAL80ETC concert")){
            return backstagePassestoaTAFKAL80ETCconcert.updateQuality(items);
        }
        else {
            return items;
        }
    }

    public Item IsConjuredManaCake(Item items){
        if  (Objects.equals(items.name, "Conjured Mana Cake")){
            return conjuredManaCake.updateQuality(items);
        }
        else {
            return items;
        }
    }

}
