package cl.equifax.pruebatecnica.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataDTO {
    private String nombre;
    private String rut;
    private String celular;
    private String email;
}
