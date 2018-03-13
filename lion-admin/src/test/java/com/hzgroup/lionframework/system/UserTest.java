package com.hzgroup.lionframework.system;

import com.hzgroup.lionframework.modular.system.dao.UserMgrDao;
import com.hzgroup.lionframework.base.BaseJunit;
import com.hzgroup.lionframework.common.persistence.dao.UserMapper;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 用户测试
 *
 * @author fengshuonan
 * @date 2017-04-27 17:05
 */
public class UserTest extends BaseJunit {

    @Resource
    UserMgrDao userMgrDao;

    @Resource
    UserMapper userMapper;

    @Test
    public void userTest() throws Exception {

    }

}
