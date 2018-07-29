package gkservices.authsvc.service;

import com.czj.remote.api.UserServiceRemoteApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "provideruser")
public interface RemoteUserService extends UserServiceRemoteApi {
}
