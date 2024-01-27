package kr.co.seoulit.erp.account.operate.vehicle.service;

import kr.co.seoulit.erp.account.operate.vehicle.dao.VehicleDAO;
import kr.co.seoulit.erp.account.operate.vehicle.dao.VehicleDetailDAO;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleDetailEntity;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleEntity;
import kr.co.seoulit.erp.account.operate.vehicle.mapstruct.VehicleDetailReqMapStruct;
import kr.co.seoulit.erp.account.operate.vehicle.mapstruct.VehicleDetailResMapStruct;
import kr.co.seoulit.erp.account.operate.vehicle.mapstruct.VehicleReqMapStruct;
import kr.co.seoulit.erp.account.operate.vehicle.mapstruct.VehicleResMapStruct;
import kr.co.seoulit.erp.account.operate.vehicle.to.*;
import kr.co.seoulit.erp.account.sys.base.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    private VehicleDAO vehicleDAO;
    @Autowired
    private VehicleDetailDAO vehicleDetailDAO;
    @Autowired
    private VehicleReqMapStruct vehicleReqMapStruct;
    @Autowired
    private VehicleResMapStruct vehicleResMapStruct;
    @Autowired
    private VehicleDetailReqMapStruct vehicleDetailReqMapStruct;
    @Autowired
    private VehicleDetailResMapStruct vehicleDetailResMapStruct;
    @Autowired
    private BaseService baseService;


    // 업무용차량 전체조회
    @Override
    public List<VehicleResDTO> findVehicleList() {

        List<VehicleEntity> vehicleEntities = vehicleDAO.findVehicleList();

        return vehicleResMapStruct.toDto(vehicleEntities);

    }

    // 업무용차량 한개조회
    @Override
    public VehicleResDTO findVehicle(String vehicleCode) {

        VehicleEntity vehicleEntity = vehicleDAO.findVehicle(vehicleCode);

        return vehicleResMapStruct.toDto(vehicleEntity);
    }

    // 업무용차량 상세조회
    @Override
    public VehicleDetailResDTO findVehicleDetail(String vehicleCode) {

        VehicleDetailEntity vehicleDetailEntity = vehicleDetailDAO.findVehicleDetail(vehicleCode);

        return vehicleDetailResMapStruct.toDto(vehicleDetailEntity);
    }

    // 업무용차량 추가
    @Override
    public void insertVehicle(VehicleReqDTO vehicleReqDTO, VehicleDetailReqDTO vehicleDetailReqDTO) throws ParseException {

        VehicleEntity vehicleEntity = vehicleReqMapStruct.toEntity(vehicleReqDTO);
        VehicleDetailEntity vehicleDetailEntity = vehicleDetailReqMapStruct.toEntity(vehicleDetailReqDTO);

        vehicleDAO.insertVehicle(vehicleEntity);
        vehicleDetailDAO.insertVehicleDetail(vehicleDetailEntity);
    }

    // 업무용차량 수정
    @Override
    public void updateVehicle(VehicleReqDTO vehicleReqDTO, VehicleDetailReqDTO vehicleDetailReqDTO) {

        VehicleEntity vehicleEntity = vehicleReqMapStruct.toEntity(vehicleReqDTO);
        VehicleDetailEntity vehicleDetailEntity = vehicleDetailReqMapStruct.toEntity(vehicleDetailReqDTO);

        vehicleDAO.updateVehicle(vehicleEntity);
        vehicleDetailDAO.updateVehicleDetail(vehicleDetailEntity);
    }

    // 업무용차량 삭제
    @Override
    public void deleteVehicle(String vehicleCode) {

        vehicleDetailDAO.deleteVehicleDetail(vehicleCode);
        vehicleDAO.deleteVehicle(vehicleCode);
    }

}
