package com.tech.hibernate.dao;

import com.tech.hibernate.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author xxx_xx
 * @date 2018/4/28
 */
@Repository
public class StudentDao {

    @Autowired
    HibernateTemplate hibernateTemplate;


    public void save(Student student) {
        hibernateTemplate.save(student);
    }
}
