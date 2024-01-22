package kr.co.seoulit.erp.account.operate.currentAsset.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.currentAsset.entity.CurrentAssetEntity;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetResDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-22T20:29:54+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class CurrentAssetResMapStructImpl implements CurrentAssetResMapStruct {

    @Override
    public CurrentAssetResDTO toDto(CurrentAssetEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CurrentAssetResDTO currentAssetResDTO = new CurrentAssetResDTO();

        currentAssetResDTO.setAccountCode( entity.getAccountCode() );
        currentAssetResDTO.setAccountName( entity.getAccountName() );
        currentAssetResDTO.setAccumulatedAmortization( entity.getAccumulatedAmortization() );
        currentAssetResDTO.setAcquisitionCost( entity.getAcquisitionCost() );
        currentAssetResDTO.setAcquisitionQuantity( entity.getAcquisitionQuantity() );
        currentAssetResDTO.setAmortizationFinalYear( entity.getAmortizationFinalYear() );
        currentAssetResDTO.setAmortizationRate( entity.getAmortizationRate() );
        currentAssetResDTO.setAmortizationWay( entity.getAmortizationWay() );
        currentAssetResDTO.setAssetCode( entity.getAssetCode() );
        currentAssetResDTO.setAssetName( entity.getAssetName() );
        currentAssetResDTO.setBookValue( entity.getBookValue() );
        currentAssetResDTO.setBookValueEnd( entity.getBookValueEnd() );
        currentAssetResDTO.setChangeQuantity( entity.getChangeQuantity() );
        currentAssetResDTO.setDepartment( entity.getDepartment() );
        currentAssetResDTO.setDepreciation( entity.getDepreciation() );
        currentAssetResDTO.setFinalizeStatus( entity.getFinalizeStatus() );
        currentAssetResDTO.setMonth( entity.getMonth() );
        currentAssetResDTO.setNormalAmortization( entity.getNormalAmortization() );
        currentAssetResDTO.setProgress( entity.getProgress() );
        currentAssetResDTO.setRemainQuantity( entity.getRemainQuantity() );
        currentAssetResDTO.setUsefulLife( entity.getUsefulLife() );

        return currentAssetResDTO;
    }

    @Override
    public ArrayList<CurrentAssetResDTO> toDto(List<CurrentAssetEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        ArrayList<CurrentAssetResDTO> arrayList = new ArrayList<CurrentAssetResDTO>();
        for ( CurrentAssetEntity currentAssetEntity : entities ) {
            arrayList.add( toDto( currentAssetEntity ) );
        }

        return arrayList;
    }
}
