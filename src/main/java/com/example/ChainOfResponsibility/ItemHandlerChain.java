package com.example.ChainOfResponsibility;

import com.example.model.Item;

public interface ItemHandlerChain {


    default void setNextHandler(ItemHandlerChain next){
    }

    void updateQuality(Item items);

}
