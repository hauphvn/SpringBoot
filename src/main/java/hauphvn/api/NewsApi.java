package hauphvn.api;

import hauphvn.dto.NewsDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewsApi {

    @RequestMapping(value = "/news", method = RequestMethod.POST)
    @ResponseBody
    public NewsDto createNews(@RequestBody NewsDto model){
//        System.out.println(model);
        return model;
    }
}
