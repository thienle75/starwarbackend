package me.salisuwy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface macheteRespository extends JpaRepository<machete, Integer> {

    
}
