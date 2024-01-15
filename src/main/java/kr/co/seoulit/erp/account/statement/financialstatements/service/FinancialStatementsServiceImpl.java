package kr.co.seoulit.erp.account.statement.financialstatements.service;

import java.util.HashMap;

import kr.co.seoulit.erp.account.statement.financialstatements.dao.FinancialPositionMapper;
import kr.co.seoulit.erp.account.statement.financialstatements.dao.IncomeStatementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialStatementsServiceImpl implements FinancialStatementsService{
    
	@Autowired
    private FinancialPositionMapper financialPositionDAO;
	@Autowired
    private IncomeStatementMapper incomeStatementDAO;

    @Override
    public HashMap<String, Object> findFinancialPosition(HashMap<String,Object> params) {
    	HashMap<String, Object>  financialPosition = financialPositionDAO.selectcallFinancialPosition(params);

        return financialPosition;
    }

    
    @Override
    public HashMap<String, Object> findIncomeStatement(HashMap<String, Object> param) {

        	HashMap<String, Object> incomeledgerList = null;
        	incomeledgerList = incomeStatementDAO.selectcallIncomeStatement(param);
        	System.out.println(incomeledgerList+"@@@@@@@@@@@@@@@@@@@@@@");
            
        return incomeledgerList;
    }
}
