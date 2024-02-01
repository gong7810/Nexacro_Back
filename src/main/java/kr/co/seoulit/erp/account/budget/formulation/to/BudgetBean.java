package kr.co.seoulit.erp.account.budget.formulation.to;

import kr.co.seoulit.erp.account.budget.formulation.entity.BudgetEntity;
import kr.co.seoulit.erp.account.sys.base.to.BaseBean;
import kr.co.seoulit.erp.account.sys.common.annotation.Dataset;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;

@Data
@EqualsAndHashCode(callSuper=false)
@Dataset(name = "ds_budget1")
public class BudgetBean extends BaseBean {

	private String deptCode;
	private String workplaceCode;
	private String accountInnerCode;
	private String accountPeriodNo;
	private String budgetingCode;
	private int m1Budget;
	private int m2Budget;
	private int m3Budget;
	private int m4Budget;
	private int m5Budget;
	private int m6Budget;
	private int m7Budget;
	private int m8Budget;
	private int m9Budget;
	private int m10Budget;
	private int m11Budget;
	private int m12Budget;

}
