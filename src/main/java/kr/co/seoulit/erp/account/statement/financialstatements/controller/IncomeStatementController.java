package kr.co.seoulit.erp.account.statement.financialstatements.controller;

import java.util.ArrayList;
import java.util.HashMap;


import kr.co.seoulit.erp.account.statement.financialstatements.service.FinancialStatementsService;
import kr.co.seoulit.erp.account.statement.financialstatements.to.IncomeStatementBean;
import kr.co.seoulit.erp.account.sys.base.service.BaseService;
import kr.co.seoulit.erp.account.sys.common.dao.DatasetToBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexacro.java.xapi.data.PlatformData;


@RestController
@RequestMapping("/settlement")
public class IncomeStatementController  {

	@Autowired
	private FinancialStatementsService financialStatementsService;
	@Autowired
	private DatasetToBeanMapper datasetToBeanMapper;
	@Autowired
	private BaseService baseService;

	//손익계산서 조회
	@RequestMapping("/incomestatement")
    public HashMap<String, Object> handleRequestInternal(@RequestAttribute("reqData") PlatformData reqData,
														 @RequestAttribute("resData") PlatformData resData) throws Exception {
		String accountPeriodNo=reqData.getVariable("period").getString();
		String callResult=reqData.getVariable("callresult").getString();

		HashMap<String, Object> params = new HashMap<>();
		params.put("accountPeriodNo",accountPeriodNo);
		params.put("callResult",callResult);

		financialStatementsService.findIncomeStatement(params);

			ArrayList<IncomeStatementBean> bean = (ArrayList<IncomeStatementBean>) params.get("incomeStatement");
			  datasetToBeanMapper.beansToDataset(resData, bean, IncomeStatementBean.class);
        return null;
    }

	@RequestMapping("/selectincomestatement")
    public HashMap<String, Object> Selectincomestatement( @RequestAttribute("reqData") PlatformData reqData,
			@RequestAttribute("resData") PlatformData resData) throws Exception {
		String date=reqData.getVariable("date").getString();
		String callResult=reqData.getVariable("callresult").getString();

		 //date로 값받아올때 ex) 20170717 이런식으로 받아와서 -> 2017-07-17 이런식으로 값을 바꿔줌
		String year = date.substring(0, 4);
		String month = date.substring(4, 6);
		String day = date.substring(5, 7);

		String ddate = year +"-"+month+"-"+day;

		String accountPeriodNo = baseService.findPeriodNo(ddate);

		HashMap<String, Object> params = new HashMap<>();
		params.put("accountPeriodNo",accountPeriodNo);
		params.put("callResult",callResult);

		financialStatementsService.findIncomeStatement(params);

			ArrayList<IncomeStatementBean> bean = (ArrayList<IncomeStatementBean>) params.get("incomeStatement");
			  datasetToBeanMapper.beansToDataset(resData, bean, IncomeStatementBean.class);
        return null;
    }

}


