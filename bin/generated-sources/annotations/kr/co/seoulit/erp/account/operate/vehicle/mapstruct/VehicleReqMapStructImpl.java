package kr.co.seoulit.erp.account.operate.vehicle.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleEntity;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleReqDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:28:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class VehicleReqMapStructImpl implements VehicleReqMapStruct {

    @Override
    public VehicleEntity toEntity(VehicleReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VehicleEntity vehicleEntity = new VehicleEntity();

        vehicleEntity.setAvailability( dto.getAvailability() );
        vehicleEntity.setBusinessDistance( dto.getBusinessDistance() );
        vehicleEntity.setBusinessUsageRatio( dto.getBusinessUsageRatio() );
        vehicleEntity.setDeptCode( dto.getDeptCode() );
        vehicleEntity.setDeptName( dto.getDeptName() );
        vehicleEntity.setDistance( dto.getDistance() );
        vehicleEntity.setEmpCode( dto.getEmpCode() );
        vehicleEntity.setEmpName( dto.getEmpName() );
        vehicleEntity.setVehicleCode( dto.getVehicleCode() );
        vehicleEntity.setVehicleNumber( dto.getVehicleNumber() );
        vehicleEntity.setVehicleType( dto.getVehicleType() );

        return vehicleEntity;
    }

    @Override
    public List<VehicleEntity> toEntity(List<VehicleReqDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<VehicleEntity> list = new ArrayList<VehicleEntity>( dtos.size() );
        for ( VehicleReqDTO vehicleReqDTO : dtos ) {
            list.add( toEntity( vehicleReqDTO ) );
        }

        return list;
    }
}
