package com.example.service;

import com.example.Abstractions.QualityUpdater;
import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public class SulfurasHandofRagnaros implements QualityUpdater {


    @Override
    public Item updateQuality( Item items) {

            return items;
        }
}
