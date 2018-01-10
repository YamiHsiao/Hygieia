package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QLibraryPolicyResult is a Querydsl query type for LibraryPolicyResult
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLibraryPolicyResult extends EntityPathBase<LibraryPolicyResult> {

    private static final long serialVersionUID = 828663080L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLibraryPolicyResult libraryPolicyResult = new QLibraryPolicyResult("libraryPolicyResult");

    public final QBaseModel _super;

    public final org.bson.types.QObjectId collectorItemId;

    public final NumberPath<Long> evaluationTimestamp = createNumber("evaluationTimestamp", Long.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath reportUrl = createString("reportUrl");

    public final MapPath<LibraryPolicyType, java.util.Set<LibraryPolicyResult.Threat>, SimplePath<java.util.Set<LibraryPolicyResult.Threat>>> threats = this.<LibraryPolicyType, java.util.Set<LibraryPolicyResult.Threat>, SimplePath<java.util.Set<LibraryPolicyResult.Threat>>>createMap("threats", LibraryPolicyType.class, java.util.Set.class, SimplePath.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public QLibraryPolicyResult(String variable) {
        this(LibraryPolicyResult.class, forVariable(variable), INITS);
    }

    public QLibraryPolicyResult(Path<? extends LibraryPolicyResult> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLibraryPolicyResult(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLibraryPolicyResult(PathMetadata<?> metadata, PathInits inits) {
        this(LibraryPolicyResult.class, metadata, inits);
    }

    public QLibraryPolicyResult(Class<? extends LibraryPolicyResult> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
    }

}

