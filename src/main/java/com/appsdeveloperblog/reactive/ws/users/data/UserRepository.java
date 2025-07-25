package com.appsdeveloperblog.reactive.ws.users.data;

import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

import java.util.UUID;

public interface UserRepository extends R2dbcRepository<UserEntity, UUID> {
    Flux<UserEntity> findAllBy(Pageable pageable);
}
