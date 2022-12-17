package com.example.multipleenvironmentusecasespringbootapplication.repo;

import com.example.multipleenvironmentusecasespringbootapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
