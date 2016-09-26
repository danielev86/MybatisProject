package it.azienda.progetto.manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import it.azienda.progetto.bean.Star;

public class StarDAO {
	
	public static List<Star> retrieveAllStar() throws IOException{
		SqlSession session = MyBatisManager.sessionFactory().openSession();
		List<Star> stars = new ArrayList<>();
		stars = session.selectList("getAllStar");
		session.commit();
		session.close();
		return stars;
	}
	
	public static void printStar(String lastName) throws IOException{
		SqlSession session = MyBatisManager.sessionFactory().openSession();
		Star star = session.selectOne("getStarByLastname", lastName);
		System.out.println(star);
		session.commit();
		session.close();
	}
	
	public static void printStarByWord(String word) throws IOException{
		SqlSession session = MyBatisManager.sessionFactory().openSession();
		List<Star> stars = session.selectList("getStarContainWord", "%"+word+"%");
		for (Star it: stars){
			System.out.println(it.getFirstName() + " " + it.getLastName());
			System.out.println(it.getBiography());
			System.out.println("------------------------");
		}
		session.commit();
		session.close();
	}

}
