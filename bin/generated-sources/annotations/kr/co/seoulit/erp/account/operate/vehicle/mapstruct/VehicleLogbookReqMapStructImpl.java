package kr.co.seoulit.erp.account.operate.vehicle.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleLogbookEntity;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleLogbookReqDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:28:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class VehicleLogbookReqMapStructImpl implements VehicleLogbookReqMapStruct {

    @Override
    public VehicleLogbookEntity toEntity(VehicleLogbookReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VehicleLogbookEntity vehicleLogbookEntity = new VehicleLogbookEntity();

        vehicleLogbookEntity.setAfterOdometer( dto.getAfterOdometer() );
        vehicleLogbookEntity.setBeforeOdometer( dto.getBeforeOdometer() );
        vehicleLogbookEntity.setBusinessDistance( dto.getBusinessDistance() );
        vehicleLogbookEntity.setDeptCode( dto.getDeptCode() );
        vehicleLogbookEntity.setDeptName( dto.getDeptName() );
        vehicleLogbookEntity.setDistance( dto.getDistance() );
        vehicleLogbookEntity.setEmpCode( dto.getEmpCode() );
        vehicleLogbookEntity.setEmpName( dto.getEmpName() );
        vehicleLogbookEntity.setNotes( dto.getNotes() );
        vehicleLogbookEntity.setPersonalDistance( dto.getPersonalDistance() );
        vehicleLogbookEntity.setStartTime( dto.getStartTime() );
        vehicleLogbookEntity.setUseDate( dto.getUseDate() );
        vehicleLogbookEntity.setVehicleCode( dto.getVehicleCode() );

        return vehicleLogbookEntity;
    }

    @Override
    public List<VehicleLogbookEntity> toEntity(List<VehicleLogbookReqDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<VehicleLogbookEntity> list = new ArrayList<VehicleLogbookEntity>( dtos.size() );
        for ( VehicleLogbookReqDTO vehicleLogbookReqDTO : dtos ) {
            list.add( toEntity( vehicleLogbookReqDTO ) );
        }

        return list;
    }
}
