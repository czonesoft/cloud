package com.czj.remote.api;

import com.czj.remote.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RequestMapping("/user-service-remote")
public interface UserServiceRemoteApi {
    @RequestMapping(value = "/findU/{userId}", method = RequestMethod.GET)
    User findUser(@PathVariable(value = "userId") Integer userId);
}
