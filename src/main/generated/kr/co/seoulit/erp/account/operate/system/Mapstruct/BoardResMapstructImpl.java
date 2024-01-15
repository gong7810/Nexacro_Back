package kr.co.seoulit.erp.account.operate.system.Mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.system.DTO.BoardResDTO;
import kr.co.seoulit.erp.account.operate.system.Entity.NoticeBoardEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:42:54+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class BoardResMapstructImpl implements BoardResMapstruct {

    @Override
    public BoardResDTO toDto(NoticeBoardEntity entity) {
        if ( entity == null ) {
            return null;
        }

        BoardResDTO boardResDTO = new BoardResDTO();

        boardResDTO.setStatus( entity.getStatus() );
        boardResDTO.setId( entity.getId() );
        boardResDTO.setTitle( entity.getTitle() );
        boardResDTO.setContents( entity.getContents() );
        boardResDTO.setWrittenBy( entity.getWrittenBy() );
        boardResDTO.setWriteDate( entity.getWriteDate() );
        boardResDTO.setUpdateDateTime( entity.getUpdateDateTime() );

        return boardResDTO;
    }

    @Override
    public List<BoardResDTO> toDto(List<NoticeBoardEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BoardResDTO> list = new ArrayList<BoardResDTO>( entities.size() );
        for ( NoticeBoardEntity noticeBoardEntity : entities ) {
            list.add( toDto( noticeBoardEntity ) );
        }

        return list;
    }
}
