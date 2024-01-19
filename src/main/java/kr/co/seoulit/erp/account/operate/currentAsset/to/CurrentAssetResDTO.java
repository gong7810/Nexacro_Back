package kr.co.seoulit.erp.account.operate.currentAsset.to;

import kr.co.seoulit.erp.account.sys.base.to.BaseBean;
import kr.co.seoulit.erp.account.sys.common.annotation.Dataset;
import lombok.*;

import javax.persistence.Transient;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Dataset(name="ds_asset")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CurrentAssetResDTO extends BaseBean {

    private String accountName;
    private String assetCode;
    private String accountCode;
    private String assetName;
    private String progress;
    private String finalizeStatus;
//    private List<CurrentAssetDetailResDTO> currentAssetDetailResDTOList;

    @Transient
    private String acquisitionCost;
    @Transient
    private String depreciation;
    @Transient
    private String bookValue;
    @Transient
    private String normalAmortization;
    @Transient
    private String accumulatedAmortization;
    @Transient
    private String bookValueEnd;
    @Transient
    private String acquisitionQuantity;
    @Transient
    private String changeQuantity;
    @Transient
    private String remainQuantity;
}
