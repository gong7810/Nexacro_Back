package kr.co.seoulit.erp.sys.base.repository;

import kr.co.seoulit.erp.sys.base.to.DetailCodeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailCodeRepository extends CrudRepository<DetailCodeEntity, String> {
}
