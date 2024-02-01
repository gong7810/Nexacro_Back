package kr.co.seoulit.erp.account.statement.trialbalance.controller;

import java.util.ArrayList;
import java.util.HashMap;

import kr.co.seoulit.erp.account.statement.financialstatements.to.FinancialPositionBean;
import kr.co.seoulit.erp.account.sys.base.service.BaseService;
import kr.co.seoulit.erp.account.sys.common.dao.DatasetToBeanMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexacro.java.xapi.data.PlatformData;

import kr.co.seoulit.erp.account.statement.trialbalance.service.TrialBalanceService;
import kr.co.seoulit.erp.account.statement.trialbalance.to.TotalTrialBalanceBean;

@RestController
@RequestMapping("/acc/statement")
@AllArgsConstructor
public class TotalTrialBalanceController {

	private final TrialBalanceService trialBalanceService;

	private final DatasetToBeanMapper datasetToBeanMapper;

	private final BaseService baseService;


//	@Autowired
//	private TrialBalanceService trialBalanceService;
//	@Autowired
//	private DatasetToBeanMapper datasetBeanMapper;
//	@Autowired
//	private BaseService baseService;


//	@PostMapping("/totaltrialbalance")
//	public HashMap<String, Object> finddoClosing(@RequestParam String accountPeriodNo,
//			                                     @RequestParam String callResult) {
//
//		HashMap<String,Object> params = new HashMap<>();
//		params.put("accountPeriodNo",accountPeriodNo);
//		params.put("callResult",callResult);
//
//
//             HashMap<String, Object> closingResult = trialBalanceService.findEarlyStatements(params);
//
//           return closingResult;
//	}

	//@GetMapping("/totaltrialbalance/{accountPeriodNo}")

//	@RequestMapping("/selecttotaltrialbalance")
//	public void findEarlyStatements( @RequestAttribute("reqData") PlatformData reqData,
//									 @RequestAttribute("resData") PlatformData resData) throws Exception {
//
//		String accountPeriodNo=reqData.getVariable("accountPeriodNo").getString();
//		String callResult=reqData.getVariable("callresult").getString();
//
//
//		System.out.println("나옴?");
//
//		HashMap<String,Object> params = new HashMap<>();
//		params.put("accountPeriodNo",accountPeriodNo);
//		params.put("callResult",callResult);
//
//		System.out.println("@@@@@@@@@@@@@@@"+params);
//		ArrayList<TotalTrialBalanceBean> totalTrialBalanceList  = trialBalanceService.findTotalTrialBalance(params);
//		datasetToBeanMapper.beansToDataset(resData, totalTrialBalanceList, TotalTrialBalanceBean.class);
//	}

	@RequestMapping("/totaltrialbalance")
	public void findTotalTrialBalance(@RequestAttribute("reqData") PlatformData reqData,
									  @RequestAttribute("resData") PlatformData resData) throws Exception {

		String accountPeriodNo = reqData.getVariable("period").getString();
		String callResult = reqData.getVariable("callresult").getString();

		System.out.println(accountPeriodNo);
		System.out.println(callResult);

		HashMap<String, Object> params = new HashMap<>();
		params.put("accountPeriodNo", accountPeriodNo);
		params.put("callResult", callResult);

		trialBalanceService.findTotalTrialBalance(params);
		//TotalTrialBalanceBean bean=(TotalTrialBalanceBean)trialBalanceService.findTotalTrialBalance(params).get("totalTrialBalanceResult");

		ArrayList<TotalTrialBalanceBean> bean = (ArrayList<TotalTrialBalanceBean>) params.get("totalTrialBalance");
		datasetToBeanMapper.beansToDataset(resData, bean, TotalTrialBalanceBean.class);

	}

	@RequestMapping("/selecttotaltrialbalance")
	public HashMap<String, Object> Selecttotaltrialbalance(@RequestAttribute("reqData") PlatformData reqData,
														   @RequestAttribute("resData") PlatformData resData) throws Exception {

		String date = reqData.getVariable("date").getString();
		String callResult = reqData.getVariable("callresult").getString();

		// date로 값받아올때 ex) 20170717 이런식으로 받아와서 -> 2017-07-17 이런식으로 값을 바꿔줌
		String year = date.substring(0, 4);
		String month = date.substring(4, 6);
		String day = date.substring(5, 7);

		String ddate = year + "-" + month + "-" + day;

		String accountPeriodNo = baseService.findPeriodNo(ddate);

		HashMap<String, Object> params = new HashMap<>();
		params.put("accountPeriodNo", accountPeriodNo); // 회계년도 번호 구하는 로직
		params.put("callResult", callResult);
		//TotalTrialBalanceBean bean=(TotalTrialBalanceBean)trialBalanceService.findTotalTrialBalance(params).get("totalTrialBalanceResult");
		trialBalanceService.findTotalTrialBalance(params);
		System.out.println("@@@@@@@@@@@@@@@" + params);
		ArrayList<TotalTrialBalanceBean> bean = (ArrayList<TotalTrialBalanceBean>) params.get("totalTrialBalance");
		datasetToBeanMapper.beansToDataset(resData, bean, TotalTrialBalanceBean.class);

		return null;


//	@PostMapping("/totaltrialbalancecancle")
//	public void findcancelClosing(@RequestParam String accountPeriodNo,
//										  @RequestParam String callResult) {
//
//		trialBalanceService.findchangeAccountingSettlement(accountPeriodNo, callResult);
//	}

	}
}