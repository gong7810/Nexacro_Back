package kr.co.seoulit.erp.account.operate.currentAsset.service;

import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetDetailResDTO;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetReqDTO;
import kr.co.seoulit.erp.account.operate.currentAsset.to.CurrentAssetResDTO;

import java.util.List;

public interface CurrentAssetService {

    // 고정자산 조회
    public List<CurrentAssetResDTO> findAssetList() throws Exception;

    // 고정자산 상세 조회
    public CurrentAssetResDTO findAssetDetail(String assetCode) throws Exception;

    // 고정자산 추가
    public void insertAsset(CurrentAssetReqDTO currentAssetReqDTO) throws Exception;

    // 고정자산 수정
    public void updateAsset(CurrentAssetReqDTO currentAssetReqDTO) throws Exception;

    // 고정자산 삭제
    public void deleteAsset(String assetCode) throws Exception;

    // 감가상각비현황 전체조회
    public List<CurrentAssetResDTO> findDepreciationList() throws Exception;

    // 감가상각비현황 선택조회
    public List<CurrentAssetResDTO> selectDepreciationList(String accountCode) throws Exception;

    // 고정자산관리대장 조회
    public List<CurrentAssetResDTO> findCurrentAssetLedgerList() throws Exception;

}
