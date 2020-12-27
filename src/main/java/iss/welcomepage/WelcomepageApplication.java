package iss.welcomepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class WelcomepageApplication {
    public static void main(String[] args) {
        SpringApplication.run(WelcomepageApplication.class, args);
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome()
    {
        return "Welcome";
    }

    @RequestMapping(value = "/wissenswertes", method = RequestMethod.GET)
    public String wissenswertes()
    {
        return "Wissenswertes";
    }

    @RequestMapping(value = "/sicherheitsscan", method = RequestMethod.GET)
    public String sicherheitsscan()
    {
        return "Sicherheitsscan";
    }

    @RequestMapping(value = "/impressum", method = RequestMethod.GET)
    public String impressum()
    {
        return "Impressum";
    }

    @RequestMapping(value = "/registrierung", method = RequestMethod.GET)
    public String registrierung()
    {
        return "Registrierung";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login()
    {
        return "Login";
    }
}
