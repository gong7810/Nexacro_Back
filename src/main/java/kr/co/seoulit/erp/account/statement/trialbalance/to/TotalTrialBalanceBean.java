package kr.co.seoulit.erp.account.statement.trialbalance.to;

import kr.co.seoulit.erp.account.sys.common.annotation.Dataset;
import lombok.Data;

@Data
@Dataset( name = "ds_totaltrialbalance1")
public class TotalTrialBalanceBean {

    private int lev;
    private String accountName;
    private String accountInnerCode;
    private long debitsSumBalance;
    private long debitsSum;
    private long creditsSum;
    private long creditsSumBalance;

}
