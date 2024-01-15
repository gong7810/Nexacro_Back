package kr.co.seoulit.account.posting.ledger.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.business.DTO.JournalDetailresDto;
import kr.co.seoulit.account.posting.ledger.dto.JournalDtoRes;
import kr.co.seoulit.account.posting.ledger.entity.JournalDetailResEntity;
import kr.co.seoulit.account.posting.ledger.entity.JournalResEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:24:16+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class JournalMapstructImpl implements JournalMapstruct {

    @Override
    public JournalDtoRes toDto(JournalResEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        JournalDtoRes journalDtoRes = new JournalDtoRes();

        journalDtoRes.setStatus( arg0.getStatus() );
        journalDtoRes.setJournalNo( arg0.getJournalNo() );
        journalDtoRes.setSlipNo( arg0.getSlipNo() );
        journalDtoRes.setBalanceDivision( arg0.getBalanceDivision() );
        journalDtoRes.setAccountInnerCode( arg0.getAccountInnerCode() );
        journalDtoRes.setAccountName( arg0.getAccountName() );
        journalDtoRes.setLeftDebtorPrice( arg0.getLeftDebtorPrice() );
        journalDtoRes.setRightCreditsPrice( arg0.getRightCreditsPrice() );
        journalDtoRes.setJournalDetailList( journalDetailResEntityListToJournalDetailresDtoList( arg0.getJournalDetailList() ) );

        return journalDtoRes;
    }

    @Override
    public List<JournalDtoRes> toDto(List<JournalResEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<JournalDtoRes> list = new ArrayList<JournalDtoRes>( arg0.size() );
        for ( JournalResEntity journalResEntity : arg0 ) {
            list.add( toDto( journalResEntity ) );
        }

        return list;
    }

    protected JournalDetailresDto journalDetailResEntityToJournalDetailresDto(JournalDetailResEntity journalDetailResEntity) {
        if ( journalDetailResEntity == null ) {
            return null;
        }

        JournalDetailresDto journalDetailresDto = new JournalDetailresDto();

        journalDetailresDto.setStatus( journalDetailResEntity.getStatus() );
        journalDetailresDto.setJournalDetailNo( journalDetailResEntity.getJournalDetailNo() );
        journalDetailresDto.setJournalNo( journalDetailResEntity.getJournalNo() );
        journalDetailresDto.setAccountControlCode( journalDetailResEntity.getAccountControlCode() );
        journalDetailresDto.setJournalDescription( journalDetailResEntity.getJournalDescription() );
        journalDetailresDto.setAccountControlDescription( journalDetailResEntity.getAccountControlDescription() );
        journalDetailresDto.setAccountControlName( journalDetailResEntity.getAccountControlName() );
        journalDetailresDto.setAccountControlType( journalDetailResEntity.getAccountControlType() );

        return journalDetailresDto;
    }

    protected List<JournalDetailresDto> journalDetailResEntityListToJournalDetailresDtoList(List<JournalDetailResEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<JournalDetailresDto> list1 = new ArrayList<JournalDetailresDto>( list.size() );
        for ( JournalDetailResEntity journalDetailResEntity : list ) {
            list1.add( journalDetailResEntityToJournalDetailresDto( journalDetailResEntity ) );
        }

        return list1;
    }
}
