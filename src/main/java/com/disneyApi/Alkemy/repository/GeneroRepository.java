
package com.disneyApi.Alkemy.repository;

import com.disneyApi.Alkemy.entity.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<GeneroEntity, Long>{
    
}
