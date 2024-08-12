package cl.equifax.pruebatecnica.service.impl;

import cl.equifax.pruebatecnica.dto.DataDTO;
import cl.equifax.pruebatecnica.repository.DataRepository;
import cl.equifax.pruebatecnica.service.DataService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.MockitoAnnotations.openMocks;

class DataServiceImplTest {

    private DataService service;

    @Mock
    private DataRepository repository;

    @BeforeEach
    void setUp() {
        openMocks(this);

        service = new DataServiceImpl(repository);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getAllData_empty() {
        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>(Collections.emptyList()));

        List<DataDTO> list = service.getAllData();

        Assertions.assertThat(list).isEmpty();
    }

    @Test
    void newData() {
    }
}