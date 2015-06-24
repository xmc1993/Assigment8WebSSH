package acdemic.dao.impl;

import java.util.List;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import acdemic.dao.AcdemicDao;
import acdemic.dao.BaseDao;

@Repository
public class AcdemicDaoImpl implements AcdemicDao{
	@Autowired
	private BaseDao baseDaoImpl;
		
		
	public List find(String id) {
		String hql="from Course c where c.uid=?";
		Query query=baseDaoImpl.getSession().createQuery(hql);
		query.setString(0,id);
		List list=query.list();
		return list;
	}
	
	
	


	
	
	
/**
	private Configuration config;
	private ServiceRegistry serviceRegistry;
	private SessionFactory sessionFactory;
	private Session session;

	private static AcdemicDaoImpl acdemicDao=new AcdemicDaoImpl();
	
	private AcdemicDaoImpl(){
		
	}
	
	public static AcdemicDaoImpl getInstance()
	{
		return acdemicDao;
	}
	
	public List find(String id) {
		try {
			
			config = new Configuration().configure();
			serviceRegistry =new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			sessionFactory=config.buildSessionFactory(serviceRegistry);	
			session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			String hql="from Course c where c.uid=?";
			org.hibernate.Query query=session.createQuery(hql);
			query.setString(0, id);
			List list=query.list();	
			tx.commit();
			session.close();
			sessionFactory.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
**/
	
}



















