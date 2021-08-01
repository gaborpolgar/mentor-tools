DROP TABLE if EXISTS trainingclass;
create table trainingclass (id bigint auto_increment primary key,
title VARCHAR (255),
start_date DATE,
end_date DATE);
insert into trainingclass (title) values ('nemazénosztályom');