package kr.co.seoulit.erp.account.operate.vehicle.controller;

import com.nexacro.java.xapi.data.PlatformData;
import kr.co.seoulit.erp.account.operate.vehicle.service.VehicleService;
import kr.co.seoulit.erp.account.operate.vehicle.to.*;
import kr.co.seoulit.erp.account.sys.common.dao.DatasetToBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acc/operate")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private DatasetToBeanMapper datasetToBeanMapper;

    // 업무용차량 전체조회
    @RequestMapping("findVehicleList")
    public void findVehicleList(@RequestAttribute("reqData") PlatformData reqData,
                                @RequestAttribute("resData") PlatformData resData) throws Exception {

        System.out.println("업무용차량 전체조회 Rest API");
        List<VehicleResDTO> vehicleList = vehicleService.findVehicleList();
        datasetToBeanMapper.beansToDataset(resData, vehicleList, VehicleResDTO.class);
    }

}
