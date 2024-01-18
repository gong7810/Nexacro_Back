package kr.co.seoulit.erp.account.operate.currentAsset.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.currentAsset.entity.CurrentAssetEntity;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetResDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-17T21:45:35+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.11 (Oracle Corporation)"
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
        currentAssetResDTO.setAssetCode( entity.getAssetCode() );
        currentAssetResDTO.setAssetName( entity.getAssetName() );
        currentAssetResDTO.setProgress( entity.getProgress() );
        currentAssetResDTO.setFinalizeStatus( entity.getFinalizeStatus() );
        currentAssetResDTO.setAcquisitionCost( entity.getAcquisitionCost() );
        currentAssetResDTO.setDepreciation( entity.getDepreciation() );
        currentAssetResDTO.setBookValue( entity.getBookValue() );
        currentAssetResDTO.setNormalAmortization( entity.getNormalAmortization() );
        currentAssetResDTO.setAccumulatedAmortization( entity.getAccumulatedAmortization() );
        currentAssetResDTO.setBookValueEnd( entity.getBookValueEnd() );
        currentAssetResDTO.setAcquisitionQuantity( entity.getAcquisitionQuantity() );
        currentAssetResDTO.setChangeQuantity( entity.getChangeQuantity() );
        currentAssetResDTO.setRemainQuantity( entity.getRemainQuantity() );

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
