package kr.co.test.app.task.flow.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

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
@Service
public class FlowServiceImpl implements FlowService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void printStep1() {
		logger.debug("I am FlowService printStep1");
	}

	@Override
	public void printStep2() {
		logger.debug("I am FlowService printStep2");
	}

	@Override
	public void printStep3() {
		logger.debug("I am FlowService printStep3");
	}
	
	
}
