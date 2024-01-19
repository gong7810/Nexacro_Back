package kr.co.seoulit.erp.account.operate.currentAsset.dao;

import kr.co.seoulit.erp.account.operate.currentAsset.entity.CurrentAssetDetailEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CurrentAssetDetailDAO {

    // 고정자산상세 추가
    void insertAssetDetail(CurrentAssetDetailEntity currentAssetDetailEntity) throws Exception;

    // 고정자산상세 수정
    void updateAssetDetail(CurrentAssetDetailEntity currentAssetDetailEntity) throws Exception;

    // 고정자산상세 삭제
    void deleteAssetDetail(String assetCode)throws Exception;
}
