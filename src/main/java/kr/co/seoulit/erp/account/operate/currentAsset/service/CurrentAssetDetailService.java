package kr.co.seoulit.erp.account.operate.currentAsset.service;

import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetDetailReqDTO;

public interface CurrentAssetDetailService {

    // 고정자산상세 추가
    public void insertAssetDetail(CurrentAssetDetailReqDTO currentAssetDetailReqDTO)throws Exception;

    // 고정자산상세 수정
    public void updateAssetDetail(CurrentAssetDetailReqDTO currentAssetDetailReqDTO)throws Exception;

    // 고정자산상세 삭제
    public void deleteAssetDetail(String assetCode)throws Exception;
}
