package project.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.classes.Url;
import project.models.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 15/12/15.
 */
@Repository
public class UrlRepositoryImpl implements UrlRepository {

    private List<Url> mListUrl = new ArrayList<>();

    @Override
    public List<Url> findAllUrl() {
        return mListUrl;
    }

    @Override
    public Url findById(int id) {
        return mListUrl.get(id);
    }

    @Override
    public void save(Url url) {
        mListUrl.add(url);
    }
}
