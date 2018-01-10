package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCollector is a Querydsl query type for Collector
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCollector extends EntityPathBase<Collector> {

    private static final long serialVersionUID = 953199339L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCollector collector = new QCollector("collector");

    public final QBaseModel _super;

    public final MapPath<String, Object, SimplePath<Object>> allFields = this.<String, Object, SimplePath<Object>>createMap("allFields", String.class, Object.class, SimplePath.class);

    public final EnumPath<CollectorType> collectorType = createEnum("collectorType", CollectorType.class);

    public final BooleanPath enabled = createBoolean("enabled");

    public final ListPath<CollectionError, QCollectionError> errors = this.<CollectionError, QCollectionError>createList("errors", CollectionError.class, QCollectionError.class, PathInits.DIRECT2);

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Long> lastExecuted = createNumber("lastExecuted", Long.class);

    public final StringPath name = createString("name");

    public final BooleanPath online = createBoolean("online");

    public final MapPath<String, Object, SimplePath<Object>> uniqueFields = this.<String, Object, SimplePath<Object>>createMap("uniqueFields", String.class, Object.class, SimplePath.class);

    public QCollector(String variable) {
        this(Collector.class, forVariable(variable), INITS);
    }

    public QCollector(Path<? extends Collector> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCollector(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCollector(PathMetadata<?> metadata, PathInits inits) {
        this(Collector.class, metadata, inits);
    }

    public QCollector(Class<? extends Collector> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.id = _super.id;
    }

}

