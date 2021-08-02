DROP TABLE if EXISTS trainingclass;
create table trainingclasses (id bigint auto_increment primary key,
title VARCHAR (255),
start_time DATE,
end_time DATE);
insert into trainingclasses (title) values ('nemazénosztályom');