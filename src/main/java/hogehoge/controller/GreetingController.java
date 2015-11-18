package hogehoge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="hoge", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }


    @RequestMapping("/hogehoge")
    public String hoge(@RequestParam(value="bbbbb", required=false, defaultValue="World") String test, Model model) {
        model.addAttribute("aaaaa", test);
        return "xxxxx";
    }

}
