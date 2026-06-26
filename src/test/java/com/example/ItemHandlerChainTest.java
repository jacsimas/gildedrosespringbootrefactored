package com.example;

import com.example.ChainOfResponsibility.AgedBrie;
import com.example.ChainOfResponsibility.ItemHandlerChain;
import com.example.model.Item;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ItemHandlerChainTest {


    AgedBrie agedBrieHandler = new AgedBrie();
    ItemHandlerChain next = mock(ItemHandlerChain.class);
    Item item = new Item("Aged Brie", 2, 0);
    Item expected = new Item("Aged Brie", 1, 1);



}
