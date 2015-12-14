package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.classes.Users;
import project.models.UserRepository;
import project.models.UserRepositoryImpl;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 14/12/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository usersMapper;

    @Override
    public Users createUser(Users user) {
        usersMapper.save(user);
        return null;
    }

    @Override
    public List<Users> listAllUsers() {
        return usersMapper.findAllUser();
    }

    @Override
    public Users getUser(int id) {
        return usersMapper.findById(id);
    }
}
