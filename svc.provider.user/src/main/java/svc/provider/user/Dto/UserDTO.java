package svc.provider.user.Dto;

public class UserDTO {
    private Integer userId;
    private String userName;
    public Integer getUserId(){
        return userId;
    };

    public void setUserId(Integer getUserId) {
        this.userId = getUserId;
    }

    public String getUserName(){
        return userName;
    };

    public void setUserName(String getUserName) {
        this.userName = getUserName;
    }
}
