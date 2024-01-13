package research.spring.scheduler.SpringTaskScheduler.Schedulers;

import java.time.LocalTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TimelyMessageInformScheduler {

    @Scheduled(cron = "0 44 1 * * ?") // ----------execute at 12 AM to 12:59 per minute
    public void inform() {
        System.out.println("Informed.");
        log.info("InFormed at : ", LocalTime.now());
    }
}
