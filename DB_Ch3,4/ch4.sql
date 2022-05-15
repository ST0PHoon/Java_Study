#pg5 ~ 이건 워크밴치에서 수동으로 생성해 볼것
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
delete from hubo where kiho >0;		#기존에 있던 hubo 테이블에서 kiho가 0이상인 값 삭제
# 후보별 번호, 이름, 공약 입력
insert into hubo values (1, "나연", "넷플릭스 무료");
insert into hubo values (2, "정연", "대중교통 24시간 운행");
insert into hubo values (3, "모모", "재택근무");
insert into hubo values (4, "사나", "식비지원");
insert into hubo values (5, "지효", "고기 가격 인하");
insert into hubo values (6, "미나", "사람 살기 좋은 세상");
insert into hubo values (7, "다현", "유튜브 프라임 무료");
insert into hubo values (8, "채영", "누워서 게임할 수 있는 환경 제공");
insert into hubo values (9, "쯔위", "배달비 무료");
# kiho를 기호로, name을 성명으로, gongyak을 공약으로 hubo를 참조하여 출력
select kiho as 기호, name as 성명, gongyak as 공약 from hubo;

#pg8
#기존에 있던 tupyo 테이블에서 kiho가 0이상인 값 삭제
delete from tupyo where kiho>0;
# insert_tupyo 프로시저 삭제
drop procedure if exists insert_tupyo;
# insert_tupyo프로시저 선언, _limit(정수형)을 인수로 받는다.
delimiter $$
create procedure insert_tupyo(_limit integer)
begin
declare _cnt integer;	#카운트용 변수 선언
set _cnt=0;	#변수에 0입력
	_loop: loop	#루프선언
		set _cnt=_cnt+1;	 #카운트변수에 1증가
        #tupyo 테이블에 rand()*8+1 2개입력, 하나는 선택한 후보, 하나는 연력대 (1부터9까지 랜덤 생성)
        insert into tupyo value (rand()*8+1, rand()*8+1);
        # 입력받은 인수 만큼 실행하고 루프문 종료하는 if선언
        if _cnt = _limit then
			leave _loop;
		end if;
	end loop _loop;
end $$
call insert_tupyo(1000);	#1000명의 투표자 (선택후보, 연령)을 입력한다.
#tupyo 테이블에서 kiho를 투표한 기호, age를 투표자연력으로 출력한다.
select kiho as 투표한기호, age as 투표자연령대 from tupyo;	

#pg9
# kiho를 기호로, name을 성명으로, gongyak을 공약으로 hubo를 참조하여 출력
select kiho as 기호, name as 성명, gongyak as 공약 from hubo;
#tupyo 테이블에서 kiho를 투표한 기호, age를 투표자연력으로 출력한다.
select kiho as 투표한기호, age as 투표자연령대 from tupyo;

#pg10
# tupyo 테이블에서 기호를 기준으로, 기호와 기호 개수를 출력한다.
select kiho, count(*) from tupyo group by kiho;

#pg11
# tupyo를 a, hubo를 b로 선언후 join, a와 b의 kiho가 동일할 경우, a의 kiho를 기준으로 묶어서
# b의 name을 후보, b의 gongyak을 공약, a의 기호수를 득표로 출력한다.
select b.name as 후보, b.gongyak as 공약, count(a.kiho) as 득표 from tupyo as a, hubo as b 
												where a.kiho = b.kiho group by a.kiho;
                                                
#pg12
# tupyo 테이블을 a로 칭하고, a의 kiho를 기준으로 묶어서, hubo테이블의 kiho와 a의 kiho가 똑같은 경우에 hubo의 name을 출력
# hubo테이블의 kiho와 a의 kiho가 똑같은 경우에 hubo의 gongyak을 출력, a의 kiho수를 출력한다.
select (select name from hubo where kiho = a.kiho), (select gongyak from hubo where kiho = a.kiho), 
														count(a.kiho) from tupyo as a group by a.kiho;

#pg13
drop table if exists tupyo2;	#기존에 있던 tupyo2테이블을 삭제한다.
# tupyo2 테이블을 생성한다.(kiho1, kiho2, kiho3, age)를 가진다.
create table tupyo2(kiho1 int, kiho2 int, kiho3 int, age int);
desc tupyo2;
# 기존에 있던 insert_tupyo2 프로시저를 
drop procedure if exists insert_tupyo2;
delimiter $$
create procedure insert_tupyo2(_limit integer)	#몇번 돌릴지 인수로 받는 프로시저 선언
begin
declare _cnt integer;	#카운트용 변수 선언
set _cnt=0;	# 변수에 0 입력
	_loop: loop	#루프문 선언
		set _cnt=_cnt+1;	#카운트에 1 증가
        # tupyo2테이블에 연령, 후보1, 후보2, 후보3 입력
        insert into tupyo2 value (rand()*8+1, rand()*8+1, rand()*8+1, rand()*8+1);
        # 입력받은 수 만큼 루프문 돌고 종료
        if _cnt = _limit then
			leave _loop;
		end if;
	end loop _loop;
end $$
call insert_tupyo2(1000);	#1000명의 투표실행
select * from tupyo2;	#결과 출력

#pg14
#1방법
# tupyo2(a),hubo(h1, h2, h3) 로 join, kiho1과 h1의 kiho가 같고, kiho2와 h2의 kiho가 같고, kiho3와 h3의 kiho가 같으면
# tupyo2의 이름, h1의 이름을 투표1로, h2의 이름을 투표2로, h3의 이름을 투표3로 출력한다.
select a.age, h1.name as 투표1, h2.name as 투표2, h3.name as 투표3
	from tupyo2 as a, hubo as h1, hubo as h2, hubo as h3
	where a.kiho1 = h1.kiho and a.kiho2 = h2.kiho and a.kiho3 = h3.kiho;
#2방법
# tupyo2(a)에 대해서 나이, hubo의 kiho가 kiho1, 2, 3과 동일할 경우 투표1, 투표2, 투표3으로 출력
select a.age,
	(select name from hubo where a.kiho1 = kiho) as "투표1",
	(select name from hubo where a.kiho2 = kiho) as "투표2",
	(select name from hubo where a.kiho3 = kiho) as "투표3"
from tupyo2 as a;

#pg15, 후보별로 득표수를 출력하는 select문 작성, kiho1,2,3이 모두 해당 후보의 번호와 동일하면 count한다.
select
	(select count(*) from tupyo2 where kiho1 = 1 or kiho2 = 1 or kiho3 = 1) as "나연",
	(select count(*) from tupyo2 where kiho1 = 2 or kiho2 = 2 or kiho3 = 2) as "정연",
    (select count(*) from tupyo2 where kiho1 = 3 or kiho2 = 3 or kiho3 = 3) as "모모",
    (select count(*) from tupyo2 where kiho1 = 4 or kiho2 = 4 or kiho3 = 4) as "사나",
    (select count(*) from tupyo2 where kiho1 = 5 or kiho2 = 5 or kiho3 = 5) as "지효",
    (select count(*) from tupyo2 where kiho1 = 6 or kiho2 = 6 or kiho3 = 6) as "미나",
    (select count(*) from tupyo2 where kiho1 = 7 or kiho2 = 7 or kiho3 = 7) as "다현",
    (select count(*) from tupyo2 where kiho1 = 8 or kiho2 = 8 or kiho3 = 8) as "채영",
    (select count(*) from tupyo2 where kiho1 = 9 or kiho2 = 9 or kiho3 = 9) as "쯔위";
    
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

#리포트 테이블에 넣기
insert into reporttable
select distinct b.stu_name, b.stu_id, # 중복제거
	(select a.score from scoring as a where a.subjectID = 1 and b.stu_id = a.stu_id ) as kor,
	(select a.score from scoring as a where a.subjectID = 2 and b.stu_id = a.stu_id ) as eng,
    (select a.score from scoring as a where a.subjectID = 3 and b.stu_id = a.stu_id ) as mat
from scoring as b;

#최종 리포트
select *, (b.kor+b.eng+b.mat) as sum, (b.kor+b.eng+b.mat)/3 as ave,
	(select count(*) + 1 from reporttable as a where (a.kor + a.eng + a.mat) > (b.kor + b.eng + b.mat)) as ranking from reporttable as b
		order by ranking;
        
#마지막으로 각 과목별,문제별 득점자수와 득점률 리포트를 작성하시오. 수정중
# 득점자수 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 수정중 
drop procedure if exists create_score_list;
DELIMITER $$
create procedure create_score_list()
begin
declare _cnt_sub int;

drop table score_list;
create table score_list (
	subjectId int,
    q_number varchar(10),
    correct_num int,
    correct_rate double);

 set _cnt_sub=0;

	_loop2: loop
	 set _cnt_sub=_cnt_sub+1;
		insert into score_list select subjectID, 'a01', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a01 = 1;
		insert into score_list select subjectID, 'a02', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a02 = 1;
		insert into score_list select subjectID, 'a03', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a03 = 1;
		insert into score_list select subjectID, 'a04', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a04 = 1;
        insert into score_list select subjectID, 'a05', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a05 = 1;
		insert into score_list select subjectID, 'a06', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a06 = 1;
        insert into score_list select subjectID, 'a07', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a07 = 1;
		insert into score_list select subjectID, 'a08', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a08 = 1;
        insert into score_list select subjectID, 'a09', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a09 = 1;
		insert into score_list select subjectID, 'a10', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a10 = 1;
        insert into score_list select subjectID, 'a11', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a11 = 1;
		insert into score_list select subjectID, 'a12', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a12 = 1;
        insert into score_list select subjectID, 'a13', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a13 = 1;
		insert into score_list select subjectID, 'a14', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a14 = 1;
        insert into score_list select subjectID, 'a15', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a15 = 1;
		insert into score_list select subjectID, 'a16', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a16 = 1;
        insert into score_list select subjectID, 'a17', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a17 = 1;
		insert into score_list select subjectID, 'a18', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a18 = 1;
        insert into score_list select subjectID, 'a19', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a19 = 1;
		insert into score_list select subjectID, 'a20', count(*), count(*)/10 from scoring where subjectID = _cnt_sub and a20 = 1;
        
		if _cnt_sub = 3 then
			leave _loop2;
		end if;
	end loop _loop2;

select subjectId as 과목, q_number as 문제, correct_num as 득점자, correct_rate as 득점률 from score_list ;
end $$
call create_score_list();



#리조트
#reservation table
drop table reservation;
create table reservation (
	name varchar(10),
    reserve_date date,
    room int,
    addr varchar(100),
    tel varchar(20),
    ipgum_name varchar(10),
    memo varchar(100),
    input_date date);
#임의 값 넣기
insert into reservation values ("정연","2022-05-26",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("모모","2022-05-27",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("모모","2022-05-29",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("채영","2022-05-30",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("정연","2022-06-01",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("모모","2022-06-02",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("사나","2022-06-03",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("지효","2022-06-04",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("나연","2022-06-05",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("정연","2022-06-06",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("모모","2022-06-10",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("사나","2022-06-11",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("지효","2022-06-12",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("나연","2022-06-13",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("정연","2022-06-14",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("모모","2022-06-15",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("사나","2022-06-16",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("나연","2022-06-18",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("모모","2022-06-28",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("사나","2022-06-29",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("나연","2022-06-30",1,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("모모","2022-05-27",2,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
#insert into reservation values ("다현","2022-05-29",2,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("지효","2022-06-04",2,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("지효","2022-06-17",2,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("지효","2022-06-12",3,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));
insert into reservation values ("지효","2022-06-29",3,"서울","010-0101-0101","나연","따뜻한방 주세요",DATE_FORMAT(NOW(),'%Y-%m-%d'));

#1달간 예약보기 위한 프로시저
drop procedure if exists resvstat_calc;
delimiter $$
create procedure resvstat_calc()
begin
	declare _date date;
    declare _cnt integer;
    declare _room1 varchar(20);
    declare _room2 varchar(20);
    declare _room3 varchar(20);
    
	set _date=now();
	##################################################################################################
    drop table if  exists reserv_stat;
    create table reserv_stat(
		reserve_date date not null,
        room1 varchar(20),
        room2 varchar(20),
        room3 varchar(20),
		primary key(reserve_date));
	##################################################################################################
    #테이블을 돌면서 날짜가 똑같고 room 넘버가 동일하면 이름을 입력해라.
    insert into reserv_stat
    select distinct b.reserve_date,
		(select ifnull((select b.name from reservation as a where b.reserve_date = a.reserve_date and 1 = a.room), '예약가능')),
		(select ifnull((select b.name from reservation as a where b.reserve_date = a.reserve_date and 2 = a.room), '예약가능')),
		(select ifnull((select b.name from reservation as a where b.reserve_date = a.reserve_date and 3 = a.room), '예약가능'))
	from reservation as b
    where b.reserve_date BETWEEN DATE_FORMAT(NOW(),'%Y-%m-%d') AND DATE_FORMAT(DATE_ADD(NOW(), INTERVAL 1 MONTH),'%Y-%m-%d'); 
	##################################################################################################
    select * from reserv_stat;
end $$

call resvstat_calc();


