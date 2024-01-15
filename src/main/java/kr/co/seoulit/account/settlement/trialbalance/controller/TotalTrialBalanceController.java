package kr.co.seoulit.account.settlement.trialbalance.controller;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexacro.java.xapi.data.PlatformData;

import kr.co.seoulit.account.settlement.trialbalance.service.TrialBalanceService;
import kr.co.seoulit.account.settlement.trialbalance.to.TotalTrialBalanceBean;
import kr.co.seoulit.erp.sys.base.service.BaseService;
import kr.co.seoulit.erp.sys.common.mapper.DatasetToBeanMapper;

@RestController
@RequestMapping("/settlement")
@AllArgsConstructor
public class TotalTrialBalanceController {

	private final TrialBalanceService trialBalanceService;

	private final DatasetToBeanMapper datasetToBeanMapper;

	private final BaseService baseService;


//	@Autowired
//	private TrialBalanceService trialBalanceService;
//	@Autowired
//	private DatasetBeanMapper datasetBeanMapper;
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
	@RequestMapping("/totaltrialbalance")
	public HashMap<String,Object> findTotalTrialBalance( @RequestAttribute("reqData") PlatformData reqData,
			@RequestAttribute("resData") PlatformData resData) throws Exception {

		String accountPeriodNo=reqData.getVariable("accountPeriodNo").getString();
		String callResult=reqData.getVariable("callresult").getString();

		HashMap<String,Object> params = new HashMap<>();
		params.put("accountPeriodNo",accountPeriodNo);
		params.put("callResult",callResult);
		//TotalTrialBalanceBean bean=(TotalTrialBalanceBean)trialBalanceService.findTotalTrialBalance(params).get("totalTrialBalanceResult");
		trialBalanceService.findTotalTrialBalance(params);
		System.out.println("@@@@@@@@@@@@@@@"+params);
		ArrayList<TotalTrialBalanceBean>  bean = (ArrayList<TotalTrialBalanceBean>) params.get("totalTrialBalance");
	  	datasetToBeanMapper.beansToDataset(resData, bean, TotalTrialBalanceBean.class);


        return null;

	}

	@RequestMapping("/selecttotaltrialbalance")
	public HashMap<String,Object> SelectTotalTrialBalance( @RequestAttribute("reqData") PlatformData reqData,
			@RequestAttribute("resData") PlatformData resData) throws Exception {

		String accountPeriodNo=reqData.getVariable("accountPeriodNo").getString();
		String callResult=reqData.getVariable("callresult").getString();


		//String accountPeriodNo = baseService.findPeriodNo(year);

		HashMap<String,Object> params = new HashMap<>();
		params.put("accountPeriodNo",accountPeriodNo);
		params.put("callResult",callResult);
		//TotalTrialBalanceBean bean=(TotalTrialBalanceBean)trialBalanceService.findTotalTrialBalance(params).get("totalTrialBalanceResult");
		trialBalanceService.findEarlyStatements(params);
		System.out.println("@@@@@@@@@@@@@@@"+params);
		ArrayList<TotalTrialBalanceBean>  bean = (ArrayList<TotalTrialBalanceBean>) params.get("totalTrialBalance");
	    datasetToBeanMapper.beansToDataset(resData, bean, TotalTrialBalanceBean.class);


        return null;

	}
//	@PostMapping("/totaltrialbalancecancle")
//	public void findcancelClosing(@RequestParam String accountPeriodNo,
//										  @RequestParam String callResult) {
//
//		trialBalanceService.findchangeAccountingSettlement(accountPeriodNo, callResult);
//	}

}
