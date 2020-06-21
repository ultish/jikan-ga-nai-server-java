package jikanganai.server.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import jikanganai.server.repositories.ChargeCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class QueryResolver implements GraphQLQueryResolver {
    @Autowired
    private ChargeCodeRepository repository;

    @PersistenceContext
    private EntityManager em;

 
}
