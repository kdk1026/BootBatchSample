package kr.co.test.app.batch.jobs;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.test.app.batch.tasklets.FlowStep1Tasklet;
import kr.co.test.app.batch.tasklets.FlowStep2Tasklet;
import kr.co.test.app.batch.tasklets.FlowStep3Tasklet;
import kr.co.test.app.task.flow.service.FlowService;

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
public class FlowConfig {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private FlowService flowService;
	
	@Bean
	public Job flowJob() {
		return jobBuilderFactory.get("flowJob")
				.start( this.flowStep3() )
				.next( this.flowStep2() )
				.next( this.flowStep1() )
				.build();
	}
	
	@Bean
	public Step flowStep1() {
		return stepBuilderFactory.get("flowStep1")
				.tasklet( new FlowStep1Tasklet(flowService) )
				.build();
	}
	
	@Bean
	public Step flowStep2() {
		return stepBuilderFactory.get("flowStep2")
				.tasklet( new FlowStep2Tasklet(flowService) )
				.build();
	}
	
	@Bean
	public Step flowStep3() {
		return stepBuilderFactory.get("flowStep3")
				.tasklet( new FlowStep3Tasklet(flowService) )
				.build();
	}
	
}
