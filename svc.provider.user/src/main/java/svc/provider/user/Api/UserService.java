package svc.provider.user.Api;

import svc.provider.user.Dto.UserDTO;

public interface UserService {
    UserDTO findUser(Integer userId);
}
