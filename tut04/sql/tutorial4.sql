create table drug
(
    id         int          not null
        primary key,
    drug_name  varchar(255) null,
    drug_price double       not null
);

create table drug_list
(
    id            int not null
        primary key,
    drug_quantity int not null,
    drug_id       int null,
    constraint drug_FK
        foreign key (drug_id) references drug (id)
);

create table drug_list_sequence
(
    next_val bigint null
);

create table drug_sequence
(
    next_val bigint null
);

create table medical_record_sequence
(
    next_val bigint null
);

create table patient
(
    id           int          not null
        primary key,
    address      varchar(255) null,
    blood_type   varchar(255) null,
    name         varchar(255) null,
    phone_number varchar(255) null
);

create table medical_record
(
    id             int          not null
        primary key,
    disease        varchar(255) null,
    treatment_date date         null,
    treatment_note varchar(255) null,
    patient_id     int          not null,
    drug_list_id   int          null,
    constraint drug_list_FK
        foreign key (drug_list_id) references drug_list (id),
    constraint FKt0lf3feuiurr73bpln2n6x0v
        foreign key (patient_id) references patient (id)
);

create table patient_sequence
(
    next_val bigint null
);




