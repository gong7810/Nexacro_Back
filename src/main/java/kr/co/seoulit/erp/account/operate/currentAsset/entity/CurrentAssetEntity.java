package kr.co.seoulit.erp.account.operate.currentAsset.entity;

import kr.co.seoulit.erp.account.sys.common.annotation.Dataset;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

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
}
