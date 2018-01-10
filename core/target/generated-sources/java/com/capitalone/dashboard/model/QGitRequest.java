package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QGitRequest is a Querydsl query type for GitRequest
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGitRequest extends EntityPathBase<GitRequest> {

    private static final long serialVersionUID = 423417791L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGitRequest gitRequest = new QGitRequest("gitRequest");

    public final StringPath baseSha = createString("baseSha");

    public final NumberPath<Long> closedAt = createNumber("closedAt", Long.class);

    public final org.bson.types.QObjectId collectorItemId;

    public final ListPath<Comment, QComment> comments = this.<Comment, QComment>createList("comments", Comment.class, QComment.class, PathInits.DIRECT2);

    public final StringPath commentsUrl = createString("commentsUrl");

    public final ListPath<Commit, QCommit> commits = this.<Commit, QCommit>createList("commits", Commit.class, QCommit.class, PathInits.DIRECT2);

    public final ListPath<CommitStatus, QCommitStatus> commitStatuses = this.<CommitStatus, QCommitStatus>createList("commitStatuses", CommitStatus.class, QCommitStatus.class, PathInits.DIRECT2);

    public final NumberPath<Long> createdAt = createNumber("createdAt", Long.class);

    public final StringPath headSha = createString("headSha");

    public final org.bson.types.QObjectId id;

    public final NumberPath<Long> mergedAt = createNumber("mergedAt", Long.class);

    public final StringPath number = createString("number");

    public final NumberPath<Long> numberOfChanges = createNumber("numberOfChanges", Long.class);

    public final StringPath orgName = createString("orgName");

    public final StringPath repoName = createString("repoName");

    public final StringPath requestType = createString("requestType");

    public final NumberPath<Long> resolutiontime = createNumber("resolutiontime", Long.class);

    public final StringPath reviewCommentsUrl = createString("reviewCommentsUrl");

    public final ListPath<Review, QReview> reviews = this.<Review, QReview>createList("reviews", Review.class, QReview.class, PathInits.DIRECT2);

    public final StringPath scmAuthor = createString("scmAuthor");

    public final StringPath scmBranch = createString("scmBranch");

    public final StringPath scmCommitLog = createString("scmCommitLog");

    public final NumberPath<Long> scmCommitTimestamp = createNumber("scmCommitTimestamp", Long.class);

    public final StringPath scmRevisionNumber = createString("scmRevisionNumber");

    public final StringPath scmUrl = createString("scmUrl");

    public final StringPath sourceBranch = createString("sourceBranch");

    public final StringPath sourceRepo = createString("sourceRepo");

    public final StringPath state = createString("state");

    public final StringPath targetBranch = createString("targetBranch");

    public final StringPath targetRepo = createString("targetRepo");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final NumberPath<Long> updatedAt = createNumber("updatedAt", Long.class);

    public final StringPath userId = createString("userId");

    public QGitRequest(String variable) {
        this(GitRequest.class, forVariable(variable), INITS);
    }

    public QGitRequest(Path<? extends GitRequest> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGitRequest(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGitRequest(PathMetadata<?> metadata, PathInits inits) {
        this(GitRequest.class, metadata, inits);
    }

    public QGitRequest(Class<? extends GitRequest> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = inits.isInitialized("id") ? new org.bson.types.QObjectId(forProperty("id")) : null;
    }

}

