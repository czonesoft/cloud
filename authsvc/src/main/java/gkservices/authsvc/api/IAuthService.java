package gkservices.authsvc.api;

import gkservices.authsvc.model.AuthMsg;

public interface IAuthService {
    AuthMsg login(Integer userId);
}
