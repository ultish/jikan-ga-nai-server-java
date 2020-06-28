package jikanganai.server.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import jikanganai.server.entities.TrackedTask;
import jikanganai.server.repositories.ChargeCodeRepository;
import jikanganai.server.repositories.TrackedTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrackedTaskQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private TrackedTaskRepository repository;
    @Autowired
    private ChargeCodeRepository chargeCodeRepository;

    public List<TrackedTask> trackedTasks() {
        return repository.all();
    }
 
}
