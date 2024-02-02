package kr.co.seoulit.erp.account.operate.system.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.system.entity.BoardEntity;
import kr.co.seoulit.erp.account.operate.system.to.BoardResDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:25:35+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class BoardResMapStructImpl implements BoardResMapStruct {

    @Override
    public BoardResDTO toDto(BoardEntity entity) {
        if ( entity == null ) {
            return null;
        }

        BoardResDTO boardResDTO = new BoardResDTO();

        boardResDTO.setContents( entity.getContents() );
        boardResDTO.setId( entity.getId() );
        boardResDTO.setTitle( entity.getTitle() );
        boardResDTO.setUpdateDateTime( entity.getUpdateDateTime() );
        boardResDTO.setWriteDate( entity.getWriteDate() );
        boardResDTO.setWrittenBy( entity.getWrittenBy() );

        return boardResDTO;
    }

    @Override
    public List<BoardResDTO> toDto(List<BoardEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BoardResDTO> list = new ArrayList<BoardResDTO>( entities.size() );
        for ( BoardEntity boardEntity : entities ) {
            list.add( toDto( boardEntity ) );
        }

        return list;
    }
}
