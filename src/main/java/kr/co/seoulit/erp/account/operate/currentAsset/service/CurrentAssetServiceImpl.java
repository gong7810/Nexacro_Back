package kr.co.seoulit.erp.account.operate.currentAsset.service;

import kr.co.seoulit.erp.account.operate.currentAsset.dao.*;
import kr.co.seoulit.erp.account.operate.currentAsset.to.*;
import kr.co.seoulit.erp.account.operate.currentAsset.entity.*;
import kr.co.seoulit.erp.account.operate.currentAsset.mapstruct.*;
import kr.co.seoulit.erp.account.operate.currentAsset.repository.*;
import kr.co.seoulit.erp.account.operate.system.mapstruct.BoardReqMapStruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CurrentAssetServiceImpl implements CurrentAssetService {
    @Autowired
    private CurrentAssetDAO currentAssetDAO;
//    @Autowired
//    private CurrentAssetRepository currentAssetRepository;
    @Autowired
    private CurrentAssetReqMapStruct currentAssetReqMapStruct;
    @Autowired
    private CurrentAssetResMapStruct currentAssetResMapStruct;
    @Autowired
    private CurrentAssetDetailReqMapStruct currentAssetDetailReqMapStruct;
    @Autowired
    private CurrentAssetDetailResMapStruct currentAssetDetailResMapStruct;



    // 고정자산 조회
    @Override
    public List<CurrentAssetResDTO> findAssetList() throws Exception {

        List<CurrentAssetEntity> currentAssetEntities = currentAssetDAO.findAssetList();
//        List<CurrentAssetEntity> currentAssetEntities = currentAssetRepository.findAssetList();
        return	currentAssetResMapStruct.toDto(currentAssetEntities);
    }

    // 고정자산 상세 조회
    @Override
    public CurrentAssetDetailResDTO findAssetDetail(String assetCode) throws Exception {

        CurrentAssetDetailEntity currentAssetDetailEntity = currentAssetDAO.findAssetDetail(assetCode);
//        CurrentAssetEntity currentAssetEntity	= currentAssetRepository.findAssetDetail(assetCode);
        return	currentAssetDetailResMapStruct.toDto(currentAssetDetailEntity);
    }

    // 고정자산 추가
    @Override
    public void insertAsset(CurrentAssetReqDTO currentAssetReqDTO) throws Exception {

        HashMap<String, Object> params = new HashMap<>();

        CurrentAssetEntity currentAssetEntity = currentAssetReqMapStruct.toEntity(currentAssetReqDTO);

//        // map에 Entity 세팅
//        params.put("accountCode",currentAssetEntity.getAccountCode());
//        params.put("accountName",currentAssetEntity.getAccountName());
//        params.put("assetCode",currentAssetEntity.getAssetCode());
//        params.put("assetName",currentAssetEntity.getAssetName());
//        params.put("progress",currentAssetEntity.getProgress());
//        params.put("finalizeStatus",currentAssetEntity.getFinalizeStatus());
//        params.put("currentAssetDetailBean",currentAssetEntity.getCurrentAssetDetailEntities());
//
//        for (CurrentAssetDetailEntity currentAssetDetailEntity : currentAssetEntity.getCurrentAssetDetailEntities()) {
//            params.put("assetCode", currentAssetDetailEntity.getAssetCode());
//            params.put("acquisitionCost", currentAssetDetailEntity.getAcquisitionCost());
//            params.put("depreciation", currentAssetDetailEntity.getDepreciation());
//            params.put("bookValue", currentAssetDetailEntity.getBookValue());
//            params.put("amortizationWay", currentAssetDetailEntity.getAmortizationWay());
//            params.put("amortizationFinalYear", currentAssetDetailEntity.getAmortizationFinalYear());
//            params.put("acquisitionQuantity", currentAssetDetailEntity.getAcquisitionQuantity());
//            params.put("changeQuantity", currentAssetDetailEntity.getChangeQuantity());
//            params.put("remainQuantity", currentAssetDetailEntity.getRemainQuantity());
//            params.put("department", currentAssetDetailEntity.getDepartment());
//            params.put("usefulLife", currentAssetDetailEntity.getUsefulLife());
//            params.put("amortizationRate", currentAssetDetailEntity.getAmortizationRate());
//            params.put("month", currentAssetDetailEntity.getMonth());
//            params.put("normalAmortization", currentAssetDetailEntity.getNormalAmortization());
//            params.put("RAccumulatedAmortization", currentAssetDetailEntity.getRAccumulatedAmortization());
//            params.put("accumulatedAmortization", currentAssetDetailEntity.getAccumulatedAmortization());
//            params.put("bookValueEnd", currentAssetDetailEntity.getBookValueEnd());
//        }
        currentAssetDAO.insertAsset(currentAssetEntity);
//        currentAssetRepository.save(currentAssetEntity);
    }

    // 고정자산 수정
    @Override
    public void updateAsset(CurrentAssetReqDTO currentAssetReqDTO) throws Exception {

        CurrentAssetEntity currentAssetEntity = currentAssetReqMapStruct.toEntity(currentAssetReqDTO);
        currentAssetDAO.updateAsset(currentAssetEntity);
    }

    // 고정자산 삭제
    @Override
    public void deleteAsset(String assetCode) throws Exception {

        currentAssetDAO.deleteAsset(assetCode);
    }
}

