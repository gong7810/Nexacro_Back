package kr.co.seoulit.erp.account.operate.currentAsset.to;

import kr.co.seoulit.erp.account.sys.base.to.BaseBean;
import kr.co.seoulit.erp.account.sys.common.annotation.Dataset;
import lombok.*;


@EqualsAndHashCode(callSuper = false)
@Dataset(name="ds_asset")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CurrentAssetReqDTO extends BaseBean {

    private String accountName;
    private String assetCode;
    private String accountCode;
    private String assetName;
    private String progress;
    private String finalizeStatus;

//    @Transient
//    private String acquisitionCost;
//    @Transient
//    private String depreciation;
//    @Transient
//    private String bookValue;
//    @Transient
//    private String normalAmortization;
//    @Transient
//    private String accumulatedAmortization;
//    @Transient
//    private String bookValueEnd;
//    @Transient
//    private String acquisitionQuantity;
//    @Transient
//    private String changeQuantity;
//    @Transient
//    private String remainQuantity;
}
