import demo.service.IAccountService;
import demo.service.impl.AccountServiceJpa;
import demo.service.impl.AccountServiceMemory;

module demo.module.lib {
	exports demo.model;
	exports demo.service;
	provides IAccountService with AccountServiceMemory, AccountServiceJpa;
}