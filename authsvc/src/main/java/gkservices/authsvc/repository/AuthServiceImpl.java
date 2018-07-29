package gkservices.authsvc.repository;

import gkservices.authsvc.api.IAuthService;
import gkservices.authsvc.model.AuthMsg;
import org.springframework.stereotype.Service;

@Service("authService")
public class AuthServiceImpl implements IAuthService {

    @Override
    public AuthMsg login(Integer userId) {
        AuthMsg authMsg = new AuthMsg();
        authMsg.setMsg("登录成功");
        authMsg.setCode("succ");
        return authMsg;
    }
}
