package cl.equifax.pruebatecnica.mappers;

import cl.equifax.pruebatecnica.dto.UserDTO;
import cl.equifax.pruebatecnica.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class UserMapper {
    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "userId", source = "userId")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    public abstract UserDTO entityToDTO(User entity);

    @Mapping(target = "userId", source = "userId")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    public abstract User dtoToEntity(UserDTO dto);

    public abstract List<UserDTO> entityListToDTOList(List<User> entityList);

    public abstract List<User> dtoListToEntityList(List<UserDTO> dtoList);
}
