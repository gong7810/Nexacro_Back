package kr.co.seoulit.erp.account.statement.retainedEarningsStatement.service;

import kr.co.seoulit.erp.account.statement.retainedEarningsStatement.dao.RetainedEarningsStatementMapper;
import kr.co.seoulit.erp.account.statement.retainedEarningsStatement.to.RetainedEarningsStatementBean;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

    @Service
    @RequiredArgsConstructor
    public class RetainedEarningsStatementServiceImpl implements RetainedEarningsStatementService {

        @Autowired
        private RetainedEarningsStatementMapper retainedEarningsStatementDAO;

        //기간별원가명세서 조회

        @Override
        public ArrayList<RetainedEarningsStatementBean> findRetainedEarningsStatement(HashMap<String, Object> params) {

            System.out.println("이익잉여금처분계산서_ServiceImpl");
            System.out.println("selectedDate : " + params);

            ArrayList<RetainedEarningsStatementBean> retainedEarningsStatementList = retainedEarningsStatementDAO.selectRetainedEarningsStatement(params);
//        ArrayList<MonthCostStatementBean> result = (ArrayList<MonthCostStatementBean>) params.get("RESULT");

            System.out.println("result : " + retainedEarningsStatementList);

            return retainedEarningsStatementList;
        }
    }
