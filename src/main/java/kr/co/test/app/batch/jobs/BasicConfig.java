package kr.co.test.app.batch.jobs;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.test.app.batch.tasklets.BasicTasklet;
import kr.co.test.app.task.basic.service.BasicService;

/**
 * <pre>
 * -----------------------------------
 * 개정이력
 * -----------------------------------
 * 2021. 7. 15. kdk	최초작성
 * </pre>
 * 
 *
 * @author kdk
 */
@Configuration
public class BasicConfig {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private BasicService basicService;
	
	@Bean
	public Job tutorialJob() {
		return jobBuilderFactory.get("tutorialJob")
				.start( this.tutorialStep() )
				.build();
	}
	
	@Bean
	public Step tutorialStep() {
		return stepBuilderFactory.get("tutorialStep")
				.tasklet( new BasicTasklet(basicService) )
				.build();
	}
	
}
