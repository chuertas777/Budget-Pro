package com.budget.budgetpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.budget.budgetpro.configuracion")
public class BudgetProApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetProApplication.class, args);
	}

}
