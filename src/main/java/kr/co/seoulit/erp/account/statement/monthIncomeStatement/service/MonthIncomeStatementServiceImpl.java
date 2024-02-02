package kr.co.seoulit.erp.account.statement.monthIncomeStatement.service;

import kr.co.seoulit.erp.account.statement.monthIncomeStatement.dao.MonthIncomeStatementMapper;
import kr.co.seoulit.erp.account.statement.monthIncomeStatement.to.MonthIncomeStatementBean;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class MonthIncomeStatementServiceImpl implements MonthIncomeStatementService {

    @Autowired
    private MonthIncomeStatementMapper monthIncomeStatementDAO;

    //기간별원가명세서 조회

    @Override
    public ArrayList<MonthIncomeStatementBean> findMonthIncomeStatement(HashMap<String, Object> params) {

        System.out.println("기간별손익계산서_ServiceImpl");
        System.out.println("selectedDate : " + params);

        ArrayList<MonthIncomeStatementBean> monthIncomeStatementList = monthIncomeStatementDAO.selectMonthIncomeStatement(params);
//        ArrayList<MonthCostStatementBean> result = (ArrayList<MonthCostStatementBean>) params.get("RESULT");

        System.out.println("result : " + monthIncomeStatementList);

        return monthIncomeStatementList;
    }
}
