package com.itrip.dao.user;

import com.itrip.beans.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User getUserByUserCode(@Param("userCode") String userCode);
}
