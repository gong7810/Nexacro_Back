package kr.co.seoulit.erp.account.operate.currentAsset.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.currentAsset.entity.CurrentAssetDetailEntity;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetDetailResDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
<<<<<<< HEAD
    date = "2024-02-01T17:07:08+0900",
=======
    date = "2024-01-30T11:18:32+0900",
>>>>>>> main
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.22 (Amazon.com Inc.)"
)
@Component
public class CurrentAssetDetailResMapStructImpl implements CurrentAssetDetailResMapStruct {

    @Override
    public CurrentAssetDetailResDTO toDto(CurrentAssetDetailEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CurrentAssetDetailResDTO currentAssetDetailResDTO = new CurrentAssetDetailResDTO();

        currentAssetDetailResDTO.setAssetCode( entity.getAssetCode() );
        currentAssetDetailResDTO.setAcquisitionCost( entity.getAcquisitionCost() );
        currentAssetDetailResDTO.setAmortizationWay( entity.getAmortizationWay() );
        currentAssetDetailResDTO.setDepartment( entity.getDepartment() );
        currentAssetDetailResDTO.setDepreciation( entity.getDepreciation() );
        currentAssetDetailResDTO.setBookValue( entity.getBookValue() );
        currentAssetDetailResDTO.setUsefulLife( entity.getUsefulLife() );
        currentAssetDetailResDTO.setAmortizationFinalYear( entity.getAmortizationFinalYear() );
        currentAssetDetailResDTO.setAcquisitionQuantity( entity.getAcquisitionQuantity() );
        currentAssetDetailResDTO.setChangeQuantity( entity.getChangeQuantity() );
        currentAssetDetailResDTO.setRemainQuantity( entity.getRemainQuantity() );
        currentAssetDetailResDTO.setAmortizationRate( entity.getAmortizationRate() );
        currentAssetDetailResDTO.setMonth( entity.getMonth() );
        currentAssetDetailResDTO.setNormalAmortization( entity.getNormalAmortization() );
        currentAssetDetailResDTO.setAccumulatedAmortization( entity.getAccumulatedAmortization() );
        currentAssetDetailResDTO.setBookValueEnd( entity.getBookValueEnd() );

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
