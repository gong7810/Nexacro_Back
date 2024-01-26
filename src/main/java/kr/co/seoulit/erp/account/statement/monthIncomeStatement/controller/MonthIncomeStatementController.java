package kr.co.seoulit.erp.account.statement.monthIncomeStatement.controller;


import com.nexacro.java.xapi.data.PlatformData;
import kr.co.seoulit.erp.account.statement.monthCostStatement.to.MonthCostStatementBean;
import kr.co.seoulit.erp.account.statement.monthIncomeStatement.service.MonthIncomeStatementService;
import kr.co.seoulit.erp.account.statement.monthIncomeStatement.to.MonthIncomeStatementBean;
import kr.co.seoulit.erp.account.sys.common.dao.DatasetToBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/acc/statement")
public class MonthIncomeStatementController {

    @Autowired
    private MonthIncomeStatementService monthIncomeStatementService;

    @Autowired
    private DatasetToBeanMapper datasetToBeanMapper;

    //월별손익계산서 조회
    @RequestMapping("/monthIncome")
    public void findMonthIncomeStatement(@RequestAttribute("reqData") PlatformData reqData,
                                       @RequestAttribute("resData")PlatformData resData) throws Exception {
        System.out.println("기간별손익계산서_Controller");
        String selectedDate=reqData.getVariable("selectedDate").getString(); // 받은 데이터 추출
        System.out.println("selectedDate : " + selectedDate);

        HashMap<String,Object> params = new HashMap<>();
        params.put("selectedDate",selectedDate); // 데이터를 map에 담음

        ArrayList<MonthIncomeStatementBean> monthIncomeStatementList = monthIncomeStatementService.findMonthIncomeStatement(params); // Facade 호출
        datasetToBeanMapper.beansToDataset(resData, monthIncomeStatementList, MonthIncomeStatementBean.class); // DTO -> Dataset


//        String selectedDate = reqData.getVariable("selectedDate").getString();
//        System.out.println("date : " + selectedDate);
//
//        ArrayList<MonthIncomeStatementBean> monthIncomeStatementList = monthIncomeStatementService.findMonthIncomeStatement(selectedDate);
//        datasetBeanMapper.beansToDataset(resData, monthIncomeStatementList, MonthIncomeStatementBean.class);
//        return null;
    }

//    @RequestMapping("/monthIncomeStatement")
//    public ArrayList<MonthIncomeStatementBean> monthIncomeStatement(@RequestAttribute("reqData") PlatformData reqData,
//                                                                    @RequestAttribute("resData") PlatformData resData) throws Exception {
//
//        String fromDate = reqData.getVariable("startDate").getString();
//        String toDate = reqData.getVariable("endDate").getString();
//
//        System.out.println("monthIncomeStatement_Controller" + "startDate : " + fromDate + "endDate : " + toDate);
//
//        ArrayList<MonthIncomeStatementBean> monthIncomeStatementList = monthIncomeStatementService.findMonthIncomeStatement(fromDate, toDate);
//        //datasetBeanMapper.beansToDataset(resData, monthIncomeStatementList, MonthIncomeStatementBean.class);
//        return null;
//    }
}
