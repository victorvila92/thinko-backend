create table organization
(
    id         serial       not null
        constraint organization_pkey primary key,
    name       varchar(255) not null,
    status     varchar(20)  not null default 'ACTIVE',
    language   varchar      not null default 'ENG',
    created_at timestamp    not null default CURRENT_DATE
);

create table curriculum
(
    id              serial    not null,
    organization_id bigint    not null,
    cv_data         jsonb,
    created_at      timestamp not null default CURRENT_DATE,
    primary key (id, organization_id),
    CONSTRAINT fk_cv_org
        FOREIGN KEY (organization_id)
            REFERENCES organization (id)
);

create table session_period
(
    id              bigint not null,
    name            varchar,
    course          integer,
    cv_id           bigint    not null,
    period_id       bigint not null,
    organization_id bigint not null,
    url             varchar,
    created_at      timestamp not null default CURRENT_DATE,
    last_seen      timestamp not null default CURRENT_DATE,
    primary key (id, period_id, cv_id, course, organization_id),
    CONSTRAINT fk_session_cv
        FOREIGN KEY (cv_id, organization_id)
            REFERENCES curriculum (id, organization_id),
    CONSTRAINT fk_session_org
        FOREIGN KEY (organization_id)
            REFERENCES organization (id)
);