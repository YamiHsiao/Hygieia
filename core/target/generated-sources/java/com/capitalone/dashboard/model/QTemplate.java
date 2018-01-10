package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTemplate is a Querydsl query type for Template
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTemplate extends EntityPathBase<Template> {

    private static final long serialVersionUID = 311011932L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTemplate template1 = new QTemplate("template1");

    public final QBaseModel _super;

    // inherited
    public final org.bson.types.QObjectId id;

    public final ListPath<String, StringPath> order = this.<String, StringPath>createList("order", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath template = createString("template");

    public final ListPath<String, StringPath> widgets = this.<String, StringPath>createList("widgets", String.class, StringPath.class, PathInits.DIRECT2);

    public QTemplate(String variable) {
        this(Template.class, forVariable(variable), INITS);
    }

    public QTemplate(Path<? extends Template> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTemplate(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTemplate(PathMetadata<?> metadata, PathInits inits) {
        this(Template.class, metadata, inits);
    }

    public QTemplate(Class<? extends Template> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.id = _super.id;
    }

}

