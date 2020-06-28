package jikanganai.server.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import jikanganai.server.entities.TimeBlock;
import org.springframework.stereotype.Component;

@Component
public class TimeBlockResolver implements
    GraphQLResolver<TimeBlock> {

    public Long getStartTime(TimeBlock timeBlock) {
        return timeBlock.getStartTime().getTime();
    }
}
