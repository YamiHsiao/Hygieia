package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QScopeOwnerCollectorItem is a Querydsl query type for ScopeOwnerCollectorItem
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QScopeOwnerCollectorItem extends EntityPathBase<ScopeOwnerCollectorItem> {

    private static final long serialVersionUID = -1718020961L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScopeOwnerCollectorItem scopeOwnerCollectorItem = new QScopeOwnerCollectorItem("scopeOwnerCollectorItem");

    public final QCollectorItem _super;

    public final StringPath assetState = createString("assetState");

    public final StringPath changeDate = createString("changeDate");

    // inherited
    public final QCollector collector;

    // inherited
    public final org.bson.types.QObjectId collectorId;

    //inherited
    public final StringPath description;

    //inherited
    public final BooleanPath enabled;

    //inherited
    public final StringPath environment;

    //inherited
    public final NumberPath<Integer> errorCount;

    //inherited
    public final ListPath<CollectionError, QCollectionError> errors;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath isDeleted = createString("isDeleted");

    //inherited
    public final NumberPath<Long> lastUpdated;

    public final StringPath name = createString("name");

    //inherited
    public final StringPath niceName;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> options;

    public final StringPath projectId = createString("projectId");

    //inherited
    public final BooleanPath pushed;

    public final StringPath teamId = createString("teamId");

    public QScopeOwnerCollectorItem(String variable) {
        this(ScopeOwnerCollectorItem.class, forVariable(variable), INITS);
    }

    public QScopeOwnerCollectorItem(Path<? extends ScopeOwnerCollectorItem> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QScopeOwnerCollectorItem(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QScopeOwnerCollectorItem(PathMetadata<?> metadata, PathInits inits) {
        this(ScopeOwnerCollectorItem.class, metadata, inits);
    }

    public QScopeOwnerCollectorItem(Class<? extends ScopeOwnerCollectorItem> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QCollectorItem(type, metadata, inits);
        this.collector = _super.collector;
        this.collectorId = _super.collectorId;
        this.description = _super.description;
        this.enabled = _super.enabled;
        this.environment = _super.environment;
        this.errorCount = _super.errorCount;
        this.errors = _super.errors;
        this.id = _super.id;
        this.lastUpdated = _super.lastUpdated;
        this.niceName = _super.niceName;
        this.options = _super.options;
        this.pushed = _super.pushed;
    }

}

