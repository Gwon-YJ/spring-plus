package org.example.expert.domain.todo.repository;


import org.example.expert.domain.todo.entity.Todo;

import java.util.Optional;

// QueryDSL를 위한 인터페이스 추가
public interface TodoCustomRepository {
    Optional<Todo> findByIdWithUser(Long todoId);
}
