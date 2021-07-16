package com.incidents.reposository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.incidents.entity.UserEntity;
@Repository  
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	

}
