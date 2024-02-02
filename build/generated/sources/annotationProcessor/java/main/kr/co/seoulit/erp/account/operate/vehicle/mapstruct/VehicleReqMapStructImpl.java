package kr.co.seoulit.erp.account.operate.vehicle.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleEntity;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleReqDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:56:16+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.22 (Amazon.com Inc.)"
)
@Component
public class VehicleReqMapStructImpl implements VehicleReqMapStruct {

    @Override
    public VehicleEntity toEntity(VehicleReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VehicleEntity vehicleEntity = new VehicleEntity();

        vehicleEntity.setVehicleCode( dto.getVehicleCode() );
        vehicleEntity.setVehicleNumber( dto.getVehicleNumber() );
        vehicleEntity.setVehicleType( dto.getVehicleType() );
        vehicleEntity.setDeptCode( dto.getDeptCode() );
        vehicleEntity.setDeptName( dto.getDeptName() );
        vehicleEntity.setEmpCode( dto.getEmpCode() );
        vehicleEntity.setEmpName( dto.getEmpName() );
        vehicleEntity.setAvailability( dto.getAvailability() );
        vehicleEntity.setDistance( dto.getDistance() );
        vehicleEntity.setBusinessDistance( dto.getBusinessDistance() );
        vehicleEntity.setBusinessUsageRatio( dto.getBusinessUsageRatio() );

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
