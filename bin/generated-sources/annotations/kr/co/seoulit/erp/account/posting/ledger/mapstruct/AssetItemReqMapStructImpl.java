package kr.co.seoulit.erp.account.posting.ledger.mapstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.posting.ledger.dto.AssetItemReqDto;
import kr.co.seoulit.erp.account.posting.ledger.entity.AssetItemEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-22T20:01:49+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class AssetItemReqMapStructImpl implements AssetItemReqMapStruct {

    @Override
    public List<AssetItemEntity> toEntity(List<AssetItemReqDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<AssetItemEntity> list = new ArrayList<AssetItemEntity>( dtos.size() );
        for ( AssetItemReqDto assetItemReqDto : dtos ) {
            list.add( toEntity( assetItemReqDto ) );
        }

        return list;
    }

    @Override
    public AssetItemReqDto toDto(Optional<AssetItemEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        AssetItemReqDto assetItemReqDto = new AssetItemReqDto();

        return assetItemReqDto;
    }

    @Override
    public AssetItemEntity toEntity(AssetItemReqDto dto) {
        if ( dto == null ) {
            return null;
        }

        AssetItemEntity assetItemEntity = new AssetItemEntity();

        assetItemEntity.setAcquisitionAmount( dto.getAcquisitionAmount() );
        assetItemEntity.setAcquisitionDate( dto.getAcquisitionDate() );
        assetItemEntity.setAssetItemCode( dto.getAssetItemCode() );
        assetItemEntity.setAssetItemName( dto.getAssetItemName() );
        assetItemEntity.setManagementDeptName( dto.getManagementDeptName() );
        assetItemEntity.setParentsCode( dto.getParentsCode() );
        assetItemEntity.setParentsName( dto.getParentsName() );
        assetItemEntity.setUsefulLife( dto.getUsefulLife() );

        return assetItemEntity;
    }
}
