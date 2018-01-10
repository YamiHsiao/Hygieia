package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCmdb is a Querydsl query type for Cmdb
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCmdb extends EntityPathBase<Cmdb> {

    private static final long serialVersionUID = 1154205002L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCmdb cmdb = new QCmdb("cmdb");

    public final StringPath appServiceOwner = createString("appServiceOwner");

    public final StringPath appServiceOwnerUserName = createString("appServiceOwnerUserName");

    public final StringPath assignmentGroup = createString("assignmentGroup");

    public final StringPath businessOwner = createString("businessOwner");

    public final StringPath businessOwnerUserName = createString("businessOwnerUserName");

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath commonName = createString("commonName");

    public final StringPath configurationItem = createString("configurationItem");

    public final StringPath configurationItemSubType = createString("configurationItemSubType");

    public final StringPath configurationItemType = createString("configurationItemType");

    public final StringPath developmentOwner = createString("developmentOwner");

    public final StringPath developmentOwnerUserName = createString("developmentOwnerUserName");

    public final org.bson.types.QObjectId id;

    public final StringPath itemType = createString("itemType");

    public final StringPath ownerDept = createString("ownerDept");

    public final StringPath supportOwner = createString("supportOwner");

    public final StringPath supportOwnerUserName = createString("supportOwnerUserName");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final BooleanPath validConfigItem = createBoolean("validConfigItem");

    public QCmdb(String variable) {
        this(Cmdb.class, forVariable(variable), INITS);
    }

    public QCmdb(Path<? extends Cmdb> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCmdb(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCmdb(PathMetadata<?> metadata, PathInits inits) {
        this(Cmdb.class, metadata, inits);
    }

    public QCmdb(Class<? extends Cmdb> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = inits.isInitialized("id") ? new org.bson.types.QObjectId(forProperty("id")) : null;
    }

}

