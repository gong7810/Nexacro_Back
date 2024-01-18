package kr.co.seoulit.erp.account.operate.currentAsset.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.currentAsset.entity.CurrentAssetDetailEntity;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetDetailReqDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-17T20:58:21+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class CurrentAssetDetailReqMapStructImpl implements CurrentAssetDetailReqMapStruct {

    @Override
    public CurrentAssetDetailEntity toEntity(CurrentAssetDetailReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CurrentAssetDetailEntity currentAssetDetailEntity = new CurrentAssetDetailEntity();

        currentAssetDetailEntity.setAssetCode( dto.getAssetCode() );
        currentAssetDetailEntity.setAcquisitionCost( dto.getAcquisitionCost() );
        currentAssetDetailEntity.setDepreciation( dto.getDepreciation() );
        currentAssetDetailEntity.setBookValue( dto.getBookValue() );
        currentAssetDetailEntity.setAmortizationWay( dto.getAmortizationWay() );
        currentAssetDetailEntity.setAmortizationFinalYear( dto.getAmortizationFinalYear() );
        currentAssetDetailEntity.setUsefulLife( dto.getUsefulLife() );
        currentAssetDetailEntity.setAmortizationRate( dto.getAmortizationRate() );
        currentAssetDetailEntity.setMonth( dto.getMonth() );
        currentAssetDetailEntity.setNormalAmortization( dto.getNormalAmortization() );
        currentAssetDetailEntity.setRAccumulatedAmortization( dto.getRAccumulatedAmortization() );
        currentAssetDetailEntity.setAccumulatedAmortization( dto.getAccumulatedAmortization() );
        currentAssetDetailEntity.setBookValueEnd( dto.getBookValueEnd() );
        currentAssetDetailEntity.setAcquisitionQuantity( dto.getAcquisitionQuantity() );
        currentAssetDetailEntity.setChangeQuantity( dto.getChangeQuantity() );
        currentAssetDetailEntity.setRemainQuantity( dto.getRemainQuantity() );
        currentAssetDetailEntity.setDepartment( dto.getDepartment() );

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
