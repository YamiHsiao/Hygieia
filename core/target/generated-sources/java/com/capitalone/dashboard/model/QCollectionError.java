package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCollectionError is a Querydsl query type for CollectionError
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QCollectionError extends BeanPath<CollectionError> {

    private static final long serialVersionUID = -2126592536L;

    public static final QCollectionError collectionError = new QCollectionError("collectionError");

    public final StringPath errorCode = createString("errorCode");

    public final StringPath errorMessage = createString("errorMessage");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public QCollectionError(String variable) {
        super(CollectionError.class, forVariable(variable));
    }

    public QCollectionError(Path<? extends CollectionError> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCollectionError(PathMetadata<?> metadata) {
        super(CollectionError.class, metadata);
    }

}

