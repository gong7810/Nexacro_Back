package kr.co.seoulit.account.operate.humanresource.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import kr.co.seoulit.account.operate.humanresource.to.EmployeeEntity;
@Mapper
public interface EmployeeMapper {

    // 아래의 코드들은 넥사크로에서 사용하지 않습니다.
    // ---> 사원 CRUD는 EmployeeRepository를 사용합니다.
    public void saveImage(HashMap<String,String> map);

    public ArrayList<EmployeeEntity> selectEmployeeList(String deptCode);

    public void updateEmployeeInfo(EmployeeEntity employeeEntity);

    public void updateEmployee(EmployeeEntity employBean);

    public void deleteEmployee(String empCode);

    public void insertEmployee(EmployeeEntity employeeEntity);

    public EmployeeEntity selectEmployee(String EmpCode);
    
    public void updateImage(String newFileName);
    

	public EmployeeEntity selectImage(String EMP_CODE);

	public ArrayList<EmployeeEntity> selectEmployeeListAll();
}
