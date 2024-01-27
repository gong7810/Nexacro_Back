package kr.co.seoulit.erp.account.operate.vehicle.service;

import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleDetailReqDTO;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleDetailResDTO;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleReqDTO;
import kr.co.seoulit.erp.account.operate.vehicle.to.VehicleResDTO;

import java.text.ParseException;
import java.util.List;

public interface VehicleService {

    // 업무용차량 전체조회
    public List<VehicleResDTO> findVehicleList();

    // 업무용차량 한개조회
    public VehicleResDTO findVehicle(String vehicleCode);

    // 업무용차량 상세조회
    public VehicleDetailResDTO findVehicleDetail(String vehicleCode);

    // 업무용차량 추가
    public void insertVehicle(VehicleReqDTO vehicleReqDTO, VehicleDetailReqDTO vehicleDetailReqDTO) throws ParseException;

    // 업무용차량 수정
    public void updateVehicle(VehicleReqDTO vehicleReqDTO, VehicleDetailReqDTO vehicleDetailReqDTO);

    // 업무용차량 삭제
    public void deleteVehicle(String vehicleCode);

}
