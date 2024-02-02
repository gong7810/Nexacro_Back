package kr.co.seoulit.erp.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.posting.business.dto.SlipresDto;
import kr.co.seoulit.erp.account.posting.business.entity.SlipEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:25:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class SlipResMapstructImpl implements SlipResMapstruct {

    @Override
    public SlipresDto toDto(SlipEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SlipresDto slipresDto = new SlipresDto();

        slipresDto.setStatus( entity.getStatus() );
        slipresDto.setAccountPeriodNo( entity.getAccountPeriodNo() );
        slipresDto.setApprovalDate( entity.getApprovalDate() );
        slipresDto.setApprovalEmpCode( entity.getApprovalEmpCode() );
        slipresDto.setExpenseReport( entity.getExpenseReport() );
        slipresDto.setReportingDate( entity.getReportingDate() );
        slipresDto.setReportingEmpCode( entity.getReportingEmpCode() );
        slipresDto.setSlipNo( entity.getSlipNo() );
        slipresDto.setSlipStatus( entity.getSlipStatus() );
        slipresDto.setSlipType( entity.getSlipType() );

        return slipresDto;
    }

    @Override
    public List<SlipresDto> toDto(List<SlipEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SlipresDto> list = new ArrayList<SlipresDto>( entities.size() );
        for ( SlipEntity slipEntity : entities ) {
            list.add( toDto( slipEntity ) );
        }

        return list;
    }
}
