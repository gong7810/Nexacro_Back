package kr.co.seoulit.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.business.DTO.SlipresDto;
import kr.co.seoulit.account.posting.business.Entity.SlipEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-23T19:21:35+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.8.1 (Amazon.com Inc.)"
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
        slipresDto.setSlipNo( entity.getSlipNo() );
        slipresDto.setAccountPeriodNo( entity.getAccountPeriodNo() );
        slipresDto.setSlipType( entity.getSlipType() );
        slipresDto.setExpenseReport( entity.getExpenseReport() );
        slipresDto.setReportingEmpCode( entity.getReportingEmpCode() );
        slipresDto.setReportingDate( entity.getReportingDate() );
        slipresDto.setApprovalEmpCode( entity.getApprovalEmpCode() );
        slipresDto.setApprovalDate( entity.getApprovalDate() );
        slipresDto.setSlipStatus( entity.getSlipStatus() );

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
