package project.models;

import java.util.List;
import project.classes.Users;

/**
 * Created by LAMOOT Alexandre on 14/12/15.
 */

public interface UserRepository {
    List<Users> findAllUser();
    Users findById(int id);
    void save(Users user);
}
