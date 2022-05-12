create table votetwo(
	name varchar(20),
    age int);

delete from votetwo where age > 0;
insert into votetwo values("나연", rand()*8+1);
insert into votetwo values("정연", rand()*8+1);
insert into votetwo values("모모", rand()*8+1);
insert into votetwo values("사나", rand()*8+1);
insert into votetwo values("지효", rand()*8+1);
insert into votetwo values("미나", rand()*8+1);
insert into votetwo values("다현", rand()*8+1);
insert into votetwo values("채영", rand()*8+1);
insert into votetwo values("쯔위", rand()*8+1);

select * from votetwo;

select count(*) from votetwo;
select name, count(name), count(name)/(select count(*) from votetwo)*100 as rate from votetwo group by name;
select name, count(name) as cnt, count(name)/(select count(*) from votetwo)*100 as rate from votetwo group by name order by cnt desc;
select name, age*10 as 연령대, count(age) as 득표수, count(age)/(select count(*) from votetwo where name = "나연")*100 as 득표율 from votetwo where name = "나연" group by age;
