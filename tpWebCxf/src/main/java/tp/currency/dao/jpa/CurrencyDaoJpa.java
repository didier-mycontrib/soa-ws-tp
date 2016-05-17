package tp.currency.dao.jpa;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import tp.currency.dao.CurrencyDao;
import tp.currency.entity._Currency;

@Transactional//ici en version Spring
@Named // ou @Component ou @Repositoty
public class CurrencyDaoJpa implements CurrencyDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public _Currency findByCode(String code) {
		return em.find(_Currency.class, code);
	}

	@Override
	public _Currency findByName(String name) {
		return em.createQuery("SELECT c FROM _Currency c WHERE c.name=:name",
				             _Currency.class).setParameter("name",name)
				                             .getSingleResult();
	}

	@Override
	public void updateCurrency(_Currency c) {
		em.merge(c);
	}

	@Override
	public void createCurrency(_Currency c) {
		em.persist(c);
	}

	@Override
	public void removeCurrency(_Currency c) {
		em.remove(c);
	}

}
