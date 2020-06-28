package jikanganai.server.repositories;

import jikanganai.server.entities.ChargeCode;
import jikanganai.server.entities.TrackedTask;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class ChargeCodeRepository {

    @PersistenceContext
    private EntityManager em;

    public ChargeCodeRepository() {

    }

    public ChargeCode find(Integer id) {
        return (ChargeCode) em.createQuery("select cc from ChargeCode cc " +
            "where" +
            " cc.id = " +
            ":id")
            .setParameter("id", id)
            .getSingleResult();
    }

    public List<ChargeCode> all() {
        return em.createQuery("select cc from ChargeCode cc")
            .getResultList();
    }

    public List<ChargeCode> findByTrackedTask(TrackedTask trackedTask) {
        //        return em.createQuery()
        return null;
    }

}
