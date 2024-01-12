package kr.co.seoulit.account.posting.ledger.mapper;


import kr.co.seoulit.account.posting.ledger.dto.CustomerLedgerBean;
import kr.co.seoulit.account.posting.ledger.dto.CustomerLedgerDetailResDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface CustomerLedgerMapper {

   public ArrayList<CustomerLedgerBean> selectCustomerLedgerList(@Param("fromDate") String fromDate,@Param("toDate") String toDate);

   public ArrayList<CustomerLedgerDetailResDto> selectCustomerLedgerDetailList(String customerCode);
}
