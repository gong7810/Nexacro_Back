package kr.co.seoulit.erp.account.statement.trialbalance.to;

import kr.co.seoulit.erp.account.sys.common.annotation.Dataset;
import lombok.Data;

@Data
@Dataset( name = "ds_totaltrialbalance1")
public class TotalTrialBalanceBean {

    private long debitsSumBalance;
    private long debitsSum;
    private String accountName;
    private long creditsSum;
    private long creditsSumBalance;
    private int lev;
    private int code;

}
