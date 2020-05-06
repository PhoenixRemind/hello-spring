package org.launchcode.hellospring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Paul Deyarmin
 */
@Controller
@ResponseBody
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }

    // Handles requests to the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    public String helloWithQueryParam(@RequestParam String name) { return "Hello, " + name + "!"; }

    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value = "helloperson")
    public static String createMessage(@RequestParam String name, String language) {
        if (language.equals("japanese")) {
            return "Konnichiwa, " + name + "!";
        } else if (language.equals("french")) {
            return "Bonjour, " + name + "!";
        } else if (language.equals("spanish")) {
            return "Hola, " + name + "!";
        } else if (language.equals("german")) {
            return "Guten Tag, " + name + "!";
        } else {
            return "Hello, " + name + "!";
        }
    }

    // Handles requests of the form /hello/LaunchCode
//    @GetMapping("hello/{name}")
//    public String helloWithPathParam(@PathVariable String name) { return "Hello, " + name + "!"; }

    //Handles a form

    @GetMapping("form")
    public String helloForm(){
        return"<html>" +
                "<body>" +
                "<form action='helloperson' method='post'>" + //Submit request to /hello
                "<input type='text' name='name'>" +
                "<select name='language' id-'lang-select'>" +
                "<option value='english'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='german'>German</option>" +
                "<option value='japanese'>Japanese</option>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
