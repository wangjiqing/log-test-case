package com.sakura.logtestcase.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class ScheduledTask {

    @Scheduled(fixedRate = 1000)
    public void scheduledInfo() {
        log.info("This is a info level logs " + new Date().getTime());
    }

    @Scheduled(fixedRate = 1000)
    public void scheduleError() {
        log.error("This is a error level logs " + new Date().getTime());
    }

    @Scheduled(fixedRate = 1000)
    public void scheduleDebug() {
        log.debug("This is a debug level logs " + new Date().getTime());
    }

    @Scheduled(fixedRate = 1000)
    public void scheduleWarn() {
        log.warn("This is a debug level logs " + new Date().getTime());
    }
}
