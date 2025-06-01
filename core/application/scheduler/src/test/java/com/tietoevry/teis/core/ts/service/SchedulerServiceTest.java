package com.tietoevry.teis.core.ts.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SchedulerServiceTest {

	@Mock
	private SchedulerFactoryBean schedulerFactoryBean;

	@Mock
	private Scheduler scheduler;

	@InjectMocks
	private SchedulerService schedulerService;

	private final String JOB_NAME = "testJob";
	private final String JOB_GROUP = "testGroup";
	private final JobKey JOB_KEY = new JobKey(JOB_NAME, JOB_GROUP);

	@BeforeEach
	void setUp() throws SchedulerException {
		when(schedulerFactoryBean.getScheduler()).thenReturn(scheduler);
	}

	@Test
	void pauseJob_shouldReturnTrue_whenJobExists() throws SchedulerException {
		when(scheduler.checkExists(JOB_KEY)).thenReturn(true);
		boolean result = schedulerService.pauseJob(JOB_NAME, JOB_GROUP);

		assertTrue(result);
		verify(scheduler).pauseJob(JOB_KEY);
	}

	@Test
	void pauseJob_shouldReturnFalse_whenJobDoesNotExist() throws SchedulerException {

		when(scheduler.checkExists(JOB_KEY)).thenReturn(false);

		boolean result = schedulerService.pauseJob(JOB_NAME, JOB_GROUP);

		assertFalse(result);
		verify(scheduler, never()).pauseJob(any());
	}

	@Test
	void resumeJob_shouldReturnTrue_whenJobExists() throws SchedulerException {

		when(scheduler.checkExists(JOB_KEY)).thenReturn(true);

		boolean result = schedulerService.resumeJob(JOB_NAME, JOB_GROUP);

		assertTrue(result);
		verify(scheduler).resumeJob(JOB_KEY);
	}

	@Test
	void resumeJob_shouldReturnFalse_whenJobDoesNotExist() throws SchedulerException {

		when(scheduler.checkExists(JOB_KEY)).thenReturn(false);

		boolean result = schedulerService.resumeJob(JOB_NAME, JOB_GROUP);

		assertFalse(result);
		verify(scheduler, never()).resumeJob(any());
	}
}