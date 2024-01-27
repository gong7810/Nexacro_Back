package kr.co.seoulit.erp.account.operate.humanresource.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nexacro.java.xapi.data.PlatformData;

import kr.co.seoulit.erp.account.operate.humanresource.service.HumanResourceService;

import kr.co.seoulit.erp.account.operate.humanresource.to.DepartmentBean;
import kr.co.seoulit.erp.account.operate.humanresource.to.EmployeeEntity;
import kr.co.seoulit.erp.account.sys.common.dao.DatasetToBeanMapper;

@RestController
@RequestMapping("/operate")
public class HRController {

    private HumanResourceService humanResourceService;
    private DatasetToBeanMapper datasetToBeanMapper;
    @Autowired
    public HRController(HumanResourceService humanResourceService, DatasetToBeanMapper datasetToBeanMapper) {
    	this.humanResourceService=humanResourceService;
    	this.datasetToBeanMapper = datasetToBeanMapper;
    }

    ModelAndView mav;
    ModelMap map = new ModelMap();


                                            // 사원 CRUD는 EmployeeRepository를 이용합니다.
                                            // MyBatis도 있지만 nexacro화면단에서는 사용하지 않습니다.


    //사원정보를 등록한다.
  @RequestMapping("/registerEmp")
  public void registerEmployee(@RequestAttribute("reqData")PlatformData reqData,
                               @RequestAttribute("resData")PlatformData resData)throws Exception{
         System.out.println("request has arrived at registerEmployee");
         EmployeeEntity employeeEntity= datasetToBeanMapper.datasetToBean(reqData,EmployeeEntity.class);
         humanResourceService.registerEmployee(employeeEntity);

  }

    //전체 사원의 정보를 가지고 온다.
  @RequestMapping("/findEmpList" )
  public ArrayList<EmployeeEntity> findEmployeeList(@RequestAttribute("reqData") PlatformData reqData,
                                                    @RequestAttribute("resData") PlatformData resData) throws Exception{
      System.out.println("request has arrived at findEmployeeList");
      ArrayList<EmployeeEntity> empList= humanResourceService.findEmployeeList();
      datasetToBeanMapper.beansToDataset(resData, empList, EmployeeEntity.class);
      return null;
  }

  @RequestMapping("/modifyEmp")
  public void modifyEmployee(@RequestAttribute("reqData")PlatformData reqData,
                             @RequestAttribute("resData")PlatformData resData)throws Exception{
      System.out.println("request has arrived at modifyEmployee");
      EmployeeEntity employeeEntity= datasetToBeanMapper.datasetToBean(reqData, EmployeeEntity.class);
      humanResourceService.modifyEmployee(employeeEntity);

  }


  @RequestMapping("/removeEmp")
  public void removeEmployee(@RequestAttribute("reqData")PlatformData reqData,
                             @RequestAttribute("resData")PlatformData resData)throws Exception{
      System.out.println("request has arrived at removeEmployee");
   String empCode=reqData.getVariable("empCode").getString();
   humanResourceService.removeEmployee(empCode);

  }















                                        // 아래의 코드들은 운영관리에서 아직 사용하지 않는 코드들



    @RequestMapping(value="/saveEmpImg",method={RequestMethod.GET, RequestMethod.POST})
    public void saveEmpImg(@RequestAttribute("reqData") PlatformData reqData,
                           @RequestAttribute("resData") PlatformData resData) throws Exception{

        String image = reqData.getVariable("image").getString();
        String empCode = reqData.getVariable("empCode").getString();
        System.out.println("image    :"+image);
        System.out.println("empCode    :"+empCode);
        HashMap<String, String> map = new HashMap<>();
        map.put("image", image);
        map.put("empCode", empCode);
        humanResourceService.saveEmpImg(map);


    }





    @GetMapping("/deptlist")
    public ArrayList<DepartmentBean> findDeptList(@RequestAttribute("reqData") PlatformData reqData,
                                                  @RequestAttribute("resData") PlatformData resData) throws Exception {

            ArrayList<DepartmentBean> deptList = humanResourceService.findDeptList();
            datasetToBeanMapper.beansToDataset(resData, deptList, DepartmentBean.class);

        return null;
    }

    @RequestMapping("/selectworkplaceCode")
    public ArrayList<DepartmentBean> selectworkplaceCode(@RequestAttribute("reqData") PlatformData reqData,
                                                         @RequestAttribute("resData") PlatformData resData) throws Exception{

            ArrayList<DepartmentBean> workplaceList = humanResourceService.selectworkplaceCode();
            datasetToBeanMapper.beansToDataset(resData, workplaceList, DepartmentBean.class);

        return null;
    }
    @RequestMapping("/selectdeptCode")
    public ArrayList<DepartmentBean> selectdeptCode(@RequestAttribute("reqData") PlatformData reqData,
    		                                        @RequestAttribute("resData") PlatformData resData) throws Exception{

    	ArrayList<DepartmentBean> deptList = humanResourceService.selectdeptCode();
    	datasetToBeanMapper.beansToDataset(resData, deptList, DepartmentBean.class);

    	return null;
        }



}
