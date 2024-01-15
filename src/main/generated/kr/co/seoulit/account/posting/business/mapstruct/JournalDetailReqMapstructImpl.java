package kr.co.seoulit.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.business.DTO.JournalDetailreqDto;
import kr.co.seoulit.account.posting.business.Entity.JournalDetailEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:24:16+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class JournalDetailReqMapstructImpl implements JournalDetailReqMapstruct {

    @Override
    public JournalDetailEntity toEntity(JournalDetailreqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        JournalDetailEntity journalDetailEntity = new JournalDetailEntity();

        journalDetailEntity.setStatus( arg0.getStatus() );
        journalDetailEntity.setJournalDetailNo( arg0.getJournalDetailNo() );
        journalDetailEntity.setJournalNo( arg0.getJournalNo() );
        journalDetailEntity.setAccountControlCode( arg0.getAccountControlCode() );
        journalDetailEntity.setJournalDescription( arg0.getJournalDescription() );
        journalDetailEntity.setAccountControlDescription( arg0.getAccountControlDescription() );
        journalDetailEntity.setAccountControlName( arg0.getAccountControlName() );
        journalDetailEntity.setAccountControlType( arg0.getAccountControlType() );

        return journalDetailEntity;
    }

    @Override
    public List<JournalDetailEntity> toEntity(List<JournalDetailreqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<JournalDetailEntity> list = new ArrayList<JournalDetailEntity>( arg0.size() );
        for ( JournalDetailreqDto journalDetailreqDto : arg0 ) {
            list.add( toEntity( journalDetailreqDto ) );
        }

        return list;
    }
}
