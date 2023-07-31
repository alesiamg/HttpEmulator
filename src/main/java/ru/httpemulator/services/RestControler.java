package ru.httpemulator.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.httpemulator.data.ResultPostRQ;
import ru.httpemulator.data.ResultPostRS;


@RestController
public class RestControler {
    Logger log = LoggerFactory.getLogger(RestControler.class);

    @RequestMapping(path = "/result", method = RequestMethod.GET)
    public String resultGet() {
        log.info("endpoint getresult");
        return "{\"status\": \"OK\"}";
    }

    @RequestMapping(path = "/result", method = RequestMethod.POST)
    @ResponseBody
    public ResultPostRS resultPost(@RequestBody ResultPostRQ rq) {
        return new ResultPostRS(rq.login);

    }

}
