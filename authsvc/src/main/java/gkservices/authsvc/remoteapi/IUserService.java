package gkservices.authsvc.remoteapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "provideruser")
public interface IUserService {
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String findUser(Integer userId);
}
