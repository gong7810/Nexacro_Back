package kr.co.seoulit.erp.account.operate.system.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.system.entity.BoardEntity;
import kr.co.seoulit.erp.account.operate.system.to.BoardReqDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-22T20:01:49+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class BoardReqMapStructImpl implements BoardReqMapStruct {

    @Override
    public BoardEntity toEntity(BoardReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BoardEntity boardEntity = new BoardEntity();

        boardEntity.setStatus( dto.getStatus() );
        boardEntity.setContents( dto.getContents() );
        boardEntity.setId( dto.getId() );
        boardEntity.setTitle( dto.getTitle() );
        boardEntity.setUpdateDateTime( dto.getUpdateDateTime() );
        boardEntity.setWriteDate( dto.getWriteDate() );
        boardEntity.setWrittenBy( dto.getWrittenBy() );

        return boardEntity;
    }

    @Override
    public List<BoardEntity> toEntity(List<BoardReqDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<BoardEntity> list = new ArrayList<BoardEntity>( dtos.size() );
        for ( BoardReqDTO boardReqDTO : dtos ) {
            list.add( toEntity( boardReqDTO ) );
        }

        return list;
    }
}
