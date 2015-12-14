package project.services;

import project.classes.Users;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 14/12/15.
 */

public interface UserService {
    Users createUser(Users user);
    List<Users> listAllUsers();
    Users getUser(int id);
}
