/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import controller.exceptions.PreexistingEntityException;
import entity.TbKontak;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author umbara
 */
public class TbKontakJpaController implements Serializable {

    public TbKontakJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TbKontak tbKontak) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tbKontak);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTbKontak(tbKontak.getTelp()) != null) {
                throw new PreexistingEntityException("TbKontak " + tbKontak + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TbKontak tbKontak) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tbKontak = em.merge(tbKontak);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = tbKontak.getTelp();
                if (findTbKontak(id) == null) {
                    throw new NonexistentEntityException("The tbKontak with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TbKontak tbKontak;
            try {
                tbKontak = em.getReference(TbKontak.class, id);
                tbKontak.getTelp();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tbKontak with id " + id + " no longer exists.", enfe);
            }
            em.remove(tbKontak);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TbKontak> findTbKontakEntities() {
        return findTbKontakEntities(true, -1, -1);
    }

    public List<TbKontak> findTbKontakEntities(int maxResults, int firstResult) {
        return findTbKontakEntities(false, maxResults, firstResult);
    }

    private List<TbKontak> findTbKontakEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TbKontak.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    public List<TbKontak> queryGW(String nma, String cr){
        EntityManager em=getEntityManager();
        try {
            Query query=em.createQuery("SELECT t FROM TbKontak t WHERE t."+nma+" LIKE '%"+cr+"%'");
            return query.getResultList();
        } finally {
            em.close();
        }
    }
/*public List<TbKontak> nama(String nama){
    EntityManager em=getEntityManager();
    try {
        Query query=em.createNamedQuery("TbKontak.findByNama");
        query.setParameter("nama", nama);
        return query.getResultList();
    } finally {
        em.close();
    }
}
public List<TbKontak> telp(String telp){
    EntityManager em=getEntityManager();
    try {
        Query query=em.createNamedQuery("TbKontak.findByTelp");
        query.setParameter("telp", telp);
        return query.getResultList();
    } finally {
        em.close();
    }
}
public List<TbKontak> email(String email){
    EntityManager em=getEntityManager();
    try {
        Query query=em.createNamedQuery("TbKontak.findByEmail");
        query.setParameter("email", email);
        return query.getResultList();
    } finally {
        em.close();
    }
}*/
    public TbKontak findTbKontak(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TbKontak.class, id);
        } finally {
            em.close();
        }
    }

    public int getTbKontakCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TbKontak> rt = cq.from(TbKontak.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
