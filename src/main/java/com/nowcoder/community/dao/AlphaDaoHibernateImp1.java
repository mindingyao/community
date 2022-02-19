package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AlphaDaoHibernateImp1 implements AlphaDao {

    @Override
    public String select() {
        return "Hibernate";
    }
}
