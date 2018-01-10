package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QApiToken is a Querydsl query type for ApiToken
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QApiToken extends EntityPathBase<ApiToken> {

    private static final long serialVersionUID = -1705284127L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QApiToken apiToken = new QApiToken("apiToken");

    public final QBaseModel _super;

    public final StringPath apiKey = createString("apiKey");

    public final StringPath apiUser = createString("apiUser");

    public final NumberPath<Long> expirationDt = createNumber("expirationDt", Long.class);

    public final BooleanPath hashed = createBoolean("hashed");

    // inherited
    public final org.bson.types.QObjectId id;

    public QApiToken(String variable) {
        this(ApiToken.class, forVariable(variable), INITS);
    }

    public QApiToken(Path<? extends ApiToken> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QApiToken(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QApiToken(PathMetadata<?> metadata, PathInits inits) {
        this(ApiToken.class, metadata, inits);
    }

    public QApiToken(Class<? extends ApiToken> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.id = _super.id;
    }

}

