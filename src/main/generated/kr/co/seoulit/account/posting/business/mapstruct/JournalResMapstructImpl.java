package kr.co.seoulit.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.business.DTO.JournalDetailreqDto;
import kr.co.seoulit.account.posting.business.DTO.JournalresDto;
import kr.co.seoulit.account.posting.business.Entity.JournalDetailEntity;
import kr.co.seoulit.account.posting.business.Entity.JournalEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:24:16+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class JournalResMapstructImpl implements JournalResMapstruct {

    @Override
    public JournalresDto toDto(JournalEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        JournalresDto journalresDto = new JournalresDto();

        journalresDto.setStatus( arg0.getStatus() );
        journalresDto.setJournalNo( arg0.getJournalNo() );
        journalresDto.setSlipNo( arg0.getSlipNo() );
        journalresDto.setBalanceDivision( arg0.getBalanceDivision() );
        journalresDto.setAccountInnerCode( arg0.getAccountInnerCode() );
        journalresDto.setAccountName( arg0.getAccountName() );
        journalresDto.setCustomerCode( arg0.getCustomerCode() );
        journalresDto.setCustomerName( arg0.getCustomerName() );
        journalresDto.setLeftDebtorPrice( arg0.getLeftDebtorPrice() );
        journalresDto.setRightCreditsPrice( arg0.getRightCreditsPrice() );
        journalresDto.setJournalDetailList( journalDetailEntityListToJournalDetailreqDtoList( arg0.getJournalDetailList() ) );

        return journalresDto;
    }

    @Override
    public List<JournalresDto> toDto(List<JournalEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<JournalresDto> list = new ArrayList<JournalresDto>( arg0.size() );
        for ( JournalEntity journalEntity : arg0 ) {
            list.add( toDto( journalEntity ) );
        }

        return list;
    }

    protected JournalDetailreqDto journalDetailEntityToJournalDetailreqDto(JournalDetailEntity journalDetailEntity) {
        if ( journalDetailEntity == null ) {
            return null;
        }

        JournalDetailreqDto journalDetailreqDto = new JournalDetailreqDto();

        journalDetailreqDto.setStatus( journalDetailEntity.getStatus() );
        journalDetailreqDto.setJournalDetailNo( journalDetailEntity.getJournalDetailNo() );
        journalDetailreqDto.setJournalNo( journalDetailEntity.getJournalNo() );
        journalDetailreqDto.setAccountControlCode( journalDetailEntity.getAccountControlCode() );
        journalDetailreqDto.setJournalDescription( journalDetailEntity.getJournalDescription() );
        journalDetailreqDto.setAccountControlDescription( journalDetailEntity.getAccountControlDescription() );
        journalDetailreqDto.setAccountControlName( journalDetailEntity.getAccountControlName() );
        journalDetailreqDto.setAccountControlType( journalDetailEntity.getAccountControlType() );

        return journalDetailreqDto;
    }

    protected List<JournalDetailreqDto> journalDetailEntityListToJournalDetailreqDtoList(List<JournalDetailEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<JournalDetailreqDto> list1 = new ArrayList<JournalDetailreqDto>( list.size() );
        for ( JournalDetailEntity journalDetailEntity : list ) {
            list1.add( journalDetailEntityToJournalDetailreqDto( journalDetailEntity ) );
        }

        return list1;
    }
}
