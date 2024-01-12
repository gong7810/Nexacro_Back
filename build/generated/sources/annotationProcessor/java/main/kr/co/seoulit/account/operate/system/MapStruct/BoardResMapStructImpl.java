package kr.co.seoulit.account.operate.system.MapStruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.operate.system.entity.BoardEntity;
import kr.co.seoulit.account.operate.system.to.BoardResDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-23T19:21:35+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.8.1 (Amazon.com Inc.)"
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
