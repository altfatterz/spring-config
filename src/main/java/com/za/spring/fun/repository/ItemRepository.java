package com.za.spring.fun.repository;

import org.springframework.data.repository.Repository;

import com.za.spring.fun.model.Item;

/**
 * Repository interface for {@link Item}
 *
 * @author Zoltan Altfatter
 */
public interface ItemRepository extends Repository<Item, Long> {

    Item findOne(Long id);

    Item save(Item item);
}
