package kr.co.seoulit.erp.account.operate.system.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.system.entity.BoardEntity;
import kr.co.seoulit.erp.account.operate.system.to.BoardReqDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-26T15:38:21+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.11 (Oracle Corporation)"
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
        boardEntity.setId( dto.getId() );
        boardEntity.setTitle( dto.getTitle() );
        boardEntity.setContents( dto.getContents() );
        boardEntity.setWrittenBy( dto.getWrittenBy() );
        boardEntity.setWriteDate( dto.getWriteDate() );
        boardEntity.setUpdateDateTime( dto.getUpdateDateTime() );

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
