package kr.co.seoulit.erp.account.statement.monthIncomeStatement.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MonthIncomeStatementMapper {

    //월별손익계산서 조회
    public HashMap<String, Object>  selectMonthIncomeStatement(HashMap<String,Object> params);
}
