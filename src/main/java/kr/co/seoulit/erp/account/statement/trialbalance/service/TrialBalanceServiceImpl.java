package kr.co.seoulit.erp.account.statement.trialbalance.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.account.statement.trialbalance.to.DetailTrialBalanceBean;
import kr.co.seoulit.erp.account.statement.trialbalance.to.TotalTrialBalanceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.seoulit.erp.account.statement.trialbalance.dao.TotalTrialBalanceMapper;

@Service
@Transactional
public class TrialBalanceServiceImpl implements TrialBalanceService{

	@Autowired
    private TotalTrialBalanceMapper totalTrialBalanceDAO;


//	@Override
//	public ArrayList<TotalTrialBalanceBean> findEarlyStatements(HashMap<String,Object> params) {
//
//		System.out.println("결산전_ServiceImpl");
//		System.out.println("accountPeriodNo : " + params);
//		System.out.println("callResult : " + params);
//
//		ArrayList<TotalTrialBalanceBean> totalTrialBalanceList = totalTrialBalanceDAO.selectcallEarlyStatements(params);
//
//		System.out.println("result : " + totalTrialBalanceList);
//
//		return totalTrialBalanceList;
//	}

    @Override
    public HashMap<String, Object> findTotalTrialBalance(HashMap<String,Object> params) {

		System.out.println("합계잔액시산표_ServiceImpl");
		System.out.println("accountPeriodNo : " + params);
		System.out.println("callResult : " + params);

		HashMap<String, Object> totalTrialBalance = totalTrialBalanceDAO.selectcallTotalTrialBalance(params);

		return totalTrialBalance;
    }

//    @Override
//	public HashMap<String, Object> findchangeAccountingSettlement(String accountPeriodNo, String callResult) {
//
//        	HashMap<String, String> map = new HashMap<>();
//        	map.put("accountPeriodNo", accountPeriodNo);
//        	map.put("callResult", callResult);
//        	return totalTrialBalanceDAO.selectAccountingSettlement(map);
//    }

	//일(월)계표 조회
    @Override
//	public HashMap<String, Object> findDetailTrialBalance(HashMap<String, Object> params) {
//
//		HashMap<String, Object> detailTrialBalance = null;
//		detailTrialBalance = totalTrialBalanceDAO.selectDetailTrialBalance(params);
//	        return detailTrialBalance;
//
//    }
	public List<DetailTrialBalanceBean> findDetailTrialBalance(HashMap<String, Object> params) {

		List<DetailTrialBalanceBean> detailTrialBalance = null;
		detailTrialBalance = totalTrialBalanceDAO.selectDetailTrialBalance(params);
		return detailTrialBalance;

	}
}
