package kr.co.seoulit.erp.account.operate.system.Mapstruct;

import kr.co.seoulit.erp.account.operate.system.DTO.BoardResDTO;
import kr.co.seoulit.erp.account.operate.system.Entity.NoticeBoardEntity;
import kr.co.seoulit.erp.sys.common.Mapstruct.EntityResMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BoardResMapstruct extends EntityResMapper<NoticeBoardEntity, BoardResDTO> {

    @Override
    BoardResDTO toDto(NoticeBoardEntity entity);

    @Override
    List<BoardResDTO> toDto(List<NoticeBoardEntity> entities);

    BoardResMapstruct MAPPER = Mappers.getMapper(BoardResMapstruct.class);
}
