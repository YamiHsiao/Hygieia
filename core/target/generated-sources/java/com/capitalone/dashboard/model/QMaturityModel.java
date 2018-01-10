package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMaturityModel is a Querydsl query type for MaturityModel
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMaturityModel extends EntityPathBase<MaturityModel> {

    private static final long serialVersionUID = -495403658L;

    public static final QMaturityModel maturityModel = new QMaturityModel("maturityModel");

    public final StringPath profile = createString("profile");

    public final StringPath rules = createString("rules");

    public QMaturityModel(String variable) {
        super(MaturityModel.class, forVariable(variable));
    }

    public QMaturityModel(Path<? extends MaturityModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMaturityModel(PathMetadata<?> metadata) {
        super(MaturityModel.class, metadata);
    }

}

