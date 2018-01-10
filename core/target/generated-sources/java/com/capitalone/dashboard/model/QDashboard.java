package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QDashboard is a Querydsl query type for Dashboard
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDashboard extends EntityPathBase<Dashboard> {

    private static final long serialVersionUID = -1978152718L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDashboard dashboard = new QDashboard("dashboard");

    public final QBaseModel _super;

    public final ListPath<String, StringPath> activeWidgets = this.<String, StringPath>createList("activeWidgets", String.class, StringPath.class, PathInits.DIRECT2);

    public final QApplication application;

    public final StringPath configurationItemBusAppName = createString("configurationItemBusAppName");

    public final org.bson.types.QObjectId configurationItemBusAppObjectId;

    public final StringPath configurationItemBusServName = createString("configurationItemBusServName");

    public final org.bson.types.QObjectId configurationItemBusServObjectId;

    public final NumberPath<Integer> errorCode = createNumber("errorCode", Integer.class);

    public final StringPath errorMessage = createString("errorMessage");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath owner = createString("owner");

    public final ListPath<Owner, QOwner> owners = this.<Owner, QOwner>createList("owners", Owner.class, QOwner.class, PathInits.DIRECT2);

    public final BooleanPath remoteCreated = createBoolean("remoteCreated");

    public final StringPath template = createString("template");

    public final StringPath title = createString("title");

    public final EnumPath<DashboardType> type = createEnum("type", DashboardType.class);

    public final BooleanPath validAppName = createBoolean("validAppName");

    public final BooleanPath validServiceName = createBoolean("validServiceName");

    public final ListPath<Widget, QWidget> widgets = this.<Widget, QWidget>createList("widgets", Widget.class, QWidget.class, PathInits.DIRECT2);

    public QDashboard(String variable) {
        this(Dashboard.class, forVariable(variable), INITS);
    }

    public QDashboard(Path<? extends Dashboard> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDashboard(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDashboard(PathMetadata<?> metadata, PathInits inits) {
        this(Dashboard.class, metadata, inits);
    }

    public QDashboard(Class<? extends Dashboard> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.application = inits.isInitialized("application") ? new QApplication(forProperty("application")) : null;
        this.configurationItemBusAppObjectId = inits.isInitialized("configurationItemBusAppObjectId") ? new org.bson.types.QObjectId(forProperty("configurationItemBusAppObjectId")) : null;
        this.configurationItemBusServObjectId = inits.isInitialized("configurationItemBusServObjectId") ? new org.bson.types.QObjectId(forProperty("configurationItemBusServObjectId")) : null;
        this.id = _super.id;
    }

}

