package kr.co.seoulit.account.operate.system.MapStruct;


import kr.co.seoulit.account.operate.system.entity.BoardEntity;
import kr.co.seoulit.account.operate.system.to.BoardResDto;
import kr.co.seoulit.account.sys.common.Mapstruct.EntityResMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BoardResMapStruct extends EntityResMapper<BoardEntity, BoardResDto> {

}
