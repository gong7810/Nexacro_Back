package kr.co.seoulit.erp.account.operate.currentAsset.entity;

import kr.co.seoulit.erp.account.sys.common.annotation.Dataset;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name="CURRENT_ASSET")
@Dataset(name="ds_asset")
@Data
public class CurrentAssetEntity {

    private String accountName;
    @Id
    private String assetCode;
    private String accountCode;
    private String assetName;
    private String progress;
    private String finalizeStatus;
//    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name="assetCode")
//    private List<CurrentAssetDetailEntity> currentAssetDetailEntities;

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
