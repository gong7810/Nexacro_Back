package kr.co.seoulit.erp.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.posting.business.dto.JournalDetailreqDto;
import kr.co.seoulit.erp.account.posting.business.dto.JournalreqDto;
import kr.co.seoulit.erp.account.posting.business.entity.JournalDetailEntity;
import kr.co.seoulit.erp.account.posting.business.entity.JournalEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:28:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class JournalReqMapstructImpl implements JournalReqMapstruct {

    @Override
    public JournalEntity toEntity(JournalreqDto dto) {
        if ( dto == null ) {
            return null;
        }

        JournalEntity journalEntity = new JournalEntity();

        journalEntity.setStatus( dto.getStatus() );
        journalEntity.setAccountInnerCode( dto.getAccountInnerCode() );
        journalEntity.setAccountName( dto.getAccountName() );
        journalEntity.setBalanceDivision( dto.getBalanceDivision() );
        journalEntity.setCustomerCode( dto.getCustomerCode() );
        journalEntity.setCustomerName( dto.getCustomerName() );
        journalEntity.setJournalDetailList( journalDetailreqDtoListToJournalDetailEntityList( dto.getJournalDetailList() ) );
        journalEntity.setJournalNo( dto.getJournalNo() );
        journalEntity.setLeftDebtorPrice( dto.getLeftDebtorPrice() );
        journalEntity.setRightCreditsPrice( dto.getRightCreditsPrice() );
        journalEntity.setSlipNo( dto.getSlipNo() );

        return journalEntity;
    }

    @Override
    public List<JournalEntity> toEntity(List<JournalreqDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<JournalEntity> list = new ArrayList<JournalEntity>( dtos.size() );
        for ( JournalreqDto journalreqDto : dtos ) {
            list.add( toEntity( journalreqDto ) );
        }

        return list;
    }

    protected JournalDetailEntity journalDetailreqDtoToJournalDetailEntity(JournalDetailreqDto journalDetailreqDto) {
        if ( journalDetailreqDto == null ) {
            return null;
        }

        JournalDetailEntity journalDetailEntity = new JournalDetailEntity();

        journalDetailEntity.setStatus( journalDetailreqDto.getStatus() );
        journalDetailEntity.setAccountControlCode( journalDetailreqDto.getAccountControlCode() );
        journalDetailEntity.setAccountControlDescription( journalDetailreqDto.getAccountControlDescription() );
        journalDetailEntity.setAccountControlName( journalDetailreqDto.getAccountControlName() );
        journalDetailEntity.setAccountControlType( journalDetailreqDto.getAccountControlType() );
        journalDetailEntity.setAccountName( journalDetailreqDto.getAccountName() );
        journalDetailEntity.setJournalDescription( journalDetailreqDto.getJournalDescription() );
        journalDetailEntity.setJournalDetailNo( journalDetailreqDto.getJournalDetailNo() );
        journalDetailEntity.setJournalNo( journalDetailreqDto.getJournalNo() );

        return journalDetailEntity;
    }

    protected List<JournalDetailEntity> journalDetailreqDtoListToJournalDetailEntityList(List<JournalDetailreqDto> list) {
        if ( list == null ) {
            return null;
        }

        List<JournalDetailEntity> list1 = new ArrayList<JournalDetailEntity>( list.size() );
        for ( JournalDetailreqDto journalDetailreqDto : list ) {
            list1.add( journalDetailreqDtoToJournalDetailEntity( journalDetailreqDto ) );
        }

        return list1;
    }
}
