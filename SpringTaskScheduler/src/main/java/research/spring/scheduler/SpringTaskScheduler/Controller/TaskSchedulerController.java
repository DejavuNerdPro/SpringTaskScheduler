package research.spring.scheduler.SpringTaskScheduler.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskSchedulerController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/Home/home")
    public String Home() {
        return "Home/home";
    }
}
