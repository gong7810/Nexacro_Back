package kr.co.seoulit.erp.account.operate.vehicle.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleDetailEntity;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleDetailReqDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:28:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class VehicleDetailReqMapStructImpl implements VehicleDetailReqMapStruct {

    @Override
    public VehicleDetailEntity toEntity(VehicleDetailReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VehicleDetailEntity vehicleDetailEntity = new VehicleDetailEntity();

        vehicleDetailEntity.setAccountCode( dto.getAccountCode() );
        vehicleDetailEntity.setAccountName( dto.getAccountName() );
        vehicleDetailEntity.setAcquisitionDate( dto.getAcquisitionDate() );
        vehicleDetailEntity.setAssetCode( dto.getAssetCode() );
        vehicleDetailEntity.setAssetName( dto.getAssetName() );
        vehicleDetailEntity.setCustomerCode( dto.getCustomerCode() );
        vehicleDetailEntity.setDisposalDate( dto.getDisposalDate() );
        vehicleDetailEntity.setExpenseCategory( dto.getExpenseCategory() );
        vehicleDetailEntity.setInsuranceCompany( dto.getInsuranceCompany() );
        vehicleDetailEntity.setInsuranceEndPeriod( dto.getInsuranceEndPeriod() );
        vehicleDetailEntity.setInsuranceStartPeriod( dto.getInsuranceStartPeriod() );
        vehicleDetailEntity.setInsuranceStatus( dto.getInsuranceStatus() );
        vehicleDetailEntity.setLeaseEndPeriod( dto.getLeaseEndPeriod() );
        vehicleDetailEntity.setLeaseStartPeriod( dto.getLeaseStartPeriod() );
        vehicleDetailEntity.setLeaseType( dto.getLeaseType() );
        vehicleDetailEntity.setUsageType( dto.getUsageType() );
        vehicleDetailEntity.setVehicleCode( dto.getVehicleCode() );

        return vehicleDetailEntity;
    }

    @Override
    public List<VehicleDetailEntity> toEntity(List<VehicleDetailReqDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<VehicleDetailEntity> list = new ArrayList<VehicleDetailEntity>( dtos.size() );
        for ( VehicleDetailReqDTO vehicleDetailReqDTO : dtos ) {
            list.add( toEntity( vehicleDetailReqDTO ) );
        }

        return list;
    }
}
