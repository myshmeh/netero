create table deliverable (
    training_id int not null,
    content int not null,
    created_at timestamp default now(),
    constraint primary_key_deliverable primary key (training_id, created_at),
    foreign key (training_id) references training(training_id) on delete cascade
);