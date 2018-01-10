package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QIncident is a Querydsl query type for Incident
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QIncident extends EntityPathBase<Incident> {

    private static final long serialVersionUID = 1719542452L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIncident incident = new QIncident("incident");

    public final QBaseModel _super;

    public final StringPath affectedItem = createString("affectedItem");

    public final StringPath category = createString("category");

    public final StringPath closedBy = createString("closedBy");

    public final StringPath closedTime = createString("closedTime");

    public final StringPath closureCode = createString("closureCode");

    public final org.bson.types.QObjectId collectorItemId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath incidentDescription = createString("incidentDescription");

    public final StringPath incidentID = createString("incidentID");

    public final StringPath incidentItem = createString("incidentItem");

    public final StringPath openedBy = createString("openedBy");

    public final StringPath openTime = createString("openTime");

    public final StringPath primaryAssignmentGroup = createString("primaryAssignmentGroup");

    public final StringPath severity = createString("severity");

    public final StringPath status = createString("status");

    public final StringPath timestamp = createString("timestamp");

    public final StringPath updatedTime = createString("updatedTime");

    public final BooleanPath validIncidentItem = createBoolean("validIncidentItem");

    public QIncident(String variable) {
        this(Incident.class, forVariable(variable), INITS);
    }

    public QIncident(Path<? extends Incident> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QIncident(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QIncident(PathMetadata<?> metadata, PathInits inits) {
        this(Incident.class, metadata, inits);
    }

    public QIncident(Class<? extends Incident> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
    }

}

