package kr.co.seoulit.account.operate.system.MapStruct;


import kr.co.seoulit.account.operate.system.entity.BoardEntity;
import kr.co.seoulit.account.operate.system.to.BoardReqDto;
import kr.co.seoulit.erp.sys.common.Mapstruct.EntityReqMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BoardReqMapStruct extends EntityReqMapper<BoardEntity, BoardReqDto>
{



}
