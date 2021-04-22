create table sungjuk (
    sjno    int     auto_increment,
    name    varchar(10)     not null,
    kor     int     default 0,
    eng     int     default 0,
    mat     int     default 0,
    tot     int,
    mean    decimal(5,1),
    grd     char(2),
    regdate datetime default current_timestamp
);

insert into sungjuk (name, kor, eng, mat, tot, mean, grd)
values ('혜교', 98, 97, 87, 234, 85.5, '수');

select sjno, name, kor, eng, mat, date(regdate) regdate from sungjuk
order by sjno;

select * from sungjuk
where sjno = 1;

update sungjuk
set name = '파이썬', kor = 99, eng = 99, mat = 99
where sjno = 1;

delete from sungjuk
where sjno = 1;