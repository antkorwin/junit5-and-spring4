package com.antkorwin.junit5spring4.repository;

import com.antkorwin.junit5spring4.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created on 07.08.2018.
 *
 * TODO: replace on javadoc
 *
 * @author Korovin Anatoliy
 */
public interface TaskRepository extends JpaRepository<Task, UUID> {
}
