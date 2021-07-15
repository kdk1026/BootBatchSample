package kr.co.test.app.batch.tasklets;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

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
public class BasicTasklet implements Tasklet {
	
	private BasicService basicService;
	
	public BasicTasklet(BasicService basicService) {
		this.basicService = basicService;
	}

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		
		basicService.print();
		
		return RepeatStatus.FINISHED;
	}
	
}
