package kr.co.seoulit.account.posting.ledger.dto;

import kr.co.seoulit.erp.sys.base.to.BaseBean;
import kr.co.seoulit.erp.sys.common.annotation.Dataset;
import lombok.*;

@Data
@Dataset(name="gds_customerLedger")
public class CustomerLedgerBean extends BaseBean {

    private int carryOver;
    private String customerCode;
    private String customerName;
    private int deposit;
    private int withdrawal;
    private int balance;
}
