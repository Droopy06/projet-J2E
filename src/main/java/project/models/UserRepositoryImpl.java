package project.models;

import org.springframework.stereotype.Repository;
import project.classes.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 14/12/15.
 */
@Repository
public class UserRepositoryImpl implements UserRepository{

    private List<Users> mListUser = new ArrayList<>();

    @Override
    public List<Users> findAllUser() {
        return mListUser;
    }

    @Override
    public Users findById(int id) {
        return mListUser.get(id);
    }

    @Override
    public void save(Users user) {
        mListUser.add(user);
    }
}
