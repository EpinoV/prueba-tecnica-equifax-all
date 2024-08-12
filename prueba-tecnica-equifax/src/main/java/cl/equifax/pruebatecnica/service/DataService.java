package cl.equifax.pruebatecnica.service;

import cl.equifax.pruebatecnica.dto.DataDTO;

import java.util.List;

public interface DataService {
    List<DataDTO> getAllData();

    DataDTO newData(DataDTO data);
}
