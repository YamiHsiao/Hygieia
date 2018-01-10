package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QLibraryPolicyResult_Threat is a Querydsl query type for Threat
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QLibraryPolicyResult_Threat extends BeanPath<LibraryPolicyResult.Threat> {

    private static final long serialVersionUID = 1587781056L;

    public static final QLibraryPolicyResult_Threat threat = new QLibraryPolicyResult_Threat("threat");

    public final ListPath<String, StringPath> components = this.<String, StringPath>createList("components", String.class, StringPath.class, PathInits.DIRECT2);

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final EnumPath<LibraryPolicyThreatLevel> level = createEnum("level", LibraryPolicyThreatLevel.class);

    public QLibraryPolicyResult_Threat(String variable) {
        super(LibraryPolicyResult.Threat.class, forVariable(variable));
    }

    public QLibraryPolicyResult_Threat(Path<? extends LibraryPolicyResult.Threat> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLibraryPolicyResult_Threat(PathMetadata<?> metadata) {
        super(LibraryPolicyResult.Threat.class, metadata);
    }

}

