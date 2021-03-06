package com.confectionery.api.controllers;

import com.confectionery.services.client_service.models.Worker;
import com.confectionery.api.payloads.WorkerPayload;
import com.confectionery.ConfectioneryApplication;
import com.confectionery.services.client_service.IWorkerService;
import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/workers")
@RequiredArgsConstructor
public final class WorkerController {

    static final Logger log = LoggerFactory.getLogger(ConfectioneryApplication.class);

    @Autowired
    private IWorkerService workerService;

    @GetMapping
    public ResponseEntity<List<Worker>> index() {
        return ResponseEntity.ok(workerService.findAll());
    }

    @PostMapping
    public ResponseEntity<Worker> create(@RequestBody WorkerPayload payload) {
        Worker newWorker = new Worker(payload.getName(),
                payload.getSurname());
        return ResponseEntity.ok(workerService.save(newWorker));
    }

    @GetMapping("{workerId}")
    public ResponseEntity<Worker> show(@PathVariable String workerId) throws NotFoundException {
        return ResponseEntity.ok(workerService.getById(workerId));
    }

    @DeleteMapping("{workerId}")
    public ResponseEntity<Void> delete(@PathVariable String workerId) throws NotFoundException {
        workerService.deleteById(workerId);
        return ResponseEntity.noContent().build();
    }
}
