package kr.co.seoulit.erp.account.operate.currentAsset.service;

import kr.co.seoulit.erp.account.operate.currentAsset.dao.CurrentAssetDetailDAO;
import kr.co.seoulit.erp.account.operate.currentAsset.entity.CurrentAssetDetailEntity;
import kr.co.seoulit.erp.account.operate.currentAsset.mapstruct.CurrentAssetDetailReqMapStruct;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetDetailReqDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CurrentAssetDetailServiceImpl implements CurrentAssetDetailService{

    @Autowired
    private CurrentAssetDetailDAO currentAssetDetailDAO;
    @Autowired
    private CurrentAssetDetailReqMapStruct currentAssetDetailReqMapStruct;

    // 고정자산상세 추가
    @Override
    public void insertAssetDetail(CurrentAssetDetailReqDTO currentAssetDetailReqDTO) throws Exception {
        CurrentAssetDetailEntity currentAssetDetailEntity = currentAssetDetailReqMapStruct.toEntity(currentAssetDetailReqDTO);
        currentAssetDetailDAO.insertAssetDetail(currentAssetDetailEntity);
        System.out.println("고정자산상세 등록완료");
    }
}
