package com.circlit.repositories;

import com.circlit.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository <Item, Integer> {
//    void createItem(Item item);
//    void deleteItem(Item item);
}
