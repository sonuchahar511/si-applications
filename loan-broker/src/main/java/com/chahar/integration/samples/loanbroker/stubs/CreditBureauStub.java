/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chahar.integration.samples.loanbroker.stubs;

import java.util.Random;

import com.chahar.integration.samples.loanbroker.domain.CreditReport;
import com.chahar.integration.samples.loanbroker.domain.LoanRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Oleg Zhurakousky
 * @author Gary Russell
 */
public class CreditBureauStub {

	private static Log logger = LogFactory.getLog(CreditBureauStub.class);

	/**
	 * @param loanRequest the loan request
	 * @return the CreditReport for the given loan request
	 */
	public CreditReport getCreditReport(LoanRequest loanRequest) {
		int creditScore = 600 + new Random().nextInt(250);
		logger.info("Credit Score: " + creditScore);
		return new CreditReport(creditScore);
	}

}
