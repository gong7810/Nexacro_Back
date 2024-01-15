package kr.co.seoulit.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.business.DTO.JournalDetailresDto;
import kr.co.seoulit.account.posting.business.Entity.JournalDetailEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:24:16+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class JournalDetailResMapstructImpl implements JournalDetailResMapstruct {

    @Override
    public JournalDetailresDto toDto(JournalDetailEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        JournalDetailresDto journalDetailresDto = new JournalDetailresDto();

        journalDetailresDto.setStatus( arg0.getStatus() );
        journalDetailresDto.setJournalDetailNo( arg0.getJournalDetailNo() );
        journalDetailresDto.setJournalNo( arg0.getJournalNo() );
        journalDetailresDto.setAccountControlCode( arg0.getAccountControlCode() );
        journalDetailresDto.setJournalDescription( arg0.getJournalDescription() );
        journalDetailresDto.setAccountControlDescription( arg0.getAccountControlDescription() );
        journalDetailresDto.setAccountControlName( arg0.getAccountControlName() );
        journalDetailresDto.setAccountControlType( arg0.getAccountControlType() );

        return journalDetailresDto;
    }

    @Override
    public List<JournalDetailresDto> toDto(List<JournalDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<JournalDetailresDto> list = new ArrayList<JournalDetailresDto>( arg0.size() );
        for ( JournalDetailEntity journalDetailEntity : arg0 ) {
            list.add( toDto( journalDetailEntity ) );
        }

        return list;
    }
}
