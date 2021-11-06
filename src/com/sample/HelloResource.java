package com.sample;

import java.io.InputStream;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sample.dao.EmpDao;

@Path("/hello")
public class HelloResource {

//	@GET
//	@Produces("application/json")
//	public Employee sample() {
//		return new Employee(9999, "sample", "sales", new Date(), 500, 10);
//	}

//	@GET
//	@Produces("application/json")
//	// 引数にアノテーション受け取った値をそこに入れる
//	public Employee sample(@QueryParam("empno") int empno) {
//
//		try {
//			String resource = "config.xml";
//			InputStream inputStream = Resources.getResourceAsStream(resource);
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//			SqlSession session = sqlSessionFactory.openSession();
//			EmpDao dao = session.getMapper(EmpDao.class);
//
//			return dao.findByPrimarykey(empno);
//
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}

//	}

	@POST
	@Produces("application/json")
	// 引数にアノテーション受け取った値をそこに入れる
	public Employee sample(@FormParam("empno") int empno) {

		try {
			String resource = "config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			SqlSession session = sqlSessionFactory.openSession();
			EmpDao dao = session.getMapper(EmpDao.class);

			return dao.findByPrimarykey(empno);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	// /hello/testでアクセス
	@GET
	@Path("test")
	public void test() {
		System.out.println("test");
	}

	// /hello/hogeでアクセス
	@GET
	@Path("hoge")
	public void hoge() {
		System.out.println("hoge");
	}

}
