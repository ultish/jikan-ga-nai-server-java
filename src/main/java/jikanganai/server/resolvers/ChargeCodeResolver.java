package jikanganai.server.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import jikanganai.server.entities.ChargeCode;
import jikanganai.server.repositories.ChargeCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChargeCodeResolver implements GraphQLQueryResolver {
    @Autowired
    private ChargeCodeRepository repository;

    /**
     * graphql-java-tools will automatically pick up the schema.graphqls on
     * the classpath and match the Query function names to function names in
     * these GraphQLQueryResolvers. Hence schema names are important.
     *
     * @param id
     * @return
     */
    public ChargeCode chargeCode(String id) {
        return repository.find(id);
    }
}