package cl.equifax.pruebatecnica.service.impl;

import cl.equifax.pruebatecnica.dto.DataDTO;
import cl.equifax.pruebatecnica.mappers.DataMapper;
import cl.equifax.pruebatecnica.repository.DataRepository;
import cl.equifax.pruebatecnica.service.DataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
@RequiredArgsConstructor
@Slf4j
public class DataServiceImpl implements DataService {
    private final DataRepository repository;
    @Override
    public List<DataDTO> getAllData() {
        log.info("getAllData");

        return Optional.of(
                        repository.findAll()
                )
                .map(DataMapper.INSTANCE::entityListToDTOList)
                .orElse(new ArrayList<>());
    }

    @Transactional
    @Override
    public DataDTO newData(DataDTO data) {
        log.info("newData");
        AtomicReference<DataDTO> dto = new AtomicReference<>();
        Optional.ofNullable(
                        DataMapper.INSTANCE.dtoToEntity(data)
                )
                .ifPresent(etty -> {
                            dto.set(DataMapper.INSTANCE.entityToDTO(repository.save(etty)));
                        }
                );
        return dto.get();
    }
}
