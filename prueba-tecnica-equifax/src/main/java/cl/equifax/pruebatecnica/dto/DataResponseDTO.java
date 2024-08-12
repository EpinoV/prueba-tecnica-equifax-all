package cl.equifax.pruebatecnica.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataResponseDTO {
    private String nombre;
    private String rut;
    private String celular;
    private String email;
}
