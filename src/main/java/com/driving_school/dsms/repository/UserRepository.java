package com.driving_school.dsms.repository;

import com.driving_school.dsms.model.UserModel;
import org.hibernate.cfg.annotations.reflection.JPAOverriddenAnnotationReader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserModel findByName(String s);
}
