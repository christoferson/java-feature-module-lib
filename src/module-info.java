import demo.service.IAccountService;
import demo.service.ICustomerService;
import demo.service.impl.AccountServiceMemory;
import demo.service.impl.CustomerServiceFactory;
import demo.service.jpa.AccountServiceJpa;
import demo.service.sql.AccountServiceSql;

module demo.module.lib {
	exports demo.model;
	exports demo.service;
	provides IAccountService with AccountServiceMemory, AccountServiceJpa, AccountServiceSql;
	provides ICustomerService with CustomerServiceFactory;

	exports demo.service.pub1 to demo.module;
	exports demo.service.pub2 to demo.module2;
	
	opens demo.service.open1 to demo.module;
}