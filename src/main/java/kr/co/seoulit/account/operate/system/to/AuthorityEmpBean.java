package kr.co.seoulit.account.operate.system.to;

import kr.co.seoulit.account.sys.base.to.BaseBean;
import kr.co.seoulit.account.sys.common.annotation.Dataset;


@Dataset(name="gds_authority_emp")
public class AuthorityEmpBean extends BaseBean {
	private String id;
	private String empCode;
	private String empName;
	private String authorityCode;
	private String authorityName;
	private String isAuthority;
	private String authorityLevel;


	@Override
	public String toString() {
		return "AuthorityEmpBean{" +
				"id='" + id + '\'' +
				", empCode='" + empCode + '\'' +
				", empName='" + empName + '\'' +
				", authorityCode='" + authorityCode + '\'' +
				", authorityName='" + authorityName + '\'' +
				", isAuthority='" + isAuthority + '\'' +
				", authorityLevel='" + authorityLevel + '\'' +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAuthorityCode() {
		return authorityCode;
	}

	public void setAuthorityCode(String authorityCode) {
		this.authorityCode = authorityCode;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	public String getIsAuthority() {
		return isAuthority;
	}

	public void setIsAuthority(String isAuthority) {
		this.isAuthority = isAuthority;
	}

	public String getAuthorityLevel() {
		return authorityLevel;
	}

	public void setAuthorityLevel(String authorityLevel) {
		this.authorityLevel = authorityLevel;
	}
}
