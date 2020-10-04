package com.confectionery.services.client_service;

import com.confectionery.services.client_service.models.Worker;
import javassist.NotFoundException;

import java.util.List;

public interface IWorkerService {

    List<Worker> findAll();

    Worker save(Worker workerForSave);

    Worker getById(String id) throws NotFoundException;

    void deleteById(String id) throws NotFoundException;
}