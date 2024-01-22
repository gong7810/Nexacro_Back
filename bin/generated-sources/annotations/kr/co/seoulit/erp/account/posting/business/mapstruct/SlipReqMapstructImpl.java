package kr.co.seoulit.erp.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.posting.business.dto.SlipreqDto;
import kr.co.seoulit.erp.account.posting.business.entity.SlipEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-22T20:01:49+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class SlipReqMapstructImpl implements SlipReqMapstruct {

    @Override
    public SlipEntity toEntity(SlipreqDto dto) {
        if ( dto == null ) {
            return null;
        }

        SlipEntity slipEntity = new SlipEntity();

        slipEntity.setStatus( dto.getStatus() );
        slipEntity.setAccountPeriodNo( dto.getAccountPeriodNo() );
        slipEntity.setApprovalDate( dto.getApprovalDate() );
        slipEntity.setApprovalEmpCode( dto.getApprovalEmpCode() );
        slipEntity.setDeptCode( dto.getDeptCode() );
        slipEntity.setExpenseReport( dto.getExpenseReport() );
        slipEntity.setReportingDate( dto.getReportingDate() );
        slipEntity.setReportingEmpCode( dto.getReportingEmpCode() );
        slipEntity.setSlipNo( dto.getSlipNo() );
        slipEntity.setSlipStatus( dto.getSlipStatus() );
        slipEntity.setSlipType( dto.getSlipType() );

        return slipEntity;
    }

    @Override
    public List<SlipEntity> toEntity(List<SlipreqDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<SlipEntity> list = new ArrayList<SlipEntity>( dtos.size() );
        for ( SlipreqDto slipreqDto : dtos ) {
            list.add( toEntity( slipreqDto ) );
        }

        return list;
    }
}
