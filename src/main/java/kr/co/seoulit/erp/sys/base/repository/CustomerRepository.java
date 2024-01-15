package kr.co.seoulit.erp.sys.base.repository;

import kr.co.seoulit.erp.sys.base.to.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {
}
