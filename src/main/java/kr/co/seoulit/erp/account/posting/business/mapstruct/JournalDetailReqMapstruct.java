package kr.co.seoulit.erp.account.posting.business.mapstruct;

import kr.co.seoulit.erp.account.posting.business.dto.JournalDetailreqDto;
import kr.co.seoulit.erp.account.posting.business.Entity.JournalDetailEntity;
import kr.co.seoulit.erp.account.sys.common.mapstruct.EntityReqMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JournalDetailReqMapstruct extends EntityReqMapper<JournalDetailEntity, JournalDetailreqDto> {
}
