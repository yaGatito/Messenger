package com.messageservice.dto;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.Objects;

@Data
@NoArgsConstructor
public class UsernameDto {

    private Long id;
    private String username;

    public UsernameDto(String username){
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsernameDto username1 = (UsernameDto) o;
        return username != null && Objects.equals(username, username1.username);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
