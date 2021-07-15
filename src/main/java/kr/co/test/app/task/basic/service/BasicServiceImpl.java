package kr.co.test.app.task.basic.service;

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
public class BasicServiceImpl implements BasicService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void print() {
		logger.debug("I am BasicService print");
	}
	
}
