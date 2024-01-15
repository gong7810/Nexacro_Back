package kr.co.seoulit.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.business.DTO.SlipreqDto;
import kr.co.seoulit.account.posting.business.Entity.SlipEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:24:16+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class SlipReqMapstructImpl implements SlipReqMapstruct {

    @Override
    public SlipEntity toEntity(SlipreqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SlipEntity slipEntity = new SlipEntity();

        slipEntity.setStatus( arg0.getStatus() );
        slipEntity.setSlipNo( arg0.getSlipNo() );
        slipEntity.setAccountPeriodNo( arg0.getAccountPeriodNo() );
        slipEntity.setDeptCode( arg0.getDeptCode() );
        slipEntity.setSlipType( arg0.getSlipType() );
        slipEntity.setExpenseReport( arg0.getExpenseReport() );
        slipEntity.setReportingEmpCode( arg0.getReportingEmpCode() );
        slipEntity.setReportingDate( arg0.getReportingDate() );
        slipEntity.setApprovalEmpCode( arg0.getApprovalEmpCode() );
        slipEntity.setApprovalDate( arg0.getApprovalDate() );
        slipEntity.setSlipStatus( arg0.getSlipStatus() );

        return slipEntity;
    }

    @Override
    public List<SlipEntity> toEntity(List<SlipreqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SlipEntity> list = new ArrayList<SlipEntity>( arg0.size() );
        for ( SlipreqDto slipreqDto : arg0 ) {
            list.add( toEntity( slipreqDto ) );
        }

        return list;
    }
}
