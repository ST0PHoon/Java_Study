#pg12
# 기존에 있는 get_sum 프로시저 삭제
DROP PROCEDURE IF EXISTS get_sum;
#프로시저 선언
DELIMITER $$
CREATE PROCEDURE get_sum(
	IN _id integer,		# 입력 값
    OUT _name varchar(20), # 출력 값
    OUT _sum integer	# 출력 값
) #인수로 받는 값과 출력하는 값 설정
BEGIN	# 계산 부분
	DECLARE _kor integer;	#_kor 변수 선언
    DECLARE _eng integer;	#_eng 변수 선언
    DECLARE _mat integer;	#_mat 변수 선언
    set _kor = 0; # declare로 선언하고 set으로 값을 넣는다. (예시용)
    #examtable에서 id와 _id가 같은 값의 이름, 국어, 영어, 수학 성적을 출력한다.
    select name, kor, eng, mat
		into _name, _kor, _eng, _mat from examtable where id=_id;
	# _sum 은 성적들의 합
	set _sum = _kor + _eng + _mat;
END $$
DELIMITER ;
#209901학번의 이름과 성적합을 출력
call get_sum(209901, @name, @sum);
select @name, @sum; #이름과 성적을 선택해서 출력한다.


#pg13
#동일명 함수 삭제 명령
DROP FUNCTION IF EXISTS f_get_sum;
DELIMITER $$
CREATE FUNCTION f_get_sum(_id integer) RETURNS integer #함수 선언, 인수와 리턴의 형태 설정
BEGIN
	DECLARE _sum integer; #_sum 선언
    SELECT kor+eng+mat INTO _sum FROM examtable WHERE id=_id; #examtable의 성적합읠 _sum에 입력한다. 입력 받은 id가 동일한 성적에 대해서
RETURN _sum; #_sum을 리턴한다.
END $$
DELIMITER ;
# examtable의 모든 값과 id값의 성적합(함수로 계산) - 이름:합으로 값을 출력한다.
select *, f_get_sum(id) as 합 from examtable;
#오류에 대한 수정 코드, 교수님이 친절하게 설명해 주셨다.
show global variables like 'log_gin_trust_function_creators';
SET Global log_bin_trust_function_creators = 'ON';


#pg14
drop table examtable;
create table examtable(
	name varchar(20),
    id int not null primary key,
    kor int, eng int, mat int);
#기존에 동일명의 함수가 있으면 삭제
DROP PROCEDURE IF EXISTS insert_examtable;
DELIMITER $$
CREATE PROCEDURE insert_examtable(_last integer) #프로시저 선언, 숫자형태의 _last를 변수로 받는다.
BEGIN
	DECLARE _name varchar(20);	#변수 선언 문자형
    DECLARE _id integer;		#변수 선언 숫자형
    DECLARE _cnt integer;		#변수 선언 숫자형
    SET _cnt=0;		#루프 탈출용, 번호카운트용 
    delete from examtable where id > 0;		#기존에 있던 값 삭제
		_loop: LOOP		#루프 선언
			SET _cnt = _cnt+1;		# 값 1증가, 0부터 시작해서 미리 늘려둔다.
            #concat을 사용해서 홍길+숫자로 이름 생성, cast로 숫자를 문자로 형태변환
            SET _name = concat("홍길",cast(_cnt as char(4)));	
			SET _id = 209900+ _cnt;		#현재 숫자에 따라 id값 입력
			# examtable에 이름, id, 성적을(랜덤함수) 입력한다.
			INSERT INTO examtable VALUE (_name, _id, rand()*100, rand()*100, rand()*100);
            # 만약 입력받은 숫자 만큼 실행했으면 루프를 탈출하는 if문 작성
            IF _cnt = _last THEN
				LEAVE _loop;
			END IF;
		END LOOP _loop;	#loop종료
END $$
# 1000개의 성적 데이터를 입력하는 함수 실행
call insert_examtable(1000);
# 작성한 테이블을 보여준다.
select * from examtable;
# 작성한 테이블의 전체, 성적합(sum), 성적평균(ave)을 examtable의 30번째부터 59개를 출력해서 보여준다.
select *, kor+eng+mat as sum, (kor+eng+mat)/3 as ave from examtable LIMIT 30, 59;


#pg 15 Basic Training(1) 테이블 만들기, 등수출력 함수, 테이블 오름차순
drop table examtable;
create table examtable(
	name varchar(20),
    id int not null primary key,
    kor int, eng int, mat int);
#기존에 동일명의 함수가 있으면 삭제
DROP PROCEDURE IF EXISTS insert_examtable;
DELIMITER $$
CREATE PROCEDURE insert_examtable(_last integer) #프로시저 선언, 숫자형태의 _last를 변수로 받는다.
BEGIN
	DECLARE _name varchar(20);	#변수 선언 문자형
    DECLARE _id integer;		#변수 선언 숫자형
    DECLARE _cnt integer;		#변수 선언 숫자형
    SET _cnt=0;		#루프 탈출용, 번호카운트용 
    delete from examtable where id > 0;		#기존에 있던 값 삭제
		_loop: LOOP		#루프 선언
			SET _cnt = _cnt+1;		# 값 1증가, 0부터 시작해서 미리 늘려둔다.
            #concat을 사용해서 정지+숫자로 이름 생성, cast로 숫자를 문자로 형태변환
            SET _name = concat("정지",cast(_cnt as char(4)));	
			SET _id = 209900+ _cnt;		#현재 숫자에 따라 id값 입력
			# examtable에 이름, id, 성적을(랜덤함수) 입력한다.
			INSERT INTO examtable VALUE (_name, _id, rand()*100, rand()*100, rand()*100);
            # 만약 입력받은 숫자 만큼 실행했으면 루프를 탈출하는 if문 작성
            IF _cnt = _last THEN
				LEAVE _loop;
			END IF;
		END LOOP _loop;	#loop종료
END $$
# 100명의 성적을 입력하는 프로시저 실행
call insert_examtable(100);

# 테이블 전체내용과 테이블(b)의 성적합, 테이블(b)의 평균, 테이블(a)를 돌면서 테이블(b)의 합보다 큰 값을 카운트해서 등수 산출, 한 값을 등수로 출력
select *, (b.kor+b.eng+b.mat) as 총점, (b.kor+b.eng+b.mat)/3 as 평균, (
    select count(*)+1 from examtable as a where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat)) as 등수 from examtable as b ;

#등수 pg15 *****************************************************************
#동일명 함수 삭제 명령
DROP FUNCTION IF EXISTS print_rank;
DELIMITER $$
CREATE FUNCTION print_rank(_id integer) RETURNS integer #함수 선언, 인수와 리턴의 형태 설정
BEGIN
	DECLARE _ranking integer; #_ranking 선언
    #examtable의 등수를 _ranking 입력한다. 입력 받은 id가 동일한 성적에 대해서
    SELECT (select count(*)+1 from examtable as a where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat)) INTO _ranking FROM examtable as b WHERE id=_id; 
RETURN _ranking; #_sum을 리턴한다.
END $$
DELIMITER ;
# examtable의 모든 값과 id값의 성적합(함수로 계산) - 이름:합으로 값을 출력한다.
select *, print_rank(id) as 등수 from examtable;
#오류에 대한 수정 코드, 교수님이 친절하게 설명해 주셨다.
show global variables like 'log_gin_trust_function_creators';
SET Global log_bin_trust_function_creators = 'ON';

    
# 동일명 프로시저 삭제
DROP PROCEDURE IF EXISTS print_rank;
DELIMITER $$
CREATE PROCEDURE print_rank_order( ) #프로시저 선언
BEGIN
	# 테이블 전체내용과 테이블(b)의 성적합, 테이블(b)의 평균, 테이블(a)를 돌면서 테이블(b)의 합보다 큰 값을 카운트해서 등수 산출, 한 값을 등수를 기준으로 오름차순해서 출력
	select *, (b.kor+b.eng+b.mat) as 총점, (b.kor+b.eng+b.mat)/3 as 평균, (
    select count(*)+1 from examtable as a where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat)) as 등수 from examtable as b order by 등수 asc;
END $$
# 함수 실행
call print_rank_order( );

    
    
# basic training(2) 트와이스 선호도
# 동일명 함수 삭제
DROP PROCEDURE IF EXISTS input_data;
DELIMITER $$
CREATE PROCEDURE input_data(_last integer) #입력할 학생수를 인수로 받는다.
BEGIN 
	DECLARE i INT DEFAULT 1;	#i의 기본값을 1로 설정
    while i <= _last do	#설정한 인원수 만큼 도는 while문 작성
		insert into votetable (name, age) VALUES (round((rand()*8 + 1),0), (rand()*8)+1);	#votetable에 이름(1~9, 트와이스 맴버, 변경할 예정), 연령대(투표인원의 연령)을 입력
		SET i = i + 1;	#다음 값 1 증가
	END while;	#while문 종료
END $$
# 함수 실행	
CALL input_data(1000);

#이름변환
DROP PROCEDURE IF EXISTS change_name;	#프로시저 있으면 삭제
DELIMITER $$
CREATE PROCEDURE change_name()	#이름 변환할 프로시저 선언
BEGIN
	set sql_safe_updates=0;	#실행하지건 안전모드 해제
    #각 해당하는 숫자에 따라 트와이스 맴버로 이름 변경
	update votetable set name = '나연' where name='1';
	update votetable set name = '정연' where name='2';
	update votetable set name = '모모' where name='3';
	update votetable set name = '사나' where name='4';
	update votetable set name = '지효' where name='5';
	update votetable set name = '미나' where name='6';
	update votetable set name = '다현' where name='7';
	update votetable set name = '채영' where name='8';
	update votetable set name = '쯔위' where name='9';
    #이름, 득표수(동일 이름의 개수), 득표율(해당 맴버의 득표/전체 투표수)를 votetable로부터 가져오고 이름을 기준으로 그룹 지으며 득표수를 기준으로 내림차순
    select name, count(name) as 득표수, count(name)/(select count(*) from votetable)*100 as 득표율 from votetable group by name order by 득표수 desc;
END $$
# 함수호출
call change_name();

#Training(1) 성적 출력
# 성적 테이블 만들기
create table examtableTest(id int, name varchar(10), kor int, eng int, mat int);
drop table examtableTest;	#해당 테이블 삭제
# 중복 프로시저 삭제
DROP PROCEDURE IF EXISTS insert_examtableTest;
# 프로시저 선언
DELIMITER $$
CREATE PROCEDURE insert_examtableTest(_last integer)	#입력할 인원수를 인수로 받는다.
BEGIN
	DECLARE _name varchar(20);	#이름 변수 선언
    DECLARE _id integer;		#아이디 변수 선언
    DECLARE _cnt integer;		#카운트 변수 선언
    SET _cnt=0;		#카운트에 0 입력
    delete from examtable where id > 0;	#기존 테이블에 있던 값 중, id가 0보다 크면 삭제
		_loop: LOOP	#루프 선언
			SET _cnt = _cnt+1;	#cnt를 0으로 선언해서 1미리 증가, 1 증가
            SET _name = concat("정지",cast(_cnt as char(4)));	#이름에 정지+숫자로 이름 선언
			SET _id = _cnt;		#현재 번호를 _id로 선언
			# 만들어둔 테이블에 숫자, 이름, 성적을 각각 입력해준다.
			INSERT INTO examtableTest VALUE (_cnt ,_name, rand()*100 + 1, rand()*100 + 1, rand()*100 + 1);
			#_cnt가 입력한 마지막 인원수에 도달하면 루프 탈출
            IF _cnt = _last THEN
				LEAVE _loop;
			END IF;
		END LOOP _loop;	#루프 종료
END $$
call insert_examtableTest(1000);	#1000명의 성적을 입력하는 프로시저 실행

# 중복 프로시저 삭제
DROP PROCEDURE IF EXISTS print_report;
# 프로시저 선언
DELIMITER $$
CREATE PROCEDURE print_report(_currentPage int, _pageStudentNumber int)		#현재 페이지와 페이지당 인원수를 받는 프로시저 선언
BEGIN
	declare start_person integer;	#페이지에서 첫번째 인원 번호 받을 변수 선언
    declare last_person integer;	#페이지에서 마지막 인원 번호 받을 변수 선언
    declare last_page integer;		#마지막 페이지를 받을 변수 선언
    declare _page integer;			#현재 페이지 _currentPage를 받을 변수 선언
	declare _person integer;		#페이지당 인원수 _pageStudentNumber를 받을 변수 선언
    
    set _person = _pageStudentNumber;		#페이지당 인원수 입력
    set _page = _currentPage;				#현재 페이지 입력
    set last_page = ceiling(1000/_person);	#마지막 페이지 입력, 올림으로 나머지인원이 있는 경우에 페이지 추가
    if _page < 1 then		#입력받은 페이지가 1보다 작으면, 1로 세팅해준다.
      set _page = 1;
	end if;
	if _page > last_page then	#입력받은 페이지가 마지막페이지보다 크면, 마지막페이지로 변경해준다.
		set _page = last_page;
	end if;
    set start_person = (_page - 1) * _person;	#입력받은 페이지에서 -1(그래야 시작인원을 맞출 수 있다) 페이지당 인원수를 곱해준다.
    set last_person = _page * _person;	#누적페이지의 성적을 구할 때, 쓸 인원수를 입력해준다.

	# 현재 페이지 인원 출력 (번호, 이름, 성적, 총점(b테이블), 평균(b테이블), 등수(b테이블의 총점을 기준으로, a테이블을 돌면서 보다 큰 수가 있는 경우에 count한다)를 출력한다.)
	select *, (b.kor+b.eng+b.mat) as 총점, (b.kor+b.eng+b.mat)/3 as 평균, (select count(*)+1 from examtableTest as a where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat)) as 등수 
																												from examtableTest as b limit start_person, _person;
	# 현재 페이지 성적 정보 (limit으로 현재페이지 인원 설정, 국어합, 영어합, 수학합, 총점합, 평균합, 국어평균, 영어평균, 수학평균, 총점평균, 총점평균을 출력한다.)
	select sum(kor) AS 국어합, sum(eng) AS 영어합, sum(mat) AS 수학합, sum(kor+eng+mat) AS 총점합, sum((kor+eng+mat)/3) AS 총점평균,
						avg(kor) AS 국어평균, avg(eng) AS 영어평균, avg(mat) AS 수학평균, avg(kor+eng+mat) AS 총점평균, avg((kor+eng+mat)/3) AS 평균총평균 from (select kor,eng,mat from examtableTest limit start_person, _person) as 현재;
	# 누적 페이지 성적 정보 (limit으로 누적페이지 인원 설정, 국어합, 영어합, 수학합, 총점합, 평균합, 국어평균, 영어평균, 수학평균, 총점평균, 총점평균을 출력한다.)
	select sum(kor) AS 누적국어합, sum(eng) AS 누적영어합, sum(mat) AS 누적수학합, sum(kor+eng+mat) AS 누적총점합, sum((kor+eng+mat)/3) AS 누적총점평균,
				avg(kor) AS 누적국어평균, avg(eng) AS 누적영어평균, avg(mat) AS 누적수학평균, avg(kor+eng+mat) AS 누적총점평균, avg((kor+eng+mat)/3) AS 누적평균총평균 from (select kor,eng,mat from examtableTest limit 0, last_person) as 누적;
END $$
#출력 , 한페이지당 25명 기준, 5페이지의 성적 출력
call print_report(5, 25);


# Training(2) wifi 
# freeWifi_report 프로시저가 이미 존재한다면 삭제
DROP PROCEDURE IF EXISTS freeWifi_report;
# freeWifi_report 프로시저 생성
DELIMITER $$
CREATE PROCEDURE freeWifi_report(_currentPage int, _pageSpotNumber int)		#현재 페이지와 페이지당 지점수를 인수로 받는다.
BEGIN
#변수 선언
DECLARE start_number int;
DECLARE page_last_number int;
DECLARE cutpage int;
DECLARE pageSpot int;
DECLARE lastpage int;
DECLARE lat double; # 현재 위치의 위도
DECLARE lng double; # 현재 위치의 경도

SET cutpage = _currentPage-1;		# 현재 페이지 계산 변수
SET pageSpot = _pageSpotNumber;		# 현재 페이지 장소 개수
SET lastpage = ceiling(1000/pageSpot);	#마지막 페이지
# 집 위도경도
SET lat = 37.4086523;
SET lng = 127.1281315;
#학원 위도경도
# SET lat = 37.3860521; # 위도
# SET lng = 127.1214038; # 경도
# 첫페이지, 마지막페이지 보다 크거나 작을 때 페이지 보정
IF cutpage < 1 THEN
   SET cutpage = 1;
END IF;
IF cutpage  > lastpage  THEN
   SET cutpage = lastpage;
END IF;
# 페이지의 첫 시작 지점 계산
SET start_number = cutpage * pageSpot;
set @rownum:= start_number;	# 원본테이블에서 값을 불러올때 넘버링 하는 변수
# 주소, 위도, 경도, 거리 출력
select @rownum:= @rownum + 1 as 번호, place_addr_road as 주소, latitude as 위도, longitude as 경도,
      (6371 * acos( cos( radians( lat ) ) * cos( radians( latitude) ) * cos( radians( longitude) - radians( lng )) + sin( radians(lat) ) * sin( radians(latitude) ) ) ) AS 거리
from freewifi2  limit start_number, pageSpot;
END $$
# 25개씩 출력할때 5페이지의 내용
call freeWifi_report(5, 25);
