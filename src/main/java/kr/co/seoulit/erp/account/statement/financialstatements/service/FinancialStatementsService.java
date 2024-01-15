package kr.co.seoulit.erp.account.statement.financialstatements.service;

import java.util.HashMap;

public interface FinancialStatementsService {

	public HashMap<String, Object> findFinancialPosition(HashMap<String, Object> params);

	public HashMap<String, Object> findIncomeStatement(HashMap<String, Object> params);
}
