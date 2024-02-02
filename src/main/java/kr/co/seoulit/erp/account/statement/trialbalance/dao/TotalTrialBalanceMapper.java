package kr.co.seoulit.erp.account.statement.trialbalance.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.account.statement.trialbalance.to.DetailTrialBalanceBean;
import kr.co.seoulit.erp.account.statement.trialbalance.to.TotalTrialBalanceBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TotalTrialBalanceMapper {

    public HashMap<String, Object> selectcallTotalTrialBalance(HashMap<String,Object> params);

//    public ArrayList<TotalTrialBalanceBean> selectcallEarlyStatements(HashMap<String,Object> params);

    public HashMap<String, Object> selectAccountingSettlement(HashMap<String, String> map);

    //일(월)계표 조회
    List<DetailTrialBalanceBean> selectDetailTrialBalance(HashMap<String, Object> params);
}
