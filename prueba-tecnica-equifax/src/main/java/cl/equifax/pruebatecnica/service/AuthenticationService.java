package cl.equifax.pruebatecnica.service;

import cl.equifax.pruebatecnica.dto.AuthenticationRequestDTO;
import cl.equifax.pruebatecnica.dto.AuthenticationResponseDTO;
import cl.equifax.pruebatecnica.dto.RegisterRequestDTO;
import cl.equifax.pruebatecnica.dto.RegisterResponseDTO;

public interface AuthenticationService {
    RegisterResponseDTO register(RegisterRequestDTO request);

    AuthenticationResponseDTO authenticate(AuthenticationRequestDTO request);

}
