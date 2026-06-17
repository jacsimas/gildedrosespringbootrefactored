package com.example.ChainOfResponsibility;

import com.example.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemsService {

    private Chain chain;


    public void  setItemsChain(Chain chain){

        this.chain = chain;
    }

    public void updateItems(Item items){

        chain.updateQuality(items);

    }


}
