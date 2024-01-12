package kr.co.seoulit.account.posting.ledger.mapstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.posting.ledger.dto.DeptResDto;
import kr.co.seoulit.account.posting.ledger.entity.AssetItemEntity;
import kr.co.seoulit.account.posting.ledger.entity.DeptEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
<<<<<<< HEAD
    date = "2024-01-12T14:08:38+0900",
=======
    date = "2024-01-11T21:46:33+0900",
>>>>>>> a3f95cf3cf3a3e411483cfffa2de3e74090c0ee1
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class DeptMapStructImpl implements DeptMapStruct {

    @Override
    public DeptResDto toDto(DeptEntity entity) {
        if ( entity == null ) {
            return null;
        }

        DeptResDto deptResDto = new DeptResDto();

        deptResDto.setDeptName( entity.getDeptName() );
        deptResDto.setDeptCode( entity.getDeptCode() );

        return deptResDto;
    }

    @Override
    public List<DeptResDto> toDto(List<DeptEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DeptResDto> list = new ArrayList<DeptResDto>( entities.size() );
        for ( DeptEntity deptEntity : entities ) {
            list.add( toDto( deptEntity ) );
        }

        return list;
    }

    @Override
    public DeptResDto toDto(Optional<AssetItemEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        DeptResDto deptResDto = new DeptResDto();

        return deptResDto;
    }
}
