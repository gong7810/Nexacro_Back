package kr.co.seoulit.account.operate.humanresource.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.seoulit.erp.sys.base.mapper.DetailCodeMapper;

import kr.co.seoulit.account.operate.humanresource.mapper.EmployeeMapper;
import kr.co.seoulit.account.operate.humanresource.mapper.UserAuthorityGroupMapper;
import kr.co.seoulit.account.operate.humanresource.repository.EmployeeRepository;
import kr.co.seoulit.account.operate.humanresource.to.DepartmentBean;
import kr.co.seoulit.account.operate.humanresource.to.EmployeeEntity;

@Service
@Transactional
public class HumanResourceServiceImpl implements HumanResourceService {
    

    private EmployeeMapper employeeDAO;

	private DetailCodeMapper codeDetailDAO;

    private UserAuthorityGroupMapper usrePermissionGroupDAO;

	private EmployeeRepository employeeRepository;

    @Autowired
    public HumanResourceServiceImpl(EmployeeMapper employeeDAO,
                                    DetailCodeMapper codeDetailDAO,
                                    UserAuthorityGroupMapper usrePermissionGroupDAO,
                                    EmployeeRepository employeeRepository) {
        this.employeeDAO = employeeDAO;
        this.codeDetailDAO = codeDetailDAO;
        this.usrePermissionGroupDAO = usrePermissionGroupDAO;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void registerEmployee(EmployeeEntity employeeEntity)throws Exception{

        employeeRepository.save(employeeEntity);

    }

    @Override
    public ArrayList<EmployeeEntity> findEmployeeList() throws Exception{

        return (ArrayList<EmployeeEntity>) employeeRepository.findAll();

    }

    @Override
    public void removeEmployee(String empCode) throws Exception{

       employeeRepository.deleteById(empCode);

    }

    @Override
    public void modifyEmployee(EmployeeEntity employeeEntity)throws Exception{

        employeeRepository.save(employeeEntity);

    }







                                        // 아래는 운영관리에서 아직 사용하지 않는 코드들이다.




    //이거는 사용할지도
    @Override
    public void saveEmpImg(HashMap<String,String> map) {

    	employeeDAO.saveImage(map);
    }











	@Override
	public ArrayList<DepartmentBean> findDeptList() {
		// TODO Auto-generated method stub
		
        ArrayList<DepartmentBean> deptList=null;
        deptList=usrePermissionGroupDAO.selectDeptList();
        
        return deptList;
	}

	@Override
	public ArrayList<DepartmentBean> selectworkplaceCode() {
		// TODO Auto-generated method stub
		
        ArrayList<DepartmentBean> workplaceList=null;
        workplaceList=usrePermissionGroupDAO.selectworkplaceCode();
        
        return workplaceList;
	}
	
	@Override
	public ArrayList<DepartmentBean> selectdeptCode(String code) {
		// TODO Auto-generated method stub
		
		ArrayList<DepartmentBean> deptList=null;
		deptList=usrePermissionGroupDAO.selectdeptCode(code);
		
		return deptList;
	}

	
	
//

	@Override
	public void modifyImage(String newFileName) {

			employeeDAO.updateImage(newFileName);
            
    }

	@Override
	public EmployeeEntity findImage(String EMP_CODE) {
		// TODO Auto-generated method stub

		  EmployeeEntity admin = null;
		  admin = employeeDAO.selectImage(EMP_CODE);
	           	
		return admin;
	}




    //
//    @Override
//    public ArrayList<EmployeeEntity> findEmployeeList(String deptCode) {
//
//
//        ArrayList<EmployeeEntity> empList = null;
//        empList = employeeDAO.selectEmployeeList(deptCode);
//
//        return empList;
//    }
//
//
//    @Override
//    public void batchEmployeeInfo(EmployeeEntity employeeEntity) {
//
//        	employeeDAO.updateEmployeeInfo(employeeEntity);
//    }
//





    //    @Override
//    public void batchEmployee(ArrayList<EmployeeEntity> empList) {
//
//        	for (EmployeeEntity employBean : empList) {
//                String empStatus = employBean.getStatus();
//                switch (empStatus) {
//                    case "update":
//                        modifyEmployee(employBean);
//                        break;
//                    case "delete":
//                    //    removeEmployee(employBean);
//                        break;
//                }
//            }
//            for (int a = 0; a < empList.size(); a++) {
//                System.out.println(empList.get(a).getEmpName());
//            }
//
//    }
//
//    private void modifyEmployee(EmployeeEntity employeeEntity) {
//
//
//            employeeDAO.updateEmployee(employeeEntity);
//            String empCode = employeeEntity.getEmpCode();
//            String empName = employeeEntity.getEmpName();
//            DetailCodeEntity detailCodeEntity = new DetailCodeEntity();
//            detailCodeEntity.setDivisionCodeNo("HR-02");
//            detailCodeEntity.setDetailCode(empCode);
//            detailCodeEntity.setDetailCodeName(empName);
//            codeDetailDAO.updateDetailCode(detailCodeEntity);
//
//    }








    //    @Override
//    public void registerEmployee(EmployeeEntity employeeEntity) {
//
//
//        	employeeDAO.insertEmployee(employeeEntity);
//            String empCode = employeeEntity.getEmpCode();
//            String empName = employeeEntity.getEmpName();
//            DetailCodeEntity detailCodeEntity = new DetailCodeEntity();
//            detailCodeEntity.setDivisionCodeNo("HR-02");
//            detailCodeEntity.setDetailCode(empCode);
//            detailCodeEntity.setDetailCodeName(empName);
//            codeDetailDAO.insertDetailCode(detailCodeEntity);
//
//    }



//    @Override
//    public EmployeeEntity findEmployee(String empCode) {
//
//
//        EmployeeEntity employeeEntity = null;
//        employeeEntity = employeeDAO.selectEmployee(empCode);
//
//        return employeeEntity;
//    }






    //   @Override
//	public ArrayList<DepartmentBean> findDeptList2() {
//		// TODO Auto-generated method stub
//
//		        ArrayList<DepartmentBean> deptList=null;
//		        deptList=usrePermissionGroupDAO.selectDeptList2();
//
//		        return deptList;
//	}



		
	}


