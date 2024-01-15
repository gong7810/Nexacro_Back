package kr.co.seoulit.erp.account.operate.system.Mapstruct;

import kr.co.seoulit.erp.account.operate.system.DTO.BoardReqDTO;
import kr.co.seoulit.erp.account.operate.system.Entity.NoticeBoardEntity;
import kr.co.seoulit.erp.sys.common.Mapstruct.EntityReqMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BoardReqMapstruct extends EntityReqMapper<NoticeBoardEntity, BoardReqDTO> {

    @Override
    NoticeBoardEntity toEntity(BoardReqDTO dto);

    @Override
    List<NoticeBoardEntity> toEntity(List<BoardReqDTO> dtos);
    BoardReqMapstruct MAPPER = Mappers.getMapper(BoardReqMapstruct.class);
}

