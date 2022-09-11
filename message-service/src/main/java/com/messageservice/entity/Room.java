package com.messageservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Username creator;
    private String name;
}
