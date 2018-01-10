package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCollItemCfgHist is a Querydsl query type for CollItemCfgHist
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCollItemCfgHist extends EntityPathBase<CollItemCfgHist> {

    private static final long serialVersionUID = 1026613349L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCollItemCfgHist collItemCfgHist = new QCollItemCfgHist("collItemCfgHist");

    public final QBaseModel _super;

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath currentName = createString("currentName");

    public final BooleanPath hasConfig = createBoolean("hasConfig");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath job = createString("job");

    public final StringPath jobUrl = createString("jobUrl");

    public final StringPath oldName = createString("oldName");

    public final EnumPath<ConfigHistOperationType> operation = createEnum("operation", ConfigHistOperationType.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final StringPath user = createString("user");

    public final StringPath userID = createString("userID");

    public QCollItemCfgHist(String variable) {
        this(CollItemCfgHist.class, forVariable(variable), INITS);
    }

    public QCollItemCfgHist(Path<? extends CollItemCfgHist> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCollItemCfgHist(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCollItemCfgHist(PathMetadata<?> metadata, PathInits inits) {
        this(CollItemCfgHist.class, metadata, inits);
    }

    public QCollItemCfgHist(Class<? extends CollItemCfgHist> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
    }

}

