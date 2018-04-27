package com.tech.hibernate.model;

import com.tech.hibernate.dao.StudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xxx_xx
 * @date 2018/4/28
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("springContext-admin.xml");
        context.start();
        StudentDao dao = (StudentDao) context.getBean("studentDao");
        Student student = new Student("nan1", "beijing");
        dao.save(student);
    }
}
