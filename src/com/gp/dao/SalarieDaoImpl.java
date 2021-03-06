package com.gp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gp.domain.Contrat;
import com.gp.domain.Salarie;
@Repository("salarieDao")
public class SalarieDaoImpl implements SalarieDao {

	@Autowired
	private SessionFactory sessionfactory;
	@Override
	public void enregistrer(Salarie s) {
		Session sess=sessionfactory.openSession();
		Transaction tr = sess.beginTransaction();
		sess.saveOrUpdate(s);
		tr.commit();
		sess.close();

	}

	@Override
	public boolean supprimer(Salarie s) {
		try{
			Session sess=sessionfactory.openSession();
			Transaction tr = sess.beginTransaction();
			sess.delete(s);
			tr.commit();
			sess.close();
			return true;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public Salarie trouverParId(Integer id) {
		Criteria crit = sessionfactory.getCurrentSession().createCriteria(Salarie.class);
		crit.add(Restrictions.eq("salarieId", id));
		return (Salarie) crit.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Salarie> recherche(String q) {
		List<Salarie> recrue = new ArrayList<Salarie>(0);
		if(!q.equals(null)){
			String []qs = q.split(" ");
			Criteria crit = sessionfactory.getCurrentSession().createCriteria(Salarie.class,"salarie");
			crit.createAlias("salarie.etatcivile", "etatcivile"); 
			if(qs.length > 1){
				for(String str:qs){
					str = "%"+str+"%";
					Criterion rest1= Restrictions.like("etatcivile.nom", str);
					Criterion rest2= Restrictions.like("etatcivile.prenom", str);
					crit.add(Restrictions.or(rest1, rest2));
				}
			}else{
			q = "%"+q+"%";
			Criterion rest1= Restrictions.like("etatcivile.nom", q);
			Criterion rest2= Restrictions.like("etatcivile.prenom", q);
			crit.add(Restrictions.or(rest1, rest2));
			}
			 recrue = (List<Salarie>) crit.
					setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).
					list();
		}
	
	return recrue;
	}

}
