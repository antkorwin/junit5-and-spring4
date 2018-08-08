package com.antkorwin.junit5spring4.model;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created on 07.08.2018.
 *
 * TODO: replace on javadoc
 *
 * @author Korovin Anatoliy
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    @Type(type = "uuid-char")
    private UUID id;

    private String name;
}
