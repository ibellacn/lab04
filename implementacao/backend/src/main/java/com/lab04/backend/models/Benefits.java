package com.lab04.backend.models;
import com.lab04.backend.dtos.BenefitsDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Benefits")
public class Benefits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "value", length = 100, nullable = false)
    private Double value;

    public Benefits() {
    }

    public Benefits(BenefitsDTO BenefitsDTO) {
        this.id = BenefitsDTO.getId();
        this.name = BenefitsDTO.getName();
        this.value = BenefitsDTO.getValue();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
