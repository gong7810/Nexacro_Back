package kr.co.seoulit.erp.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.posting.business.dto.JournalDetailresDto;
import kr.co.seoulit.erp.account.posting.business.entity.JournalDetailEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-22T20:01:49+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class JournalDetailResMapstructImpl implements JournalDetailResMapstruct {

    @Override
    public JournalDetailresDto toDto(JournalDetailEntity entity) {
        if ( entity == null ) {
            return null;
        }

        JournalDetailresDto journalDetailresDto = new JournalDetailresDto();

        journalDetailresDto.setStatus( entity.getStatus() );
        journalDetailresDto.setAccountControlCode( entity.getAccountControlCode() );
        journalDetailresDto.setAccountControlDescription( entity.getAccountControlDescription() );
        journalDetailresDto.setAccountControlName( entity.getAccountControlName() );
        journalDetailresDto.setAccountControlType( entity.getAccountControlType() );
        journalDetailresDto.setJournalDescription( entity.getJournalDescription() );
        journalDetailresDto.setJournalDetailNo( entity.getJournalDetailNo() );
        journalDetailresDto.setJournalNo( entity.getJournalNo() );

        return journalDetailresDto;
    }

    @Override
    public List<JournalDetailresDto> toDto(List<JournalDetailEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<JournalDetailresDto> list = new ArrayList<JournalDetailresDto>( entities.size() );
        for ( JournalDetailEntity journalDetailEntity : entities ) {
            list.add( toDto( journalDetailEntity ) );
        }

        return list;
    }
}
