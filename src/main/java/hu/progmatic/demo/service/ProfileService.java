package hu.progmatic.demo.service;

import hu.progmatic.demo.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    private ProfileRepo profileRepo;

    @Autowired
    public ProfileService(ProfileRepo profileRepo) {
        this.profileRepo = profileRepo;
    }

}
