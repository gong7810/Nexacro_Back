package kr.co.seoulit.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.business.DTO.JournalDetailreqDto;
import kr.co.seoulit.account.posting.business.DTO.JournalreqDto;
import kr.co.seoulit.account.posting.business.Entity.JournalDetailEntity;
import kr.co.seoulit.account.posting.business.Entity.JournalEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:24:16+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class JournalReqMapstructImpl implements JournalReqMapstruct {

    @Override
    public JournalEntity toEntity(JournalreqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        JournalEntity journalEntity = new JournalEntity();

        journalEntity.setStatus( arg0.getStatus() );
        journalEntity.setJournalNo( arg0.getJournalNo() );
        journalEntity.setSlipNo( arg0.getSlipNo() );
        journalEntity.setBalanceDivision( arg0.getBalanceDivision() );
        journalEntity.setAccountInnerCode( arg0.getAccountInnerCode() );
        journalEntity.setAccountName( arg0.getAccountName() );
        journalEntity.setCustomerCode( arg0.getCustomerCode() );
        journalEntity.setCustomerName( arg0.getCustomerName() );
        journalEntity.setLeftDebtorPrice( arg0.getLeftDebtorPrice() );
        journalEntity.setRightCreditsPrice( arg0.getRightCreditsPrice() );
        journalEntity.setJournalDetailList( journalDetailreqDtoListToJournalDetailEntityList( arg0.getJournalDetailList() ) );

        return journalEntity;
    }

    @Override
    public List<JournalEntity> toEntity(List<JournalreqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<JournalEntity> list = new ArrayList<JournalEntity>( arg0.size() );
        for ( JournalreqDto journalreqDto : arg0 ) {
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
        journalDetailEntity.setJournalDetailNo( journalDetailreqDto.getJournalDetailNo() );
        journalDetailEntity.setJournalNo( journalDetailreqDto.getJournalNo() );
        journalDetailEntity.setAccountControlCode( journalDetailreqDto.getAccountControlCode() );
        journalDetailEntity.setJournalDescription( journalDetailreqDto.getJournalDescription() );
        journalDetailEntity.setAccountControlDescription( journalDetailreqDto.getAccountControlDescription() );
        journalDetailEntity.setAccountControlName( journalDetailreqDto.getAccountControlName() );
        journalDetailEntity.setAccountControlType( journalDetailreqDto.getAccountControlType() );

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
