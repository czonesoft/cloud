package gkservices.authsvc.controller;

import com.czj.remote.model.User;
import gkservices.authsvc.api.IAuthService;
import gkservices.authsvc.model.AuthMsg;
import gkservices.authsvc.service.RemoteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private IAuthService authService;

    @Autowired
    private RemoteUserService remoteUserService;

    @GetMapping("/login/{userId}")
    public AuthMsg Login(@PathVariable Integer userId){
        return authService.login(userId);
    }

    @RequestMapping("/findU/{userId}")
    public User findUser(@PathVariable(value = "userId")  Integer userId){
        return remoteUserService.findUser(userId);
    }
}
