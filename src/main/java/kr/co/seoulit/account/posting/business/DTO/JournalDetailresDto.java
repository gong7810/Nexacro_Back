package kr.co.seoulit.account.posting.business.DTO;

import kr.co.seoulit.account.sys.base.to.BaseBean;
import kr.co.seoulit.account.sys.common.annotation.Dataset;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Dataset(name = "gds_journalDetail")
@Getter
@Setter
public class JournalDetailresDto extends BaseBean {
    private String journalDetailNo;
    private String journalNo;
    private String accountControlCode;
    @Column(name = "DESCRIPTION")
    private String journalDescription;
    private String accountControlDescription;
    private String accountControlName;
    private String accountControlType; //일괄처리를 위한 상태값
}
