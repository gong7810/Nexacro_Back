package kr.co.seoulit.account.posting.ledger.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.ledger.dto.JournalDetailDtoRes;
import kr.co.seoulit.account.posting.ledger.entity.JournalDetailResEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:24:16+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class JournalDetailMapstructImpl implements JournalDetailMapstruct {

    @Override
    public JournalDetailDtoRes toDto(JournalDetailResEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        JournalDetailDtoRes journalDetailDtoRes = new JournalDetailDtoRes();

        journalDetailDtoRes.setStatus( arg0.getStatus() );
        journalDetailDtoRes.setJournalDetailNo( arg0.getJournalDetailNo() );
        journalDetailDtoRes.setJournalNo( arg0.getJournalNo() );
        journalDetailDtoRes.setAccountControlDescription( arg0.getAccountControlDescription() );
        journalDetailDtoRes.setAccountControlName( arg0.getAccountControlName() );

        return journalDetailDtoRes;
    }

    @Override
    public List<JournalDetailDtoRes> toDto(List<JournalDetailResEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<JournalDetailDtoRes> list = new ArrayList<JournalDetailDtoRes>( arg0.size() );
        for ( JournalDetailResEntity journalDetailResEntity : arg0 ) {
            list.add( toDto( journalDetailResEntity ) );
        }

        return list;
    }
}
