package kr.co.seoulit.erp.account.operate.currentAsset.service;

import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetDetailReqDTO;

public interface CurrentAssetDetailService {

    // 고정자산상세 추가
    public void insertAssetDetail(CurrentAssetDetailReqDTO currentAssetDetailReqDTO)throws Exception;

}
