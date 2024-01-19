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

        currentAssetDAO.insertAsset(currentAssetEntity);
//        currentAssetRepository.save(currentAssetEntity);
        System.out.println("고정자산 등록완료");
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

