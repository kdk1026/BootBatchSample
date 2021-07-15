package kr.co.test.app.batch.tasklets;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

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
public class FlowStep2Tasklet implements Tasklet {
	
	private FlowService flowService;

	public FlowStep2Tasklet(FlowService flowService) {
		this.flowService = flowService;
	}

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		flowService.printStep2();
		
		return RepeatStatus.FINISHED;
	}
	

}
