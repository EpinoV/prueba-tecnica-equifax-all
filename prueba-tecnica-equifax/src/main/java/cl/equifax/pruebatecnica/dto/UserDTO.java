package cl.equifax.pruebatecnica.dto;

import cl.equifax.pruebatecnica.enums.RoleEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {
    private int userId;
    @NotBlank(message = "Debe ingresar nombre")
    private String name;
    @NotBlank(message = "Debe ingresar email")
    private String email;
    @NotBlank(message = "Debe ingresar contraseña")
    private String password;
    @Enumerated(EnumType.STRING)
    private RoleEnum role = RoleEnum.USER;
}
