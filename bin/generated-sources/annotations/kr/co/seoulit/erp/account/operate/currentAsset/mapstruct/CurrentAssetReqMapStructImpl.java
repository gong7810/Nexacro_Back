package kr.co.seoulit.erp.account.operate.currentAsset.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.currentAsset.entity.CurrentAssetEntity;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetReqDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:32:24+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240129-0421, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class CurrentAssetReqMapStructImpl implements CurrentAssetReqMapStruct {

    @Override
    public CurrentAssetEntity toEntity(CurrentAssetReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CurrentAssetEntity currentAssetEntity = new CurrentAssetEntity();

        currentAssetEntity.setAccountCode( dto.getAccountCode() );
        currentAssetEntity.setAccountName( dto.getAccountName() );
        currentAssetEntity.setAccumulatedAmortization( dto.getAccumulatedAmortization() );
        currentAssetEntity.setAcquisitionCost( dto.getAcquisitionCost() );
        currentAssetEntity.setAcquisitionQuantity( dto.getAcquisitionQuantity() );
        currentAssetEntity.setAmortizationFinalYear( dto.getAmortizationFinalYear() );
        currentAssetEntity.setAmortizationRate( dto.getAmortizationRate() );
        currentAssetEntity.setAmortizationWay( dto.getAmortizationWay() );
        currentAssetEntity.setAssetCode( dto.getAssetCode() );
        currentAssetEntity.setAssetName( dto.getAssetName() );
        currentAssetEntity.setBookValue( dto.getBookValue() );
        currentAssetEntity.setBookValueEnd( dto.getBookValueEnd() );
        currentAssetEntity.setChangeQuantity( dto.getChangeQuantity() );
        currentAssetEntity.setDepartment( dto.getDepartment() );
        currentAssetEntity.setDepreciation( dto.getDepreciation() );
        currentAssetEntity.setFinalizeStatus( dto.getFinalizeStatus() );
        currentAssetEntity.setMonth( dto.getMonth() );
        currentAssetEntity.setNormalAmortization( dto.getNormalAmortization() );
        currentAssetEntity.setProgress( dto.getProgress() );
        currentAssetEntity.setRemainQuantity( dto.getRemainQuantity() );
        currentAssetEntity.setUsefulLife( dto.getUsefulLife() );

        return currentAssetEntity;
    }

    @Override
    public List<CurrentAssetEntity> toEntity(List<CurrentAssetReqDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<CurrentAssetEntity> list = new ArrayList<CurrentAssetEntity>( dtos.size() );
        for ( CurrentAssetReqDTO currentAssetReqDTO : dtos ) {
            list.add( toEntity( currentAssetReqDTO ) );
        }

        return list;
    }
}
