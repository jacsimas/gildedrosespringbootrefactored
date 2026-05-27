package com.gildedrose.service;

import com.example.GildedRoseSpring.Abstractions.QualityUpdater;
import com.example.GildedRoseSpring.model.Item;
import org.springframework.stereotype.Service;

@Service
public class SulfurasHandofRagnaros implements QualityUpdater {


    @Override
    public Item updateQuality( Item items) {

            return items;
        }
}
