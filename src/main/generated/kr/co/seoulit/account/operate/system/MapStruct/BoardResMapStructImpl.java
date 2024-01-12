package kr.co.seoulit.account.operate.system.MapStruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.operate.system.entity.BoardEntity;
import kr.co.seoulit.account.operate.system.to.BoardResDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-11T21:46:33+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class BoardResMapStructImpl implements BoardResMapStruct {

    @Override
    public BoardResDto toDto(BoardEntity entity) {
        if ( entity == null ) {
            return null;
        }

        BoardResDto boardResDto = new BoardResDto();

        boardResDto.setId( entity.getId() );
        boardResDto.setTitle( entity.getTitle() );
        boardResDto.setContents( entity.getContents() );
        boardResDto.setWrittenBy( entity.getWrittenBy() );
        boardResDto.setWriteDate( entity.getWriteDate() );
        boardResDto.setUpdateDateTime( entity.getUpdateDateTime() );

        return boardResDto;
    }

    @Override
    public List<BoardResDto> toDto(List<BoardEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BoardResDto> list = new ArrayList<BoardResDto>( entities.size() );
        for ( BoardEntity boardEntity : entities ) {
            list.add( toDto( boardEntity ) );
        }

        return list;
    }
}
