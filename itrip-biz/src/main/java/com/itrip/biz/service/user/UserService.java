package com.itrip.biz.service.user;

import com.itrip.beans.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User login(String userCode,String password);
}
