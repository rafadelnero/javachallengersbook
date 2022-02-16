package com.javachallengers.streams;

import java.math.BigDecimal;
import java.util.List;

public class MapRealExample {

    public static void main(String[] args) {
        ItemRepository itemRepository = new ItemRepository();
        final List<ItemDTO> itemDtoList = itemRepository
                .findAll()
                .stream()
                .map(ItemMapper::toDTO)
                .toList();

        System.out.println(itemDtoList);
    }
}

class ItemMapper {
    static ItemDTO toDTO(Item item) {
        return new ItemDTO(item.id, item.description, item.price);
    }
}

class ItemDTO {
    long id;
    String description;
    BigDecimal price;

    public ItemDTO(long id, String description, BigDecimal price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

class Item {
    long id;
    String description;
    BigDecimal price;

    public Item(long id, String description, BigDecimal price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
}

class ItemRepository {
    List<Item> findAll() {
        return List.of(new Item(1L, "PS5", new BigDecimal("650")),
                new Item(2L, "Xbox Series X", new BigDecimal("600")));
    }
}