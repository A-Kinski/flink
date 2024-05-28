package org.apache.flink.cep.functions;

import java.util.List;
import org.apache.flink.annotation.PublicEvolving;

@PublicEvolving
public interface UnmatchedEventsHandler<IN> {

    void processUnmatchedEvents(
            final List<IN> event, final PatternProcessFunction.Context ctx)
            throws Exception;
}
