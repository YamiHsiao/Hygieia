package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QChangeOrder is a Querydsl query type for ChangeOrder
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QChangeOrder extends EntityPathBase<ChangeOrder> {

    private static final long serialVersionUID = 1968115804L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChangeOrder changeOrder = new QChangeOrder("changeOrder");

    public final QBaseModel _super;

    public final StringPath approvalStatus = createString("approvalStatus");

    public final StringPath assignedTo = createString("assignedTo");

    public final StringPath assignmentGroup = createString("assignmentGroup");

    public final StringPath backoutDuration = createString("backoutDuration");

    public final StringPath category = createString("category");

    public final StringPath changeCoordinator = createString("changeCoordinator");

    public final StringPath changeID = createString("changeID");

    public final StringPath changeModel = createString("changeModel");

    public final StringPath changeOrderItem = createString("changeOrderItem");

    public final StringPath closeTime = createString("closeTime");

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath company = createString("company");

    public final StringPath coordinatorPhone = createString("coordinatorPhone");

    public final StringPath dateEntered = createString("dateEntered");

    public final StringPath extProjectRef = createString("extProjectRef");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath initiatedBy = createString("initiatedBy");

    public final BooleanPath open = createBoolean("open");

    public final StringPath phase = createString("phase");

    public final StringPath plannedEnd = createString("plannedEnd");

    public final StringPath plannedStart = createString("plannedStart");

    public final StringPath priority = createString("priority");

    public final StringPath reason = createString("reason");

    public final StringPath rFCType2 = createString("rFCType2");

    public final StringPath riskAssessment = createString("riskAssessment");

    public final StringPath sLAAgreementID = createString("sLAAgreementID");

    public final StringPath status = createString("status");

    public final StringPath subcategory = createString("subcategory");

    public final StringPath timestamp = createString("timestamp");

    public final StringPath title = createString("title");

    public final BooleanPath validChangeItem = createBoolean("validChangeItem");

    public QChangeOrder(String variable) {
        this(ChangeOrder.class, forVariable(variable), INITS);
    }

    public QChangeOrder(Path<? extends ChangeOrder> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QChangeOrder(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QChangeOrder(PathMetadata<?> metadata, PathInits inits) {
        this(ChangeOrder.class, metadata, inits);
    }

    public QChangeOrder(Class<? extends ChangeOrder> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
    }

}

