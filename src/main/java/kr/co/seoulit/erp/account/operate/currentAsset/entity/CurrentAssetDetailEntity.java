package kr.co.seoulit.erp.account.operate.currentAsset.entity;

import kr.co.seoulit.erp.account.sys.common.annotation.Dataset;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name="CURRENT_ASSET_DETAIL")
@Dataset(name="ds_assetDetail")
@Data
public class CurrentAssetDetailEntity {

    @Id
    private String assetCode;
    private String acquisitionCost;
    private String depreciation;
    private String bookValue;
    private String amortizationWay;
    private String amortizationFinalYear;
    private String usefulLife;
    private String amortizationRate;
    private String month;
    private String normalAmortization;
    private String RAccumulatedAmortization;
    private String accumulatedAmortization;
    private String bookValueEnd;

    private String acquisitionQuantity;
    private String changeQuantity;
    private String remainQuantity;
    private String department;

}
