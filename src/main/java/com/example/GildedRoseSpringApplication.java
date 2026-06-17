package com.example;

import com.example.ChainOfResponsibility.*;
import com.example.model.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class GildedRoseSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GildedRoseSpringApplication.class, args);
	}


    @Bean
    CommandLineRunner run(ItemsService itemsService) {
        return args -> {

            Item[] items = new Item[] {
                    new Item("+5 Dexterity Vest", 10, 20), //
                    new Item("Aged Brie", 2, 0), //
                    new Item("Elixir of the Mongoose", 5, 7), //
                    new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                    new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                    // this conjured item does not work properly yet
                    new Item("Conjured Mana Cake", 3, 6) };


            System.out.println("                                                    ");
            System.out.println("                                                    ");

            for (Item eachItem : items){
                System.out.println(eachItem);
            }

            System.out.println("                                                    ");
            System.out.println("====================================================");
            System.out.println("====================================================");
            System.out.println("                                                    ");


            Chain chain = Chain.link(
                new DexterityVest(),
                new AgedBrie(),
                new ElixiroftheMongoose(),
                new SulfurasHandofRagnaros(),
                new BackstagePassestoaTAFKAL80ETCconcert(),
                new ConjuredManaCake()
                );

            itemsService.setItemsChain(chain);

            for (Item eachItem : items){
                itemsService.updateItems(eachItem);
            }


        };
    }


}

