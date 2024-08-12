package cl.equifax.pruebatecnica.mappers;

import cl.equifax.pruebatecnica.dto.DataDTO;
import cl.equifax.pruebatecnica.model.Data;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class DataMapper {
    public static final DataMapper INSTANCE = Mappers.getMapper(DataMapper.class);

    @Mapping(target = "celular", source = "celular")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "rut", source = "rut")
    public abstract DataDTO entityToDTO(Data entity);

    @Mapping(target = "celular", source = "celular")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "rut", source = "rut")
    public abstract Data dtoToEntity(DataDTO dto);

    public abstract List<DataDTO> entityListToDTOList(List<Data> entityList);

    public abstract List<Data> dtoListToEntityList(List<DataDTO> dtoList);




}
