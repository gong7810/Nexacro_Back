package kr.co.seoulit.account.operate.system.MapStruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.operate.system.entity.BoardEntity;
import kr.co.seoulit.account.operate.system.to.BoardResDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T10:35:35+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class BoardResMapStructImpl implements BoardResMapStruct {

    @Override
    public BoardResDto toDto(BoardEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BoardResDto boardResDto = new BoardResDto();

        boardResDto.setId( arg0.getId() );
        boardResDto.setTitle( arg0.getTitle() );
        boardResDto.setContents( arg0.getContents() );
        boardResDto.setWrittenBy( arg0.getWrittenBy() );
        boardResDto.setWriteDate( arg0.getWriteDate() );
        boardResDto.setUpdateDateTime( arg0.getUpdateDateTime() );

        return boardResDto;
    }

    @Override
    public List<BoardResDto> toDto(List<BoardEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BoardResDto> list = new ArrayList<BoardResDto>( arg0.size() );
        for ( BoardEntity boardEntity : arg0 ) {
            list.add( toDto( boardEntity ) );
        }

        return list;
    }
}
