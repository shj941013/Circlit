package com.circlit.circlit.repositories;

import com.circlit.circlit.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository <ItemRepository, Integer> {

    void createItem(Item item);
    void deleteItem(Item item);
}
