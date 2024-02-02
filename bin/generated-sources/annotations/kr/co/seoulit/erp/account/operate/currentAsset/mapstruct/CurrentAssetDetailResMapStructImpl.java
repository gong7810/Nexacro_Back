package kr.co.seoulit.erp.account.operate.currentAsset.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.currentAsset.entity.CurrentAssetDetailEntity;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetDetailResDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:25:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class CurrentAssetDetailResMapStructImpl implements CurrentAssetDetailResMapStruct {

    @Override
    public CurrentAssetDetailResDTO toDto(CurrentAssetDetailEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CurrentAssetDetailResDTO currentAssetDetailResDTO = new CurrentAssetDetailResDTO();

        currentAssetDetailResDTO.setAccumulatedAmortization( entity.getAccumulatedAmortization() );
        currentAssetDetailResDTO.setAcquisitionCost( entity.getAcquisitionCost() );
        currentAssetDetailResDTO.setAcquisitionQuantity( entity.getAcquisitionQuantity() );
        currentAssetDetailResDTO.setAmortizationFinalYear( entity.getAmortizationFinalYear() );
        currentAssetDetailResDTO.setAmortizationRate( entity.getAmortizationRate() );
        currentAssetDetailResDTO.setAmortizationWay( entity.getAmortizationWay() );
        currentAssetDetailResDTO.setAssetCode( entity.getAssetCode() );
        currentAssetDetailResDTO.setBookValue( entity.getBookValue() );
        currentAssetDetailResDTO.setBookValueEnd( entity.getBookValueEnd() );
        currentAssetDetailResDTO.setChangeQuantity( entity.getChangeQuantity() );
        currentAssetDetailResDTO.setDepartment( entity.getDepartment() );
        currentAssetDetailResDTO.setDepreciation( entity.getDepreciation() );
        currentAssetDetailResDTO.setMonth( entity.getMonth() );
        currentAssetDetailResDTO.setNormalAmortization( entity.getNormalAmortization() );
        currentAssetDetailResDTO.setRemainQuantity( entity.getRemainQuantity() );
        currentAssetDetailResDTO.setUsefulLife( entity.getUsefulLife() );

        return currentAssetDetailResDTO;
    }

    @Override
    public List<CurrentAssetDetailResDTO> toDto(List<CurrentAssetDetailEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CurrentAssetDetailResDTO> list = new ArrayList<CurrentAssetDetailResDTO>( entities.size() );
        for ( CurrentAssetDetailEntity currentAssetDetailEntity : entities ) {
            list.add( toDto( currentAssetDetailEntity ) );
        }

        return list;
    }
}
