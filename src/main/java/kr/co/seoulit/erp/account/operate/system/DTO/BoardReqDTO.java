package kr.co.seoulit.erp.account.operate.system.DTO;

import kr.co.seoulit.erp.sys.base.to.BaseBean;
import kr.co.seoulit.erp.sys.common.annotation.Dataset;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@Dataset(name="ds_board")
@NoArgsConstructor
@AllArgsConstructor

//toString은 테스트를 클래스에서 값을 받기 위해서 입니다.
@ToString
public class BoardReqDTO extends BaseBean {

    private String id;
    private String title;
    private String contents;
    private String writtenBy;
    private Date writeDate;
    private Date updateDateTime;

}