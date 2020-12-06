create table training (
    training_id serial primary key,
    name varchar(100) not null,
    created_at timestamp default now()
);