package kr.co.seoulit.erp.account.operate.vehicle.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleDetailEntity;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleDetailResDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:32:25+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240129-0421, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class VehicleDetailResMapStructImpl implements VehicleDetailResMapStruct {

    @Override
    public VehicleDetailResDTO toDto(VehicleDetailEntity entity) {
        if ( entity == null ) {
            return null;
        }

        VehicleDetailResDTO vehicleDetailResDTO = new VehicleDetailResDTO();

        vehicleDetailResDTO.setAccountCode( entity.getAccountCode() );
        vehicleDetailResDTO.setAccountName( entity.getAccountName() );
        vehicleDetailResDTO.setAcquisitionDate( entity.getAcquisitionDate() );
        vehicleDetailResDTO.setAssetCode( entity.getAssetCode() );
        vehicleDetailResDTO.setAssetName( entity.getAssetName() );
        vehicleDetailResDTO.setCustomerCode( entity.getCustomerCode() );
        vehicleDetailResDTO.setDisposalDate( entity.getDisposalDate() );
        vehicleDetailResDTO.setExpenseCategory( entity.getExpenseCategory() );
        vehicleDetailResDTO.setInsuranceCompany( entity.getInsuranceCompany() );
        vehicleDetailResDTO.setInsuranceEndPeriod( entity.getInsuranceEndPeriod() );
        vehicleDetailResDTO.setInsuranceStartPeriod( entity.getInsuranceStartPeriod() );
        vehicleDetailResDTO.setInsuranceStatus( entity.getInsuranceStatus() );
        vehicleDetailResDTO.setLeaseEndPeriod( entity.getLeaseEndPeriod() );
        vehicleDetailResDTO.setLeaseStartPeriod( entity.getLeaseStartPeriod() );
        vehicleDetailResDTO.setLeaseType( entity.getLeaseType() );
        vehicleDetailResDTO.setUsageType( entity.getUsageType() );
        vehicleDetailResDTO.setVehicleCode( entity.getVehicleCode() );

        return vehicleDetailResDTO;
    }

    @Override
    public List<VehicleDetailResDTO> toDto(List<VehicleDetailEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<VehicleDetailResDTO> list = new ArrayList<VehicleDetailResDTO>( entities.size() );
        for ( VehicleDetailEntity vehicleDetailEntity : entities ) {
            list.add( toDto( vehicleDetailEntity ) );
        }

        return list;
    }
}
