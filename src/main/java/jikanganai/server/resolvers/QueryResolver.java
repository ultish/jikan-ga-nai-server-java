package jikanganai.server.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import jikanganai.server.entities.ChargeCode;
import jikanganai.server.repositories.ChargeCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {
    @Autowired
    private ChargeCodeRepository repository;

    // testing multiple resolvers
    public List<ChargeCode> chargeCodes() {
        return Arrays.asList(repository.find("1"));
    }

}
