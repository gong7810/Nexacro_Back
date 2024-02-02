package kr.co.seoulit.erp.account.operate.vehicle.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleLogbookEntity;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleLogbookResDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:28:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class VehicleLogbookResMapStructImpl implements VehicleLogbookResMapStruct {

    @Override
    public VehicleLogbookResDTO toDto(VehicleLogbookEntity entity) {
        if ( entity == null ) {
            return null;
        }

        VehicleLogbookResDTO vehicleLogbookResDTO = new VehicleLogbookResDTO();

        vehicleLogbookResDTO.setAfterOdometer( entity.getAfterOdometer() );
        vehicleLogbookResDTO.setBeforeOdometer( entity.getBeforeOdometer() );
        vehicleLogbookResDTO.setBusinessDistance( entity.getBusinessDistance() );
        vehicleLogbookResDTO.setDeptCode( entity.getDeptCode() );
        vehicleLogbookResDTO.setDeptName( entity.getDeptName() );
        vehicleLogbookResDTO.setDistance( entity.getDistance() );
        vehicleLogbookResDTO.setEmpCode( entity.getEmpCode() );
        vehicleLogbookResDTO.setEmpName( entity.getEmpName() );
        vehicleLogbookResDTO.setNotes( entity.getNotes() );
        vehicleLogbookResDTO.setPersonalDistance( entity.getPersonalDistance() );
        vehicleLogbookResDTO.setStartTime( entity.getStartTime() );
        vehicleLogbookResDTO.setUseDate( entity.getUseDate() );
        vehicleLogbookResDTO.setVehicleCode( entity.getVehicleCode() );

        return vehicleLogbookResDTO;
    }

    @Override
    public List<VehicleLogbookResDTO> toDto(List<VehicleLogbookEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<VehicleLogbookResDTO> list = new ArrayList<VehicleLogbookResDTO>( entities.size() );
        for ( VehicleLogbookEntity vehicleLogbookEntity : entities ) {
            list.add( toDto( vehicleLogbookEntity ) );
        }

        return list;
    }
}
