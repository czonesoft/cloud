package svc.provider.user.ServiceImpl;

import org.springframework.stereotype.Service;
import svc.provider.user.Api.UserService;
import svc.provider.user.Dto.UserDTO;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO findUser(Integer userId) {
        UserDTO user = new UserDTO();
        user.setUserId(userId);
        user.setUserName("分布式架构用户"+userId);
        return user;
    }
}
