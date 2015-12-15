package project.models;

import project.classes.Url;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 15/12/15.
 */
public interface UrlRepository {
    List<Url> findAllUrl();
    Url findById(int id);
    void save(Url url);
}
