package kr.co.seoulit.account.posting.ledger.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import kr.co.seoulit.account.posting.ledger.dto.CashJournalBean;

@Mapper
public interface AuxiliaryLedgerMapper {

	//현금출납장 조회
	public ArrayList<CashJournalBean> selectCashJournalList(HashMap<String, String> map);

	public ArrayList<CashJournalBean> selectTotalCashJournalList(HashMap<String, String> map);
}
