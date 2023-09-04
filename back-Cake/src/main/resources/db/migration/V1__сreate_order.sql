CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
create table if not exists clients
(
    name        varchar     not null,
    tel_number  varchar     not null,
    UNIQUE      (name),
    PRIMARY KEY (name)
);
create table if not exists caketypes
(
    cake_name        varchar     not null,
    UNIQUE      (cake_name),
    PRIMARY KEY (cake_name)
);
create table if not exists orders
(
    id          uuid         not null,
    client      varchar,
    cake_type   varchar,
    weight       float         not null,
    date         date        not null,
    UNIQUE      (id),
    PRIMARY KEY (id)
);
ALTER TABLE orders ADD CONSTRAINT fk_clients FOREIGN KEY (client) references clients(name),
    ADD CONSTRAINT fk_cakeType FOREIGN KEY (cake_type) references caketypes(cake_name)
