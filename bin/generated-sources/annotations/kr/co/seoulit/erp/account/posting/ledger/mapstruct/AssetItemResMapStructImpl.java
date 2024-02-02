package kr.co.seoulit.erp.account.posting.ledger.mapstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.posting.ledger.dto.AssetItemResDto;
import kr.co.seoulit.erp.account.posting.ledger.entity.AssetItemEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:25:35+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class AssetItemResMapStructImpl implements AssetItemResMapStruct {

    @Override
    public AssetItemResDto toDto(AssetItemEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AssetItemResDto assetItemResDto = new AssetItemResDto();

        assetItemResDto.setAccumulatedDepreciation( entity.getAccumulatedDepreciation() );
        assetItemResDto.setAcquisitionAmount( entity.getAcquisitionAmount() );
        assetItemResDto.setAcquisitionDate( entity.getAcquisitionDate() );
        assetItemResDto.setAssetItemCode( entity.getAssetItemCode() );
        assetItemResDto.setAssetItemName( entity.getAssetItemName() );
        assetItemResDto.setManagementDeptName( entity.getManagementDeptName() );
        assetItemResDto.setParentsCode( entity.getParentsCode() );
        assetItemResDto.setParentsName( entity.getParentsName() );
        assetItemResDto.setResidualLife( entity.getResidualLife() );
        assetItemResDto.setResidualValue( entity.getResidualValue() );
        assetItemResDto.setUsefulLife( entity.getUsefulLife() );

        return assetItemResDto;
    }

    @Override
    public List<AssetItemResDto> toDto(List<AssetItemEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AssetItemResDto> list = new ArrayList<AssetItemResDto>( entities.size() );
        for ( AssetItemEntity assetItemEntity : entities ) {
            list.add( toDto( assetItemEntity ) );
        }

        return list;
    }

    @Override
    public AssetItemResDto toDto(Optional<AssetItemEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        AssetItemResDto assetItemResDto = new AssetItemResDto();

        return assetItemResDto;
    }
}
