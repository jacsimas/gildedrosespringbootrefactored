package com.example;

import com.example.ChainOfResponsibility.*;
import com.example.model.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GildedRoseSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GildedRoseSpringApplication.class, args);
	}

    public  <T>  void printItems(T[] items){
        for (T eachItem : items){
            System.out.println(eachItem);
        }
    }


    @Bean
    CommandLineRunner run() {
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

            printItems(items);

            System.out.println("                                                    ");
            System.out.println("====================================================");
            System.out.println("====================================================");
            System.out.println("                                                    ");



            AgedBrie agedBrie = new AgedBrie();
            DexterityVest dexterityVest = new DexterityVest();
            ElixiroftheMongoose elixiroftheMongoose = new ElixiroftheMongoose();
            SulfurasHandofRagnaros sulfurasHandofRagnaros = new SulfurasHandofRagnaros();
            BackstagePassestoaTAFKAL80ETCconcert backstagePassestoaTAFKAL80ETCconcert = new BackstagePassestoaTAFKAL80ETCconcert();
            ConjuredManaCake conjuredManaCake = new ConjuredManaCake();

            agedBrie.setNextHandler(dexterityVest);
            dexterityVest.setNextHandler(elixiroftheMongoose);
            elixiroftheMongoose.setNextHandler(sulfurasHandofRagnaros);
            sulfurasHandofRagnaros.setNextHandler(backstagePassestoaTAFKAL80ETCconcert);
            backstagePassestoaTAFKAL80ETCconcert.setNextHandler(conjuredManaCake);
            conjuredManaCake.setNextHandler(null);

            for (Item item : items){
                agedBrie.updateQuality(item);
            }

            printItems(items);

            };
    }

}

/*
+5 Dexterity Vest, 9, 19
Aged Brie, 1, 1
Elixir of the Mongoose, 4, 6
Sulfuras, Hand of Ragnaros, 0, 80
Sulfuras, Hand of Ragnaros, -1, 80
Backstage passes to a TAFKAL80ETC concert, 14, 21
Backstage passes to a TAFKAL80ETC concert, 9, 50
Backstage passes to a TAFKAL80ETC concert, 4, 50
Conjured Mana Cake, 2, 5
 */

