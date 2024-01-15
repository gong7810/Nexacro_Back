package kr.co.seoulit.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.business.DTO.SlipresDto;
import kr.co.seoulit.account.posting.business.Entity.SlipEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:24:16+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class SlipResMapstructImpl implements SlipResMapstruct {

    @Override
    public SlipresDto toDto(SlipEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SlipresDto slipresDto = new SlipresDto();

        slipresDto.setStatus( arg0.getStatus() );
        slipresDto.setSlipNo( arg0.getSlipNo() );
        slipresDto.setAccountPeriodNo( arg0.getAccountPeriodNo() );
        slipresDto.setSlipType( arg0.getSlipType() );
        slipresDto.setExpenseReport( arg0.getExpenseReport() );
        slipresDto.setReportingEmpCode( arg0.getReportingEmpCode() );
        slipresDto.setReportingDate( arg0.getReportingDate() );
        slipresDto.setApprovalEmpCode( arg0.getApprovalEmpCode() );
        slipresDto.setApprovalDate( arg0.getApprovalDate() );
        slipresDto.setSlipStatus( arg0.getSlipStatus() );

        return slipresDto;
    }

    @Override
    public List<SlipresDto> toDto(List<SlipEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SlipresDto> list = new ArrayList<SlipresDto>( arg0.size() );
        for ( SlipEntity slipEntity : arg0 ) {
            list.add( toDto( slipEntity ) );
        }

        return list;
    }
}
