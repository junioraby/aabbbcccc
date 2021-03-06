package com.gp.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gp.domain.Bareme;
import com.gp.domain.Parametre;
@Repository("parametreDao")
public class ParametreDaoImpl implements ParametreDao {

	@Autowired
	private SessionFactory sessionfactory;
	@Override
	public Parametre trouverParId(Integer num) {
		Criteria crit = sessionfactory.getCurrentSession().createCriteria(Parametre.class);
		crit.add(Restrictions.eq("parametreId", num));
		return (Parametre) crit.uniqueResult();
	}

	@Override
	public void enregistrer(Parametre parametre) {
		Session sess=sessionfactory.openSession();
		Transaction tr = sess.beginTransaction();
		sess.saveOrUpdate(parametre);
		tr.commit();
		sess.close();

	}

	@Override
	public boolean supprimer(Parametre parametre) {
		try{
			Session sess=sessionfactory.openSession();
			Transaction tr = sess.beginTransaction();
			sess.delete(parametre);
			tr.commit();
			sess.close();
			return true;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}

}
