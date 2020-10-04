package com.confectionery.services.client_service.repos;

import com.confectionery.services.client_service.models.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends CrudRepository<Worker, String> {
}
