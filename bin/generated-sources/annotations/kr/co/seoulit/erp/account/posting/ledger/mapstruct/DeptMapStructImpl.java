package kr.co.seoulit.erp.account.posting.ledger.mapstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.posting.ledger.dto.DeptResDto;
import kr.co.seoulit.erp.account.posting.ledger.entity.AssetItemEntity;
import kr.co.seoulit.erp.account.posting.ledger.entity.DeptEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-22T20:29:56+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class DeptMapStructImpl implements DeptMapStruct {

    @Override
    public DeptResDto toDto(DeptEntity entity) {
        if ( entity == null ) {
            return null;
        }

        DeptResDto deptResDto = new DeptResDto();

        deptResDto.setDeptCode( entity.getDeptCode() );
        deptResDto.setDeptName( entity.getDeptName() );

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
