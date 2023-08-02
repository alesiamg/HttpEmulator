package ru.httpemulator.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.httpemulator.data.User;

import java.time.LocalDate;


@RestController
public class RestControler {
    Logger log = LoggerFactory.getLogger(RestControler.class);

    @GetMapping(path = "/result")
    public User resultGet() {
        log.info("endpoint getresult");
        return new User("aaa", "bbb");
    }

    @PostMapping(path = "/result")
    @ResponseBody
    public User resultPost(@RequestBody User usr) {
        usr.setDate(LocalDate.now());
        return usr;

    }
    //Getmapping, Postmapping
}
