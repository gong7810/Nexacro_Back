package kr.co.seoulit.erp.account.posting.business.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.posting.business.dto.JournalDetailreqDto;
import kr.co.seoulit.erp.account.posting.business.entity.JournalDetailEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:25:35+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class JournalDetailReqMapstructImpl implements JournalDetailReqMapstruct {

    @Override
    public JournalDetailEntity toEntity(JournalDetailreqDto dto) {
        if ( dto == null ) {
            return null;
        }

        JournalDetailEntity journalDetailEntity = new JournalDetailEntity();

        journalDetailEntity.setStatus( dto.getStatus() );
        journalDetailEntity.setAccountControlCode( dto.getAccountControlCode() );
        journalDetailEntity.setAccountControlDescription( dto.getAccountControlDescription() );
        journalDetailEntity.setAccountControlName( dto.getAccountControlName() );
        journalDetailEntity.setAccountControlType( dto.getAccountControlType() );
        journalDetailEntity.setJournalDescription( dto.getJournalDescription() );
        journalDetailEntity.setJournalDetailNo( dto.getJournalDetailNo() );
        journalDetailEntity.setJournalNo( dto.getJournalNo() );

        return journalDetailEntity;
    }

    @Override
    public List<JournalDetailEntity> toEntity(List<JournalDetailreqDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<JournalDetailEntity> list = new ArrayList<JournalDetailEntity>( dtos.size() );
        for ( JournalDetailreqDto journalDetailreqDto : dtos ) {
            list.add( toEntity( journalDetailreqDto ) );
        }

        return list;
    }
}
