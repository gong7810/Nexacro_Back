package kr.co.seoulit.erp.account.operate.vehicle.dao;

import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VehicleDAO {

    // 업무용차량 전체조회
    List<VehicleEntity> findVehicleList();
    void insertVehicle(VehicleEntity vehicleEntity);
    void updateVehicle(VehicleEntity vehicleEntity);
    void deleteVehicle(String vehicleCode);
}