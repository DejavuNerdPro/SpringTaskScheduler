package research.spring.scheduler.SpringTaskScheduler.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskSchedulerController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
