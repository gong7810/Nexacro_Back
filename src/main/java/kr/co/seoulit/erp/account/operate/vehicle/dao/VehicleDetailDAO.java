package kr.co.seoulit.erp.account.operate.vehicle.dao;

import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleDetailEntity;
import kr.co.seoulit.erp.account.operate.vehicle.entity.VehicleEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VehicleDetailDAO {

    // 업무용차량 상세조회
    VehicleDetailEntity findVehicleDetail(String vehicleCode);

    // 업무용차량상세 추가
    void insertVehicleDetail(VehicleDetailEntity vehicleDetailEntity);

    // 업무용차량상세 수정
    void updateVehicleDetail(VehicleDetailEntity vehicleDetailEntity);

    // 업무용차량상세 삭제
    void deleteVehicleDetail(String vehicleCode);
}
