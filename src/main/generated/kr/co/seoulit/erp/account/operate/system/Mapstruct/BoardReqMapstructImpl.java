package kr.co.seoulit.erp.account.operate.system.Mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.system.DTO.BoardReqDTO;
import kr.co.seoulit.erp.account.operate.system.Entity.NoticeBoardEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:42:54+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class BoardReqMapstructImpl implements BoardReqMapstruct {

    @Override
    public NoticeBoardEntity toEntity(BoardReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        NoticeBoardEntity noticeBoardEntity = new NoticeBoardEntity();

        noticeBoardEntity.setStatus( dto.getStatus() );
        noticeBoardEntity.setId( dto.getId() );
        noticeBoardEntity.setTitle( dto.getTitle() );
        noticeBoardEntity.setContents( dto.getContents() );
        noticeBoardEntity.setWrittenBy( dto.getWrittenBy() );
        noticeBoardEntity.setWriteDate( dto.getWriteDate() );
        noticeBoardEntity.setUpdateDateTime( dto.getUpdateDateTime() );

        return noticeBoardEntity;
    }

    @Override
    public List<NoticeBoardEntity> toEntity(List<BoardReqDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<NoticeBoardEntity> list = new ArrayList<NoticeBoardEntity>( dtos.size() );
        for ( BoardReqDTO boardReqDTO : dtos ) {
            list.add( toEntity( boardReqDTO ) );
        }

        return list;
    }
}
