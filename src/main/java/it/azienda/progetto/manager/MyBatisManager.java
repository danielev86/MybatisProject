package it.azienda.progetto.manager;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisManager {
	
	public static SqlSessionFactory sessionFactory() throws IOException{
		return new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("it/azienda/progetto/SqlMybatisConfiguration.xml"));
	}

}
