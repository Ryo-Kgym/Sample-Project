drop table if exists operator;
create table operator
(
    operator_id   serial not null primary key,
    operator_name text
);

comment on table operator is 'オペレータ';
comment on column operator.operator_id is 'オペレータID';
comment on column operator.operator_name is 'オペレータ名';

