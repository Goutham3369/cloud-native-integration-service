package com.Demo.Cloud_service_;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findByName(String name);
}