#pg5 ~
drop table if exists hubo;
create table hubo(
	kiho int not null,
    name varchar(10),
    gongyak varchar(50),
    primary key(kiho));
desc hubo;

drop table if exists tupyo;
create table tupyo(
	kiho int,
    age int,
    foreign key(kiho) references hubo(kiho));
desc tupyo;

#pg7
delete from hubo where kiho >0;
insert into hubo values (1, "나연", "넷플릭스 무료");
insert into hubo values (2, "정연", "대중교통 24시간 운행");
insert into hubo values (3, "모모", "재택근무");
insert into hubo values (4, "사나", "식비지원");
insert into hubo values (5, "지효", "고기 가격 인하");
insert into hubo values (6, "미나", "사람 살기 좋은 세상");
insert into hubo values (7, "다현", "유튜브 프라임 무료");
insert into hubo values (8, "채영", "누워서 게임할 수 있는 환경 제공");
insert into hubo values (9, "쯔위", "배달비 무료");
select kiho as 기호, name as 성명, gongyak as 공약 from hubo;

#pg8
delete from tupyo where kiho>0;
drop procedure if exists insert_tupyo;
delimiter $$
create procedure insert_tupyo(_limit integer)
begin
declare _cnt integer;
set _cnt=0;
	_loop: loop
		set _cnt=_cnt+1;
        insert into tupyo value (rand()*8+1, rand()*8+1);
        if _cnt = _limit then
			leave _loop;
		end if;
	end loop _loop;
end $$
call insert_tupyo(1000);
select kiho as 투표한기호, age as 투표자연령대 from tupyo;

#pg9
select kiho as 기호, name as 성명, gongyak as 공약 from hubo;
select kiho as 투표한기호, age as 투표자연령대 from tupyo;

#pg10
select kiho, count(*) from tupyo group by kiho;

#pg11
select b.name as 후보, b.gongyak as 공약, count(a.kiho) as 득표 from tupyo as a, hubo as b 
												where a.kiho = b.kiho group by a.kiho;
                                                
#pg12
select (select name from hubo where kiho = a.kiho), (select gongyak from hubo where kiho = a.kiho), 
														count(a.kiho) from tupyo as a group by a.kiho;

#pg13
drop table if exists tupyo2;
create table tupyo2(kiho1 int, kiho2 int, kiho3 int, age int);
desc tupyo2;

drop procedure if exists insert_tupyo2;
delimiter $$
create procedure insert_tupyo2(_limit integer)
begin
declare _cnt integer;
set _cnt=0;
	_loop: loop
		set _cnt=_cnt+1;
        insert into tupyo2 value (rand()*8+1, rand()*8+1, rand()*8+1, rand()*8+1);
        if _cnt = _limit then
			leave _loop;
		end if;
	end loop _loop;
end $$
call insert_tupyo2(1000);
select * from tupyo2;

#pg14
#1방법
select a.age, h1.name as 투표1, h2.name as 투표2, h3.name as 투표3
	from tupyo2 as a, hubo as h1, hubo as h2, hubo as h3
	where a.kiho1 = h1.kiho and a.kiho2 = h2.kiho and a.kiho3 = h3.kiho;
#2방법
select 
	a.age,
	(select name from hubo where a.kiho1 = kiho) as "투표1",
	(select name from hubo where a.kiho2 = kiho) as "투표2",
	(select name from hubo where a.kiho3 = kiho) as "투표3"
from tupyo2 as a;

#pg15
select
	(select count(*) from tupyo2 where kiho1 = 1 or kiho2 = 1 or kiho3 = 1) as "나연",
	(select count(*) from tupyo2 where kiho1 = 2 or kiho2 = 2 or kiho3 = 2) as "정연",
    (select count(*) from tupyo2 where kiho1 = 3 or kiho2 = 1 or kiho3 = 1) as "모모",
    (select count(*) from tupyo2 where kiho1 = 4 or kiho2 = 1 or kiho3 = 1) as "사나",
    (select count(*) from tupyo2 where kiho1 = 5 or kiho2 = 1 or kiho3 = 1) as "지효",
    (select count(*) from tupyo2 where kiho1 = 6 or kiho2 = 1 or kiho3 = 1) as "미나",
    (select count(*) from tupyo2 where kiho1 = 7 or kiho2 = 1 or kiho3 = 1) as "다현",
    (select count(*) from tupyo2 where kiho1 = 8 or kiho2 = 1 or kiho3 = 1) as "채영",
    (select count(*) from tupyo2 where kiho1 = 9 or kiho2 = 1 or kiho3 = 1) as "쯔위";
    
#pg16
select
	(select count(*) from tupyo2 where kiho1 = 1 or kiho2 = 1 or kiho3 = 1) as "나연",
	(select count(*) from tupyo2 where kiho1 = 2 or kiho2 = 2 or kiho3 = 2) as "정연",
    (select count(*) from tupyo2 where kiho1 = 3 or kiho2 = 3 or kiho3 = 3) as "모모",
    (select count(*) from tupyo2 where kiho1 = 4 or kiho2 = 4 or kiho3 = 4) as "사나",
    (select count(*) from tupyo2 where kiho1 = 5 or kiho2 = 5 or kiho3 = 5) as "지효",
    (select count(*) from tupyo2 where kiho1 = 6 or kiho2 = 6 or kiho3 = 6) as "미나",
    (select count(*) from tupyo2 where kiho1 = 7 or kiho2 = 7 or kiho3 = 7) as "다현",
    (select count(*) from tupyo2 where kiho1 = 8 or kiho2 = 8 or kiho3 = 8) as "채영",
    (select count(*) from tupyo2 where kiho1 = 9 or kiho2 = 9 or kiho3 = 9) as "쯔위",
    (
		(select count(*) from tupyo2 where kiho1 = 1 or kiho2 = 1 or kiho3 = 1) +
		(select count(*) from tupyo2 where kiho1 = 2 or kiho2 = 2 or kiho3 = 2) +
		(select count(*) from tupyo2 where kiho1 = 3 or kiho2 = 3 or kiho3 = 3) +
		(select count(*) from tupyo2 where kiho1 = 4 or kiho2 = 4 or kiho3 = 4) +
		(select count(*) from tupyo2 where kiho1 = 5 or kiho2 = 5 or kiho3 = 5) +
		(select count(*) from tupyo2 where kiho1 = 6 or kiho2 = 6 or kiho3 = 6) +
		(select count(*) from tupyo2 where kiho1 = 7 or kiho2 = 7 or kiho3 = 7) +
		(select count(*) from tupyo2 where kiho1 = 8 or kiho2 = 8 or kiho3 = 8) +
		(select count(*) from tupyo2 where kiho1 = 9 or kiho2 = 9 or kiho3 = 9)
    ) as 총합,
    (select count(*) from tupyo2 where kiho1=kiho2 or kiho1=kiho3 or kiho2=kiho3) as 2중복,
    (select count(*) from tupyo2 where kiho1 = kiho2 and kiho2 = kiho3 ) as 3중복;
    
#pg17 
drop table if exists examtable_ch4;
create table examtable_ch4(
	name varchar(20),
    id int not null primary key,
    kor int, eng int, mat int);
desc examtable_ch4;

delete from examtable_ch4 where id > 0;

drop procedure if exists insert_examtable_ch4;
DELIMITER $$
create procedure insert_examtable_ch4(_limit integer)
begin
declare _name varchar(20);
declare _id integer;
declare _cnt integer;
set _cnt=0;
	_loop: loop
    set _cnt = _cnt+1;
    set _name = concat("정지", cast(_cnt as char(4)));
    set _id = 209900+ _cnt;
    
    insert into examtable_ch4 value (_name, _id, rand()*100,rand()*100,rand()*100);

	if _cnt = _limit then
		leave _loop;
	end if;
	end loop _loop;
end $$
call insert_examtable_ch4(1000);
select * from examtable_ch4;

#pg18
drop view if exists exmview;
create view exmview(name, id, kor, eng, mat, tot, ave, ran)
	as select *, b.kor+b.eng+b.mat, (b.kor+b.eng+b.mat)/3, (
		select count(*)+1 from examtable_ch4 as a where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat)
			) from examtable_ch4 as b;

#pg19
select * from exmview;
select name, ran from exmview;
select * from exmview where ran >5;		# ran가 5초과인 값이 출력된다.
insert into exmview values ("나연",309933,100,100,100,300,100,1); #값 추가 불가능

#pg20
drop table if exists examtableEX;
create table examtableEX(
	name varchar(20),
    id int not null primary key,
	kor int, eng int, mat int, sum int, ave double, ranking int);
desc examtableEX;
# insert에 select 사용해서 값 넣기
insert into examtableEX
	select *, b.kor+b.eng+b.mat, (b.kor+b.eng+b.mat)/3, (
		select count(*)+1 from examtable_ch4 as a where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat)
    ) from examtable_ch4 as b;
    
select * from examtableEX order by ranking desc;


#pg23
# 실습하기 - 시험처리
# 테이블 만들기
use kopoctc;
drop table if exists answer;
create table answer (
   subjectID int not null primary key,
    a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int, 
    a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int);
    
drop table if exists testing;
create table testing(
	subjectID int not null,
    stu_name varchar(20),
    stu_id int not null,
    a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int, 
    a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int,
    primary key(subjectID, stu_id));
    
drop table if exists scoring;
create table scoring(
	subjectID int not null,
    stu_name varchar(20),
    stu_id int not null,
    a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int, 
    a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int,
    score int,
    primary key(subjectID, stu_id));
    
drop table if exists reporttable;
create table reporttable(
    stu_name varchar(20),
    stu_id int not null primary key,
    kor int, eng int, mat int);
    
desc answer;
desc testing;
desc scoring;
desc reporttable;
# 답지 만들기
delete from answer where subjectID > 0;

drop procedure if exists insert_answer;
DELIMITER $$
create procedure insert_answer(_subId integer)
begin
	insert into answer values (_subId, 
    rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1,
    rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1);
end $$
call insert_answer(1);
call insert_answer(2);
call insert_answer(3);
# 시험자 1000명 넣기
delete from examtable_ch4 where id > 0;

drop procedure if exists insert_test;
DELIMITER $$
create procedure insert_test(_subId integer, _limit integer)
begin
    
declare _name varchar(20);
declare _id integer;
declare _cnt integer;
set _cnt=0;
	_loop: loop
    set _cnt = _cnt+1;
    set _name = concat("정지", cast(_cnt as char(4)));
    set _id = 209900+ _cnt;
    
    insert into testing values (_subId, _name, _id,
    rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1,
    rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1, rand()*4 + 1);

	if _cnt = _limit then
		leave _loop;
	end if;
	end loop _loop;
end $$
call insert_test(1,1000);
call insert_test(2,1000);
call insert_test(3,1000);

#채점
insert into scoring (subjectID, stu_name, stu_id, a01, a02, a03, a04, a05, a06, a07, a08, a09, a10,
											a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, score) 
select b.subjectID, b.stu_name, b.stu_id,
				(select count(*) from answer as a where a.a01 = b.a01 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a02 = b.a02 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a03 = b.a03 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a04 = b.a04 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a05 = b.a05 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a06 = b.a06 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a07 = b.a07 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a08 = b.a08 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a09 = b.a09 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a10 = b.a10 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a11 = b.a11 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a12 = b.a12 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a13 = b.a13 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a14 = b.a14 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a15 = b.a15 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a16 = b.a16 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a17 = b.a17 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a18 = b.a18 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a19 = b.a19 and a.subjectID = b.subjectID), 
                (select count(*) from answer as a where a.a20 = b.a20 and a.subjectID = b.subjectID),
                (
					(select count(*) from answer as a where a.a01 = b.a01 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a02 = b.a02 and a.subjectID = b.subjectID) + 
					(select count(*) from answer as a where a.a03 = b.a03 and a.subjectID = b.subjectID) + 
					(select count(*) from answer as a where a.a04 = b.a04 and a.subjectID = b.subjectID) + 
					(select count(*) from answer as a where a.a05 = b.a05 and a.subjectID = b.subjectID) + 
					(select count(*) from answer as a where a.a06 = b.a06 and a.subjectID = b.subjectID) + 
					(select count(*) from answer as a where a.a07 = b.a07 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a08 = b.a08 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a09 = b.a09 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a10 = b.a10 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a11 = b.a11 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a12 = b.a12 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a13 = b.a13 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a14 = b.a14 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a15 = b.a15 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a16 = b.a16 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a17 = b.a17 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a18 = b.a18 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a19 = b.a19 and a.subjectID = b.subjectID) +
					(select count(*) from answer as a where a.a20 = b.a20 and a.subjectID = b.subjectID)
                )*5
                from testing as b; 

