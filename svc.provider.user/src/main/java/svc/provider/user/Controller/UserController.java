package svc.provider.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import svc.provider.user.Api.UserService;
import svc.provider.user.Dto.UserDTO;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public UserDTO findUser(@PathVariable Integer id) {
        return userService.findUser(id);
    }
}
