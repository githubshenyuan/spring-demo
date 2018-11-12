package com.example.repository;

import com.example.entity.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author sh 2018/11/12 9:55
 * @version ideaIU-2018.2.5.win
 */
@Repository
public class UserRepository extends HibernateDaoSupport {
    public void save(User user) {
        getHibernateTemplate().save(user);
    }
}
