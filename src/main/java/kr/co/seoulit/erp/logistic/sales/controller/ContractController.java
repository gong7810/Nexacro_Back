package kr.co.seoulit.erp.logistic.sales.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import kr.co.seoulit.erp.logistic.sales.to.*;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import kr.co.seoulit.erp.logistic.sales.servicefacade.SalesServiceFacade;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/logi/sales/*", produces = "application/json")

public class ContractController {

	@Autowired
	private SalesServiceFacade salesSF;

	// Gson 생성
	private static Gson gson = new GsonBuilder().serializeNulls().create();
	private ModelMap modelMap = new ModelMap();

	// ------------------- 수주조회
	@RequestMapping("/searchContract")
	public ModelMap searchContract(@RequestParam String customerCode, @RequestParam String searchCondition,
			@RequestParam String startDate, @RequestParam String endDate) {
		System.out.println("customerCode = " + customerCode);
		System.out.println("customerCode = " + startDate);
		System.out.println("customerCode = " + endDate);

		ArrayList<ContractInfoTO> contractInfoTOList = null;

		if (searchCondition.equals("searchByDate")) {

			contractInfoTOList = salesSF.getContractList(startDate, endDate);

		} else if (searchCondition.equals("searchByCustomer")) {

			contractInfoTOList = salesSF.getContractListByCustomer(customerCode);
		}

		modelMap.put("gridRowJson", contractInfoTOList);
		modelMap.put("errorCode", 1);
		modelMap.put("errorMsg", "성공");

		return modelMap;
	}

	@RequestMapping("/searchContractDetail")
	public ModelMap searchContractDetail(@RequestParam String contractNo) {
		System.out.println("controller -searchContractDetail() ");

		ArrayList<ContractDetailTO> contractDetailTOList = salesSF.getContractDetailList(contractNo);

		modelMap.put("gridRowJson", contractDetailTOList);
		modelMap.put("errorCode", 1);
		modelMap.put("errorMsg", "성공");

		return modelMap;
	}

	/* 수주가능한 견적 조회 */
	@RequestMapping("/searchEstimateInContractAvailable")
	public HashMap<String, Object> searchEstimateInContractAvailable(@RequestParam String startDate,
			@RequestParam String endDate) {
		ArrayList<EstimateTO> estimateListInContractAvailable = salesSF.getEstimateListInContractAvailable(startDate,
				endDate);
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("gridRowJson", estimateListInContractAvailable);
		resultMap.put("errorCode", 1);
		resultMap.put("errorMsg", "성공");

		return resultMap;
	}

	/* 수주등록 */
	@RequestMapping(value = "/addNewContract", method = RequestMethod.POST)
	public HashMap<String, Object> addNewContract(@RequestBody Map<String, Object> paramList) {
		HashMap<String, Object> map = new HashMap<>();
		JSONArray estimateDetailJson = JSONArray.fromObject(paramList.get("estimateDetail"));
		ArrayList<EstimateDetailTO> estimateDetailArray = new ArrayList<>();

		System.out.println("paramList = " + paramList);
		System.out.println("paramList = " + estimateDetailJson);
		System.out.println("paramList = " + paramList.get("estimateDetail"));
		System.out.println("estimateDetailJson = " + estimateDetailJson.get(0));


		String batchList = paramList.get("batchList").toString();
		String contractDate = paramList.get("contractDate").toString();
		String personCodeInCharge = paramList.get("personCodeInCharge").toString();
		for(int i=0; i<estimateDetailJson.size(); i++) {
			 String estimateDetail = estimateDetailJson.get(i).toString();
			 EstimateDetailTO estimateDetailTO = gson.fromJson(estimateDetail, EstimateDetailTO.class);
			 estimateDetailArray.add(estimateDetailTO);
		}
		ContractTO workingContractTO = gson.fromJson(batchList, ContractTO.class);
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap = salesSF.addNewContract(contractDate, personCodeInCharge, workingContractTO, estimateDetailArray);
		return resultMap;
		//return null;
	}

	@RequestMapping(value = "/cancelEstimate")
	public ModelMap cancleEstimate(@RequestParam("estimateNo") String estimateNo) {
		System.out.println("	@ params======>" + estimateNo);
		salesSF.changeContractStatusInEstimate(estimateNo, "N");
		modelMap.put("canceldEstimateNo", estimateNo);
		modelMap.put("errorCode", 1);
		modelMap.put("errorMsg", "성공");
		return modelMap;
	}
}