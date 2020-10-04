package com.confectionery.services.client_service.repos;

import com.confectionery.services.client_service.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {
}
