package research.spring.scheduler.SpringTaskScheduler.Schedulers;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TimelyTaskNotifyScheduler {

    @Async
    @Scheduled(fixedRate = 5000) // -----every second
    public void notifying() {
        log.info("Time to relax : ", LocalDateTime.now());
    }

    @Async
    @Scheduled(fixedRate = 5000) // ------ for @Async inspection
    public void notifyingPlus() {
        log.info("Time to Walk : ", LocalDateTime.now());
    }

    /*
     * @Scheduled(fixedRate = 5000) // -----every second
     * public void notifying() {
     * log.info("Time to relax : ", LocalDateTime.now());
     * }
     * 
     * @Scheduled(fixedRate = 5000) // ------ for @Async inspection
     * public void notifyingPlus() {
     * log.info("Time to Walk : ", LocalDateTime.now());
     * }
     */

}
