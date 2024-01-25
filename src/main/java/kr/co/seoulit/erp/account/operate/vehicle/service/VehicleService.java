package kr.co.seoulit.erp.account.operate.vehicle.service;

import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleResDTO;

import java.util.List;

public interface VehicleService {

    // 업무용차량 전체조회
    public List<VehicleResDTO> findVehicleList();

    // 업무용차량 상세조회
    public VehicleResDTO findVehicleDetail(String vehicleCode);
}
