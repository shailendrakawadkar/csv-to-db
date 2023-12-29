package com.shailendrakawadkar.csvtodb.repository;

import com.shailendrakawadkar.csvtodb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
