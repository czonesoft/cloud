package svc.provider.user.ServiceImpl;

import com.czj.remote.api.UserServiceRemoteApi;
import com.czj.remote.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceRemoteApiImpl implements UserServiceRemoteApi {
    @Override
    public User findUser(@PathVariable Integer userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("分布式架构用户"+userId);
        return user;
    }
}
