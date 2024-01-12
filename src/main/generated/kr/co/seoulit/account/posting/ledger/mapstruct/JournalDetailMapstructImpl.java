package kr.co.seoulit.account.posting.ledger.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.ledger.dto.JournalDetailDtoRes;
import kr.co.seoulit.account.posting.ledger.entity.JournalDetailResEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-12T14:08:38+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class JournalDetailMapstructImpl implements JournalDetailMapstruct {

    @Override
    public JournalDetailDtoRes toDto(JournalDetailResEntity entity) {
        if ( entity == null ) {
            return null;
        }

        JournalDetailDtoRes journalDetailDtoRes = new JournalDetailDtoRes();

        journalDetailDtoRes.setStatus( entity.getStatus() );
        journalDetailDtoRes.setJournalDetailNo( entity.getJournalDetailNo() );
        journalDetailDtoRes.setJournalNo( entity.getJournalNo() );
        journalDetailDtoRes.setAccountControlDescription( entity.getAccountControlDescription() );
        journalDetailDtoRes.setAccountControlName( entity.getAccountControlName() );

        return journalDetailDtoRes;
    }

    @Override
    public List<JournalDetailDtoRes> toDto(List<JournalDetailResEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<JournalDetailDtoRes> list = new ArrayList<JournalDetailDtoRes>( entities.size() );
        for ( JournalDetailResEntity journalDetailResEntity : entities ) {
            list.add( toDto( journalDetailResEntity ) );
        }

        return list;
    }
}
