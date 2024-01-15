package kr.co.seoulit.account.posting.ledger.dto;


import kr.co.seoulit.erp.sys.base.to.BaseBean;
import kr.co.seoulit.erp.sys.common.annotation.Dataset;
import lombok.*;

@Data
@Dataset(name="gds_customerLedger_detail")
public class CustomerLedgerDetailResDto extends BaseBean {

    private String reportingDate;
    private String accountName;
    private int leftDebtorPrice;
    private int rightCreditsPrice;
}
