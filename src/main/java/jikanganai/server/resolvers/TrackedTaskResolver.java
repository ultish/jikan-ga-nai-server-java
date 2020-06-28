package jikanganai.server.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import jikanganai.server.entities.TrackedTask;
import jikanganai.server.repositories.TrackedTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackedTaskResolver implements
    GraphQLResolver<TrackedTask> {

    @Autowired
    private TrackedTaskRepository repository;

    /**
     * Return a number instead of Date. This only gets run if the query
     * contains the createdAt field
     *
     * @param trackedTask
     * @return
     */
    public Long getCreatedAt(TrackedTask trackedTask) {
        return trackedTask.getCreatedAt().getTime();
    }
}
