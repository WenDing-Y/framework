package com.tech.hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

/**
 * @author xxx_xx
 * @date 2018/4/28
 */
public interface Basic<T> {

    void add(T t);

    T queryById(int id);

    void delete(T t);

    void deleteById(int id);

    List<T> getListResutl();

    List<T> getListRangeResult(Set<Integer> ids);


}
