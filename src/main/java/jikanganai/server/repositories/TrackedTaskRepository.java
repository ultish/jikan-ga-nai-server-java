package jikanganai.server.repositories;

import jikanganai.server.entities.TrackedTask;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class TrackedTaskRepository {

    @PersistenceContext
    private EntityManager em;

    public TrackedTaskRepository() {
        // defualt
    }

    public List<TrackedTask> all() {
        return em.createQuery("select tt from TrackedTask tt")
            .getResultList();
    }
}
