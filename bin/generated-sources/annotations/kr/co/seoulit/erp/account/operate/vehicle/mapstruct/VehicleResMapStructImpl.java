package kr.co.seoulit.erp.account.operate.vehicle.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleEntity;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleResDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:28:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class VehicleResMapStructImpl implements VehicleResMapStruct {

    @Override
    public VehicleResDTO toDto(VehicleEntity entity) {
        if ( entity == null ) {
            return null;
        }

        VehicleResDTO vehicleResDTO = new VehicleResDTO();

        vehicleResDTO.setAvailability( entity.getAvailability() );
        vehicleResDTO.setBusinessDistance( entity.getBusinessDistance() );
        vehicleResDTO.setBusinessUsageRatio( entity.getBusinessUsageRatio() );
        vehicleResDTO.setDeptCode( entity.getDeptCode() );
        vehicleResDTO.setDeptName( entity.getDeptName() );
        vehicleResDTO.setDistance( entity.getDistance() );
        vehicleResDTO.setEmpCode( entity.getEmpCode() );
        vehicleResDTO.setEmpName( entity.getEmpName() );
        vehicleResDTO.setVehicleCode( entity.getVehicleCode() );
        vehicleResDTO.setVehicleNumber( entity.getVehicleNumber() );
        vehicleResDTO.setVehicleType( entity.getVehicleType() );

        return vehicleResDTO;
    }

    @Override
    public List<VehicleResDTO> toDto(List<VehicleEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<VehicleResDTO> list = new ArrayList<VehicleResDTO>( entities.size() );
        for ( VehicleEntity vehicleEntity : entities ) {
            list.add( toDto( vehicleEntity ) );
        }

        return list;
    }
}
