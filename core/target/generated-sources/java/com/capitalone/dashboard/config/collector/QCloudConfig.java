package com.capitalone.dashboard.config.collector;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCloudConfig is a Querydsl query type for CloudConfig
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCloudConfig extends EntityPathBase<CloudConfig> {

    private static final long serialVersionUID = -1249096185L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCloudConfig cloudConfig = new QCloudConfig("cloudConfig");

    public final com.capitalone.dashboard.model.QCollectorItem _super;

    public final NumberPath<Integer> ageAlert = createNumber("ageAlert", Integer.class);

    public final NumberPath<Integer> ageError = createNumber("ageError", Integer.class);

    public final StringPath cloudProvider = createString("cloudProvider");

    // inherited
    public final com.capitalone.dashboard.model.QCollector collector;

    // inherited
    public final org.bson.types.QObjectId collectorId;

    public final NumberPath<Double> cpuAlert = createNumber("cpuAlert", Double.class);

    public final NumberPath<Double> cpuError = createNumber("cpuError", Double.class);

    //inherited
    public final StringPath description;

    public final NumberPath<Long> diskioAlert = createNumber("diskioAlert", Long.class);

    public final NumberPath<Long> diskioError = createNumber("diskioError", Long.class);

    //inherited
    public final BooleanPath enabled;

    //inherited
    public final StringPath environment;

    //inherited
    public final NumberPath<Integer> errorCount;

    //inherited
    public final ListPath<com.capitalone.dashboard.model.CollectionError, com.capitalone.dashboard.model.QCollectionError> errors;

    // inherited
    public final org.bson.types.QObjectId id;

    //inherited
    public final NumberPath<Long> lastUpdated;

    public final NumberPath<Double> memoryAlert = createNumber("memoryAlert", Double.class);

    public final NumberPath<Double> memoryError = createNumber("memoryError", Double.class);

    public final NumberPath<Long> networkioAlert = createNumber("networkioAlert", Long.class);

    public final NumberPath<Long> networkioError = createNumber("networkioError", Long.class);

    //inherited
    public final StringPath niceName;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> options;

    //inherited
    public final BooleanPath pushed;

    public final ListPath<com.capitalone.dashboard.model.NameValue, com.capitalone.dashboard.model.QNameValue> tags = this.<com.capitalone.dashboard.model.NameValue, com.capitalone.dashboard.model.QNameValue>createList("tags", com.capitalone.dashboard.model.NameValue.class, com.capitalone.dashboard.model.QNameValue.class, PathInits.DIRECT2);

    public QCloudConfig(String variable) {
        this(CloudConfig.class, forVariable(variable), INITS);
    }

    public QCloudConfig(Path<? extends CloudConfig> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCloudConfig(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCloudConfig(PathMetadata<?> metadata, PathInits inits) {
        this(CloudConfig.class, metadata, inits);
    }

    public QCloudConfig(Class<? extends CloudConfig> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new com.capitalone.dashboard.model.QCollectorItem(type, metadata, inits);
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

