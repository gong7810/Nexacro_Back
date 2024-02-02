package kr.co.seoulit.erp.account.posting.ledger.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.posting.ledger.dto.JournalDetailDtoRes;
import kr.co.seoulit.erp.account.posting.ledger.entity.JournalDetailResEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:25:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
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
        journalDetailDtoRes.setAccountControlDescription( entity.getAccountControlDescription() );
        journalDetailDtoRes.setAccountControlName( entity.getAccountControlName() );
        journalDetailDtoRes.setJournalDetailNo( entity.getJournalDetailNo() );
        journalDetailDtoRes.setJournalNo( entity.getJournalNo() );

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
