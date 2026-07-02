package com.example.ChainOfResponsibility;

import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public class SulfurasHandofRagnaros implements ItemHandlerChain {

    ItemHandlerChain next;

    @Override
    public void setNextHandler(ItemHandlerChain next) {
        this.next = next;
    }

    @Override
    public void updateQuality(Item items) {
        if (items.name.equals("Sulfuras, Hand of Ragnaros")) {
        }
        else if (next != null) {
            next.updateQuality(items);
        }
    }

}
