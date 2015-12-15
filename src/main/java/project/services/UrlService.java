package project.services;

import project.classes.Url;
import project.classes.Users;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 15/12/15.
 */
public interface UrlService {

    Url createUrl(Url url);
    List<Url> listAllUrl();
    Url getUrl(int id);
    String generateUrl();
}
