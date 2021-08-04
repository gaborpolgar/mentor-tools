DROP TABLE if EXISTS trainingclasses;
create table trainingclasses (id bigint auto_increment primary key,
title VARCHAR (255),
start_date DATE,
end_date DATE);
insert into trainingclasses (title, start_date, end_date) values ('nemazénosztályom', '2020-10-01', '2021-05-01');