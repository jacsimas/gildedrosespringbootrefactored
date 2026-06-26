package com.example.ChainOfResponsibility;

import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public abstract class ItemHandlerChain {

    private ItemHandlerChain next;

    public void setNextHandler(ItemHandlerChain next){
        this.next = next;
    }

    public abstract Item updateQuality(Item items);

    public Item checkNext(Item items){

        if(next == null){
            return items;
        }
        return next.updateQuality(items);
    }

}
