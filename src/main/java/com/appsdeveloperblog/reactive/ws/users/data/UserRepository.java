package com.appsdeveloperblog.reactive.ws.users.data;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface UserRepository extends R2dbcRepository<UserEntity, UUID> {

}
