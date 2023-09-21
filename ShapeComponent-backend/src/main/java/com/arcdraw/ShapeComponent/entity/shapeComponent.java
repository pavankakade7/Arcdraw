package com.arcdraw.ShapeComponent.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Shape")
public class shapeComponent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shape_id;


    @Column(name = "Name_of_shape")
    private String name;


    @Column(name = "Type_of_shape")
    private String type; // it is used to show in which category it is used eg.general misc advance or basic like this


    @Column(name = "shape_data", nullable = false , unique = true)
    private String shape_data;
}
