package kr.co.seoulit.account.operate.system.MapStruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.operate.system.entity.BoardEntity;
import kr.co.seoulit.account.operate.system.to.BoardReqDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-11T21:46:32+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class BoardReqMapStructImpl implements BoardReqMapStruct {

    @Override
    public BoardEntity toEntity(BoardReqDto dto) {
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
    public List<BoardEntity> toEntity(List<BoardReqDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<BoardEntity> list = new ArrayList<BoardEntity>( dtos.size() );
        for ( BoardReqDto boardReqDto : dtos ) {
            list.add( toEntity( boardReqDto ) );
        }

        return list;
    }
}
