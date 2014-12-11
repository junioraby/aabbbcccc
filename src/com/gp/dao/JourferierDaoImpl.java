package com.gp.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gp.domain.Ferier;
import com.gp.domain.Tableferier;
@Repository("jourferierDao")
public class JourferierDaoImpl implements JourferierDao {
	@Autowired
	private SessionFactory sessionfactory;
	@Override
	public Tableferier trouverParId(Integer num) {
		Criteria crit = sessionfactory.getCurrentSession().createCriteria(Tableferier.class);
		crit.add(Restrictions.eq("tableferierId", num));
		return (Tableferier) crit.uniqueResult();
	}

	@Override
	public void enregistrer(Tableferier ferier) {
		Session sess=sessionfactory.openSession();
		Transaction tr = sess.beginTransaction();
		sess.saveOrUpdate(ferier);
		tr.commit();
		sess.close();

	}

	@Override
	public boolean supprimer(Tableferier ferier) {
		try{
			Session sess=sessionfactory.openSession();
			Transaction tr = sess.beginTransaction();
			sess.delete(ferier);
			tr.commit();
			sess.close();
			return true;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}

}
