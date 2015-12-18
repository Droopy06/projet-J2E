package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.classes.Url;
import project.models.UrlRepository;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 15/12/15.
 */
@Service
public class UrlServiceImpl implements UrlService {

    @Autowired
    private UrlRepository urlMapper ;

    @Override
    public Url createUrl(Url url) {
        url.setShortUrl(generateUrl());
        urlMapper.save(url);
        return null;
    }

    @Override
    public List<Url> listAllUrl() {
        return urlMapper.findAllUrl();
    }

    @Override
    public Url getUrl(int id) {
        return urlMapper.findById(id);
    }

    @Override
    public String generateUrl() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String pass = "http://";
        for(int x=0;x<4;x++)
        {
            int i = (int)Math.floor(Math.random() * 62);
            pass += chars.charAt(i);
        }
        return pass;
    }
}
