create table if not exists bookings
(
    book_ref     serial not null
        constraint bookings_pk
        primary key,
    book_date    date default now(),
    total_amount numeric
);

comment on table  bookings is 'бронирование';

alter table bookings
    owner to admin;

-- auto-generated definition
create table if not exists tickets
(
    ticket_no      serial       not null
        constraint tickets_pk
            primary key,
    book_ref       integer
        constraint tickets_bookings_book_ref_fk
            references bookings
            on update cascade on delete cascade,
    passenger_id   integer      not null,
    passenger_name varchar(200) not null,
    concat_data    varchar(100)
);

comment on table tickets is 'билеты';

alter table tickets
    owner to admin;


create table aircrafts_data
(
    aircraft_code char(3) not null
        constraint aircrafts_pkey
            primary key,
    model jsonb not null,
    range integer not null
        constraint aircrafts_range_check
            check (range > 0)
);



