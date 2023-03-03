package jav002.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Table(name = "CATEGORY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity implements Serializable {
    private static final long serialVersionUID=4471777119419172870L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categorySeq")
    @SequenceGenerator(name = "categorySeq", sequenceName = "category_id_Seq", allocationSize = 1)
    private Long id;
    @Column(name = "NAME", unique = true)
    private String name;
    @Column(name = "AVAILABLE", unique = true)
    private Boolean available;

}
