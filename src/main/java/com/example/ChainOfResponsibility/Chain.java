package com.example.ChainOfResponsibility;

import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public abstract class Chain {

    private Chain next;


    public static Chain link(Chain first, Chain... chain){
        Chain head = first;
        for (Chain nextInChain : chain){
            head.next = nextInChain;
            head =  nextInChain;
        }
        return first;
    }

    public abstract boolean updateQuality(Item items);

    protected boolean checkNext(Item items){

        if(next == null){
            return true;
        }
        return next.updateQuality(items);
    }

}
