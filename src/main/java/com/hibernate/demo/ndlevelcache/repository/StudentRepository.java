package com.hibernate.demo.ndlevelcache.repository;


import com.hibernate.demo.ndlevelcache.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;


import javax.persistence.QueryHint;
import java.util.Optional;



public interface StudentRepository extends JpaRepository<Student,Long> {

    @QueryHints(@QueryHint(name="org.hibernate.cacheable",value="true"))
    public Optional<Student> findByName(String name);
}
