package cl.equifax.pruebatecnica.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataRequestDTO {
    @NotBlank(message = "Debe ingresar nombre")
    private String nombre;
    @NotBlank(message = "Debe ingresar rut")
    private String rut;
    private String celular;
    private String email;
}
