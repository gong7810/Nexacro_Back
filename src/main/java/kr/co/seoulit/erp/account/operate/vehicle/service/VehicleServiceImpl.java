package kr.co.seoulit.erp.account.operate.vehicle.service;

import kr.co.seoulit.erp.account.operate.vehicle.dao.VehicleDAO;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleEntity;
import kr.co.seoulit.erp.account.operate.vehicle.mapstruct.VehicleResMapStruct;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleResDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    private VehicleDAO vehicleDAO;

    @Autowired
    private VehicleResMapStruct vehicleResMapStruct;


    // 업무용차량 전체조회
    @Override
    public List<VehicleResDTO> findVehicleList() {

        List<VehicleEntity> vehicleEntities = vehicleDAO.findVehicleList();

        return vehicleResMapStruct.toDto(vehicleEntities);

    }

    // 업무용 차량 상세조회
    @Override
    public VehicleResDTO findVehicleDetail(String vehicleCode) {
        return null;
    }
}
