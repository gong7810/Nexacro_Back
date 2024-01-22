package kr.co.seoulit.erp.account.operate.currentAsset.dao;

import kr.co.seoulit.erp.account.operate.currentAsset.entity.CurrentAssetEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CurrentAssetDAO {

	// 고정자산 조회
	List<CurrentAssetEntity> findAssetList()throws Exception;

	// 고정자산 상세조회
	CurrentAssetEntity findAssetDetail(String assetCode)throws Exception;

	// 고정자산 추가
	void insertAsset(CurrentAssetEntity currentAssetEntity) throws Exception;

	// 고정자산 수정
	void updateAsset(CurrentAssetEntity currentAssetEntity) throws Exception;

	// 고정자산 삭제
	void deleteAsset(String assetCode)throws Exception;
}
