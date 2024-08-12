package cl.equifax.pruebatecnica.controller;

import cl.equifax.pruebatecnica.dto.AuthenticationRequestDTO;
import cl.equifax.pruebatecnica.dto.AuthenticationResponseDTO;
import cl.equifax.pruebatecnica.dto.RegisterRequestDTO;
import cl.equifax.pruebatecnica.dto.RegisterResponseDTO;
import cl.equifax.pruebatecnica.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/prueba-tecnica-equifax/api/v1/public/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RegisterResponseDTO> register(
            @RequestBody RegisterRequestDTO request
    ) {
        log.info("Registrando..");


        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping (value = "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AuthenticationResponseDTO> authenticate(
            @RequestBody AuthenticationRequestDTO request
    ) {
        log.info("Autenticando..");


        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
