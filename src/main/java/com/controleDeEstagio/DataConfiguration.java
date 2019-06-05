package com.controleDeEstagio;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

	@Configuration
	public class DataConfiguration {

		@Bean
	    public DataSource dataSource(){
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
	        dataSource.setUrl("jdbc:hsqldb:hsql://localhost/controleDeEstagio");
	        dataSource.setUsername("SA");
	        dataSource.setPassword("");
	        return dataSource;
	    }
		
		@Bean
		public JpaVendorAdapter jpaVendorAdapter(){
			HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
			adapter.setDatabase(Database.HSQL);
			adapter.setShowSql(true);
			adapter.setGenerateDdl(true);
			adapter.setDatabasePlatform("org.hibernate.dialect.HSQLDialect");
			adapter.setPrepareConnection(true);
			return adapter;
		}

	

}
