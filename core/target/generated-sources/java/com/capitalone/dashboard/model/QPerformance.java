package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPerformance is a Querydsl query type for Performance
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPerformance extends EntityPathBase<Performance> {

    private static final long serialVersionUID = -2137927922L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPerformance performance = new QPerformance("performance");

    public final QBaseModel _super;

    public final org.bson.types.QObjectId collectorItemId;

    public final org.bson.types.QObjectId executionId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final MapPath<String, Object, SimplePath<Object>> metrics = this.<String, Object, SimplePath<Object>>createMap("metrics", String.class, Object.class, SimplePath.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final EnumPath<PerformanceType> type = createEnum("type", PerformanceType.class);

    public final StringPath url = createString("url");

    public final StringPath version = createString("version");

    public QPerformance(String variable) {
        this(Performance.class, forVariable(variable), INITS);
    }

    public QPerformance(Path<? extends Performance> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPerformance(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPerformance(PathMetadata<?> metadata, PathInits inits) {
        this(Performance.class, metadata, inits);
    }

    public QPerformance(Class<? extends Performance> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.executionId = inits.isInitialized("executionId") ? new org.bson.types.QObjectId(forProperty("executionId")) : null;
        this.id = _super.id;
    }

}

