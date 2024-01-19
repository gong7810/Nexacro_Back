package kr.co.seoulit.erp.account.operate.currentAsset.to;

import kr.co.seoulit.erp.account.sys.common.annotation.Dataset;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Dataset(name="ds_assetDetail")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CurrentAssetDetailReqDTO {

    private String assetCode;
    private String acquisitionCost;
    private String amortizationWay;
    private String department;
    private String depreciation;
    private String bookValue;

    private String usefulLife;
    private String amortizationFinalYear;

    private String acquisitionQuantity;
    private String changeQuantity;
    private String remainQuantity;

    private String amortizationRate;
    private String month;
    private String normalAmortization;
    private String accumulatedAmortization;
    private String bookValueEnd;


    private String RAccumulatedAmortization;



}
