package com.code.with.durgesh.schedular.schedular_spring_boot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	int i = 0;

	//@Scheduled(fixedRate = 5000) // executes after every 5 seconds
//	@Scheduled(fixedDelay = 5000)  // executes after the last task end and then it wait for 5 seconds and then it executes
	 // second minute hour day_of_month month day_of_week // * means every month, every day of month, ? means any day of week
	@Scheduled(cron = "0 0 12 * * ?")  
	public void cleanTempFile() {
		System.out.println("delete>>"+i);
		i = i+1;
	}
	
	/*
		cron fields 
		Filed              Allowed Values         Special Character        Example
		second           0- 59                   , - * /                  0 (At the start of the minute)
		minutes            0 - 59                , - * /                   30 ( At minute 30)
		Hours              0-23                     , - * /                  14 ( 2 PM)
		Day Of Month        1 - 31                , - * / L W               15( on the 15th)
		Month            1-12 or JAN-DEC          , - * /                  7 or JUL (July)
		Day of Week        1-7 or SUN-SAT         , - * / L #              1 or SUN(Sunday)
	
	*/
}
