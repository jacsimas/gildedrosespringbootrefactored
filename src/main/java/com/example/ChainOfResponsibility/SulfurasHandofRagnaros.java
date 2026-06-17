package com.example.ChainOfResponsibility;

import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public class SulfurasHandofRagnaros extends Chain {


    @Override
    public boolean updateQuality(Item items) {
        if (items.name.equals("Sulfuras, Hand of Ragnaros")) {
            System.out.println(items);
            return true;
        }
        return checkNext(items);
    }

}
