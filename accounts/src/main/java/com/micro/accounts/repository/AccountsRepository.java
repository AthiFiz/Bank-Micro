package com.micro.accounts.repository;

import com.micro.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(long customerId);

    @Transactional  // It ensures that all database actions inside the method either complete successfully or none of them happen at all (atomicity).
//    Tells Spring Data JPA that the repository method is not just a SELECT — it’s a DML operation (like UPDATE, DELETE, INSERT).
//    By default, Spring Data JPA assumes you're writing read-only queries (SELECT).
    @Modifying
    void deleteByCustomerId(Long customerId);

}
