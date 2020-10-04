package com.confectionery.services.order_service.repos;

import com.confectionery.services.order_service.models.Dessert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DessertRepository extends CrudRepository<Dessert, String> {
}
