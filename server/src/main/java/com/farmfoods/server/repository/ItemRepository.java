package com.farmfoods.server.repository;

import com.farmfoods.server.model.Item;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "item", path = "item")
public interface ItemRepository extends CrudRepository<Item, Long>, JpaSpecificationExecutor<Item>, PagingAndSortingRepository<Item,Long> {

    List<Item> findAll();

}
