package kr.co.seoulit.erp.account.operate.currentAsset.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.currentAsset.entity.CurrentAssetDetailEntity;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetDetailReqDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:25:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class CurrentAssetDetailReqMapStructImpl implements CurrentAssetDetailReqMapStruct {

    @Override
    public CurrentAssetDetailEntity toEntity(CurrentAssetDetailReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CurrentAssetDetailEntity currentAssetDetailEntity = new CurrentAssetDetailEntity();

        currentAssetDetailEntity.setAccumulatedAmortization( dto.getAccumulatedAmortization() );
        currentAssetDetailEntity.setAcquisitionCost( dto.getAcquisitionCost() );
        currentAssetDetailEntity.setAcquisitionQuantity( dto.getAcquisitionQuantity() );
        currentAssetDetailEntity.setAmortizationFinalYear( dto.getAmortizationFinalYear() );
        currentAssetDetailEntity.setAmortizationRate( dto.getAmortizationRate() );
        currentAssetDetailEntity.setAmortizationWay( dto.getAmortizationWay() );
        currentAssetDetailEntity.setAssetCode( dto.getAssetCode() );
        currentAssetDetailEntity.setBookValue( dto.getBookValue() );
        currentAssetDetailEntity.setBookValueEnd( dto.getBookValueEnd() );
        currentAssetDetailEntity.setChangeQuantity( dto.getChangeQuantity() );
        currentAssetDetailEntity.setDepartment( dto.getDepartment() );
        currentAssetDetailEntity.setDepreciation( dto.getDepreciation() );
        currentAssetDetailEntity.setMonth( dto.getMonth() );
        currentAssetDetailEntity.setNormalAmortization( dto.getNormalAmortization() );
        currentAssetDetailEntity.setRemainQuantity( dto.getRemainQuantity() );
        currentAssetDetailEntity.setUsefulLife( dto.getUsefulLife() );

        return currentAssetDetailEntity;
    }

    @Override
    public List<CurrentAssetDetailEntity> toEntity(List<CurrentAssetDetailReqDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<CurrentAssetDetailEntity> list = new ArrayList<CurrentAssetDetailEntity>( dtos.size() );
        for ( CurrentAssetDetailReqDTO currentAssetDetailReqDTO : dtos ) {
            list.add( toEntity( currentAssetDetailReqDTO ) );
        }

        return list;
    }
}
