package cl.equifax.pruebatecnica.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DATA")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DATA_ID")
    private Integer dataId;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "RUT")
    private String rut;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "EMAIL")
    private String email;
}
