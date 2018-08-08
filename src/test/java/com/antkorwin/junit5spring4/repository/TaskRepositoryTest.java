package com.antkorwin.junit5spring4.repository;


import com.antkorwin.junit5integrationtestutils.test.runners.stereotype.PostgresIntegrationTests;
import com.antkorwin.junit5spring4.model.Task;
import com.github.database.rider.core.api.dataset.ExpectedDataSet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created on 07.08.2018.
 *
 * TODO: replace on javadoc
 *
 * @author Korovin Anatoliy
 */
@PostgresIntegrationTests
class TaskRepositoryTest {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    @ExpectedDataSet("dataset/expected.json")
    void name() throws Exception {
        // Arrange
        Task task = Task.builder()
                        .name("name")
                        .build();
        // Act
        taskRepository.save(task);
    }
}
