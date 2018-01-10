package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCommitStatus is a Querydsl query type for CommitStatus
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QCommitStatus extends BeanPath<CommitStatus> {

    private static final long serialVersionUID = 372178155L;

    public static final QCommitStatus commitStatus = new QCommitStatus("commitStatus");

    public final StringPath context = createString("context");

    public final StringPath description = createString("description");

    public final StringPath state = createString("state");

    public QCommitStatus(String variable) {
        super(CommitStatus.class, forVariable(variable));
    }

    public QCommitStatus(Path<? extends CommitStatus> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommitStatus(PathMetadata<?> metadata) {
        super(CommitStatus.class, metadata);
    }

}

