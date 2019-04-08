package ke.com.other.othersite.Service;

import ke.com.other.othersite.Model.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
