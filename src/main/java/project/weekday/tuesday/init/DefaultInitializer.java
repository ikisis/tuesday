package project.weekday.tuesday.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import project.weekday.tuesday.domain.User;
import project.weekday.tuesday.repository.map.UserMapRepository;

@Slf4j
@Component
public class DefaultInitializer implements ApplicationRunner {

    @Autowired
    private UserMapRepository userMapRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        log.info("application init started...");

        this.userMapRepository.save(User.IKISIS);
    }



}