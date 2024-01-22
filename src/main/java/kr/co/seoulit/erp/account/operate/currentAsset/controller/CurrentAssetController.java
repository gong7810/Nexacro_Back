package kr.co.seoulit.erp.account.operate.currentAsset.controller;

import com.nexacro.java.xapi.data.PlatformData;
import kr.co.seoulit.erp.account.operate.currentAsset.service.CurrentAssetDetailService;
import kr.co.seoulit.erp.account.operate.currentAsset.service.CurrentAssetService;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetDetailReqDTO;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetDetailResDTO;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetReqDTO;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetResDTO;
import kr.co.seoulit.erp.account.sys.common.dao.DatasetToBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/acc/operate")
public class CurrentAssetController {

    @Autowired
    private CurrentAssetService currentAssetService;
    @Autowired
    private CurrentAssetDetailService currentAssetDetailService;
    @Autowired
    private DatasetToBeanMapper datasetToBeanMapper;

    // 고정자산 조회
    @RequestMapping("/findAssetList")
    public void findAssetList(@RequestAttribute("reqData") PlatformData reqData,
                              @RequestAttribute("resData")PlatformData resData) throws Exception {
        System.out.println("고정자산 조회 Rest API");
        List<CurrentAssetResDTO> currentAssetList = currentAssetService.findAssetList();
        datasetToBeanMapper.beansToDataset(resData, currentAssetList, CurrentAssetResDTO.class);
    }

    // 고정자산상세 조회
    @RequestMapping("/findAssetDetail")
    public void findAssetDetail(@RequestAttribute("reqData")PlatformData reqData,
                                @RequestAttribute("resData")PlatformData resData) throws Exception {

        String assetCode = reqData.getVariable("assetCode").getString();
        System.out.println("고정자산 : "+ assetCode + " 상세 조회 Rest API");

        CurrentAssetResDTO currentAssetResDTO = currentAssetService.findAssetDetail(assetCode);
        datasetToBeanMapper.beanToDataset(resData, currentAssetResDTO, CurrentAssetResDTO.class);
    }

    // 고정자산 추가
    @RequestMapping("/insertAsset")
    public void insertAsset(@RequestAttribute("reqData") PlatformData reqData,
                            @RequestAttribute("resData")PlatformData resData) throws Exception {

        CurrentAssetReqDTO currentAssetReqDTO = datasetToBeanMapper.datasetToBean(reqData, CurrentAssetReqDTO.class);
        System.out.println("고정자산 추가 Rest API "+ currentAssetReqDTO);
        currentAssetService.insertAsset(currentAssetReqDTO);
    }

    // 고정자산상세 추가
    @RequestMapping("/insertAssetDetail")
    public void insertAssetDetail(@RequestAttribute("reqData") PlatformData reqData,
                                  @RequestAttribute("resData")PlatformData resData) throws Exception {

        CurrentAssetDetailReqDTO currentAssetDetailReqDTO = datasetToBeanMapper.datasetToBean(reqData, CurrentAssetDetailReqDTO.class);
        System.out.println("고정자산상세 추가 Rest API "+ currentAssetDetailReqDTO);
        currentAssetDetailService.insertAssetDetail(currentAssetDetailReqDTO);
    }

    // 고정자산 수정
    @RequestMapping("/updateAsset")
    public void updateAsset(@RequestAttribute("reqData")PlatformData reqData,
                            @RequestAttribute("resData")PlatformData resData) throws Exception {

        CurrentAssetReqDTO currentAssetReqDTO = datasetToBeanMapper.datasetToBean(reqData, CurrentAssetReqDTO.class);
        System.out.println("고정자산 수정 Rest API "+ currentAssetReqDTO);
        currentAssetService.updateAsset(currentAssetReqDTO);
    }

    // 고정자산 삭제
    @RequestMapping("/deleteAsset")
    public void deleteAsset(@RequestAttribute("reqData")PlatformData reqData,
                            @RequestAttribute("resData")PlatformData resData) throws Exception {
        String assetCode = reqData.getVariable("assetCode").getString();
        System.out.println("고정자산 : " + assetCode + "삭제 Rest API");
        currentAssetService.deleteAsset(assetCode);
    }


}
