create table deliverable_setting (
    training_id int not null primary key,
    target int not null,
    unit varchar(10) not null,
    created_at timestamp default now(),
    foreign key (training_id) references training(training_id) on delete cascade
);