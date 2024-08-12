package cl.equifax.pruebatecnica.controller;

import cl.equifax.pruebatecnica.dto.DataDTO;
import cl.equifax.pruebatecnica.dto.DataRequestDTO;
import cl.equifax.pruebatecnica.dto.DataResponseDTO;
import cl.equifax.pruebatecnica.service.DataService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/prueba-tecnica-equifax/api/v1/private")
@RequiredArgsConstructor
@Slf4j
public class DataController {
    private final DataService service;

    @GetMapping(value = "/allData", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DataDTO>> allUsers(){
        log.info("Todos los usuarios");

        List<DataDTO> result = service.getAllData();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(value = "/newData", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DataDTO> newData(
            @Valid @RequestBody DataRequestDTO request
    ){
        log.info("nuevo usuario");

        DataDTO result = service.newData(new DataDTO());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
