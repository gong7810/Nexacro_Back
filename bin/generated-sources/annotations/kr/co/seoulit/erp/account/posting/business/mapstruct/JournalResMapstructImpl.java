package kr.co.seoulit.erp.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.posting.business.dto.JournalDetailreqDto;
import kr.co.seoulit.erp.account.posting.business.dto.JournalresDto;
import kr.co.seoulit.erp.account.posting.business.entity.JournalDetailEntity;
import kr.co.seoulit.erp.account.posting.business.entity.JournalEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:28:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class JournalResMapstructImpl implements JournalResMapstruct {

    @Override
    public JournalresDto toDto(JournalEntity entity) {
        if ( entity == null ) {
            return null;
        }

        JournalresDto journalresDto = new JournalresDto();

        journalresDto.setStatus( entity.getStatus() );
        journalresDto.setAccountInnerCode( entity.getAccountInnerCode() );
        journalresDto.setAccountName( entity.getAccountName() );
        journalresDto.setBalanceDivision( entity.getBalanceDivision() );
        journalresDto.setCustomerCode( entity.getCustomerCode() );
        journalresDto.setCustomerName( entity.getCustomerName() );
        journalresDto.setJournalDetailList( journalDetailEntityListToJournalDetailreqDtoList( entity.getJournalDetailList() ) );
        journalresDto.setJournalNo( entity.getJournalNo() );
        journalresDto.setLeftDebtorPrice( entity.getLeftDebtorPrice() );
        journalresDto.setRightCreditsPrice( entity.getRightCreditsPrice() );
        journalresDto.setSlipNo( entity.getSlipNo() );

        return journalresDto;
    }

    @Override
    public List<JournalresDto> toDto(List<JournalEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<JournalresDto> list = new ArrayList<JournalresDto>( entities.size() );
        for ( JournalEntity journalEntity : entities ) {
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
        journalDetailreqDto.setAccountControlCode( journalDetailEntity.getAccountControlCode() );
        journalDetailreqDto.setAccountControlDescription( journalDetailEntity.getAccountControlDescription() );
        journalDetailreqDto.setAccountControlName( journalDetailEntity.getAccountControlName() );
        journalDetailreqDto.setAccountControlType( journalDetailEntity.getAccountControlType() );
        journalDetailreqDto.setAccountName( journalDetailEntity.getAccountName() );
        journalDetailreqDto.setJournalDescription( journalDetailEntity.getJournalDescription() );
        journalDetailreqDto.setJournalDetailNo( journalDetailEntity.getJournalDetailNo() );
        journalDetailreqDto.setJournalNo( journalDetailEntity.getJournalNo() );

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
