CREATE DATABASE QuanLyHocVien
GO
USE QuanLyHocVien

/*=====BANG THONG TIN HOC VIEN=====*/
GO
CREATE TABLE ThongTinHocVien
(
	IDHV varchar(5) NOT NULL PRIMARY KEY,
	HotenHV nvarchar(50) NOT NULL,
	Ngaysinh date,
	Gioi varchar(3),
	SDT varchar(10),
	Diachi nvarchar(255)
)

/*=====BANG THONG TIN GIAO VIEN=====*/
GO
CREATE TABLE ThongTinGiaoVien
(
	IDGV varchar(5) NOT NULL,
	HotenGV nvarchar(50) NOT NULL PRIMARY KEY,
	Gioi varchar(3),
	SDT varchar(10),
	Trinhdo nvarchar(15)
)

/*=====BANG LOP HOC=====*/
GO 
CREATE TABLE LopHoc
(
	IDLop varchar(5) NOT NULL PRIMARY KEY,
	TenLop varchar(20) NOT NULL,
	Siso smallint
)

/*=====BANG PHAN CONG=====*/
GO
CREATE TABLE PhanCong
(
	IDLop varchar(5) NOT NULL,
	TenLop varchar(20) NOT NULL,
	Capdo nvarchar(30) PRIMARY KEY,
	HotenGV nvarchar(50) NOT NULL,
	SDT varchar(10),
	FOREIGN KEY (IDLop) REFERENCES LopHoc(IDLop),
	FOREIGN KEY (HotenGV) REFERENCES ThongTinGiaoVien(HotenGV)
)

/*=====BANG KHOA HOC=====*/
GO
CREATE TABLE KhoaHoc
(
	IDKhoa varchar(5) NOT NULL,
	TenKhoa nvarchar(20) NOT NULL PRIMARY KEY,
	Capdo nvarchar(30) NOT NULL,
	Thoigian nvarchar(15),
	FOREIGN KEY (Capdo) REFERENCES PhanCong(Capdo)
)

/*=====BANG HOC PHI=====*/
GO
CREATE TABLE HocPhi
(
	IDHV varchar(5) NOT NULL,
	HotenHV nvarchar(50) NOT NULL,
	TenKhoa nvarchar(20) NOT NULL,
	Hocphi nvarchar(20),
	Trangthai varchar(10)
	FOREIGN KEY (IDHV) REFERENCES ThongTinHocVien(IDHV),
	FOREIGN KEY (TenKhoa) REFERENCES KhoaHoc(TenKhoa)
)

/*=====THEM DU LIEU VAO BANG THONG TIN HOC VIEN=====*/
INSERT INTO ThongTinHocVien
VALUES
('SD001', 'Nguyen Tran Phuong Ngoc', '1997-08-22', 'Nu', '0968626142', 'Chung cu Linh Dam, Hoang Mai, Ha Noi'),
('SD002', 'Tran Phuong Mai', '2000-11-27', 'Nu', '0968223478', 'Chung cu Golden Season 47 Nguyen Tuan, Thanh Xuan, Ha Noi'),
('SD003', 'Tran Minh Quy', '2006-01-01', 'Nam', '0357289446', 'To 13 Ngo 97 Khuong Trung, Thanh Xuan, Ha Noi'),
('SD004', 'Tran Thao Linh', '2001-11-21', 'Nu', '0945397789', 'Ngo 297 Vu Huu, Thanh Xuan, Ha Noi'),
('SD005', 'Chu Minh Chau', '2007-08-11', 'Nu', '0937126670', 'Ngo 12 Bat Khoi, Long Bien, Ha Noi'),
('SD006', 'Tran Bao Khang', '2016-03-10', 'Nam', '0971499926', 'Ngo 132 Minh Khai, Hai Ba Trung, Ha Noi'),
('SD007', 'Ha Gia Bach', '2009-06-04', 'Nam', '0349275010', 'Chung cu Xa La, Ha Dong, Ha Noi'),
('SD008', 'Pham Le Viet Hoang', '2007-11-23', 'Nam', '0971048539', 'Ngo 118 Luong The Vinh, Thanh Xuan, Ha Noi'),
('SD009', 'Tran Giang Ngan', '2007-08-16', 'Nu', '0969174048', '79 Tay Son, Dong Da, Ha Noi'),
('SD010', 'Le Phan', '2001-09-11', 'Nam', '0965038892', '65 Quan Thanh, Ba Dinh, Ha Noi'),
('SD011', 'Luong Chuc An', '2005-07-17', 'Nu', '0355385390', '338 Xa Dan, Dong Da, Ha Noi'),
('SD012', 'Dang Quoc Bao', '1999-09-01', 'Nam', '0987032311', '134 Vo Chi Cong, Tay Ho, Ha Noi'),
('SD013', 'Quach Viet Anh', '2002-02-15', 'Nam', '0394043285', 'Khu Cong nghe cao Hoa Lac, Thach That, Ha Noi'),
('SD014', 'Doan Hai Dang', '2004-06-23', 'Nam', '0962947265', 'Ngo 14 Cuu Quan, Hoai Duc Ha Noi'),
('SD015', 'Truong Thuy Vy', '2008-03-10', 'Nu', '0970474920', '61 Tu Hiep, Thanh Tri, Ha Noi')

SELECT * FROM ThongTinHocVien


/*=====THEM DU LIEU VAO BANG THONG TIN GIAO VIEN=====*/
INSERT INTO ThongTinGiaoVien
VALUES
('T01', 'Bui Dang Khoi', 'Nam', '0978204639', 'TOPIK 6'),
('T02', 'Dang Hoang Vuong', 'Nam', '0167963640', 'IELTS 8.5'),
('T03', 'Nguyen Thu Thao', 'Nu', '0352748394', 'JLPT N1'),
('T04', 'Nguyen Thuy Duong', 'Nu', '0946725830','JLPT N2'),
('T05', 'Nguyen Xuan Nhi', 'Nu', '0969845857', 'IELTS 7.0'),
('T06', 'Nguyen Van Quyen ', 'Nam', '0918472599', 'HSK 5')

SELECT * FROM ThongTinGiaoVien


/*=====THEM DU LIEU VAO BANG LOP HOC=====*/
INSERT INTO LopHoc
VALUES
('IL01', 'Isaac Newton', 3),
('IL02', 'Bill Gates', 4),
('JL01', 'Noguchi', 4),
('JL02', 'Higuchi', 3),
('TP01', 'Sejong', 5)

SELECT * FROM LopHoc


/*=====THEM DU LIEU VAO BANG PHAN CONG=====*/
INSERT INTO PhanCong
VALUES
('IL01','Isaac Newton', 'IELTS tu 1.5 den 5.0', 'Nguyen Xuan Nhi', '0969845857'),
('IL02', 'Bill Gates', 'IELTS tu 5.0 den 7.0+', 'Dang Hoang Vuong', '0167963640'),
('JL01', 'Noguchi', 'JLPT tu N5 den N3', 'Nguyen Thuy Duong', '0946725830'),
('JL02', 'Higuchi', 'JLPT tu N3 den N1', 'Nguyen Thu Thao', '0352748394'),
('TP01', 'Sejong', 'TOPIK 1 den TOPIK 4', 'Bui Dang Khoi', '0978204639')

SELECT * FROM PhanCong


/*=====THEM DU LIEU VAO BANG KHOA HOC=====*/
INSERT INTO KhoaHoc
VALUES
('K101', 'IELTS beginner', 'IELTS tu 1.5 den 5.0', '190 gio'),
('K102', 'IELTS plus', 'IELTS tu 5.0 den 7.0+', '150 gio'),
('K201', 'JLPT beginner', 'JLPT tu N5 den N3', '450 gio'),
('K202', 'JLPT plus', 'JLPT tu N3 den N1', '370 gio'),
('K301', 'TOPIK zero to hero', 'TOPIK 1 den TOPIK 4', '470 gio')

SELECT * FROM KhoaHoc


/*=====THEM DU LIEU VAO BANG HOC PHI=====*/
INSERT INTO HocPhi
VALUES
('SD001', 'Nguyen Tran Phuong Ngoc', 'IELTS plus', '13.500.000', 'Da dong'),
('SD002', 'Tran Phuong Mai', 'TOPIK zero to hero', '17.800.000', 'Chua dong'),
('SD002', 'Tran Phuong Mai', 'JLPT beginner', '6.000.000', 'Da dong'),
('SD003', 'Tran Minh Quy', 'IELTS beginner', '9.650.000', 'Da dong'),
('SD003', 'Tran Minh Quy', 'JLPT beginner', '6.000.000', 'Da dong'),
('SD004', 'Tran Thao Linh', 'JLPT plus', '4.500.000', 'Chua dong'),
('SD005', 'Chu Minh Chau', 'TOPIK zero to hero', '17.800.000', 'Da dong'),
('SD006', 'Tran Bao Khang', 'JLPT beginner', '6.000.000', 'Da dong'),
('SD007', 'Ha Gia Bach', 'IELTS beginner', '9.650.000', 'Da dong'),
('SD008', 'Pham Le Viet Hoang', 'TOPIK zero to hero', '17.800.000', 'Chua dong'),
('SD009', 'Tran Giang Ngan', 'IELTS plus', '13.500.000', 'Chua dong'),
('SD010', 'Le Phan', 'JLPT plus', '4.500.000', 'Da dong'),
('SD011', 'Luong Chuc An', 'JLPT beginner', '6.000.000', 'Chua dong'),
('SD012', 'Dang Quoc Bao', 'TOPIK zero to hero', '17.800.000', 'Da dong'),
('SD012', 'Dang Quoc Bao', 'IELTS plus', '13.500.000', 'Chua dong'),
('SD013', 'Quach Viet Anh', 'TOPIK zero to hero', '17.800.000', 'Da dong'),
('SD013', 'Quach Viet Anh', 'JLPT plus', '4.500.000', 'Chua dong'),
('SD014', 'Doan Hai Dang', 'IELTS plus', '13.500.000', 'Da dong'),
('SD015', 'Truong Thuy Vy', 'IELTS beginner', '9.650.000', 'Da dong')

SELECT * FROM HocPhi


/*=====DEM SO HOC VIEN SINH VAO THANG 11=====*/
GO
SELECT COUNT(*) AS SoHocVienSNThang11
FROM ThongTinHocVien
WHERE DATEPART(MONTH, Ngaysinh) = 11;


/*=====TIM KIEM HOC VIEN SINH NAM TU 1997-2001=====*/
GO
SELECT * FROM ThongTinHocVien
WHERE YEAR(Ngaysinh) BETWEEN 1997 AND 2001;


/*=====THEM COT NGAY SINH VA DIEN DU LIEU NGAY SINH CHO BANG THONG TIN GIAO VIEN=====*/
GO
ALTER TABLE ThongTinGiaoVien
ADD NgaySinh DATE;

UPDATE ThongTinGiaoVien
SET NgaySinh = '1996-04-30'
WHERE HotenGV = 'Bui Dang Khoi';

UPDATE ThongTinGiaoVien
SET NgaySinh = '2001-01-07'
WHERE HotenGV = 'Dang Hoang Vuong';

UPDATE ThongTinGiaoVien
SET NgaySinh = '1998-10-10'
WHERE HotenGV = 'Nguyen Thu Thao';

UPDATE ThongTinGiaoVien
SET NgaySinh = '1995-03-08'
WHERE HotenGV = 'Nguyen Thuy Duong';

UPDATE ThongTinGiaoVien
SET NgaySinh = '2000-11-20'
WHERE HotenGV = 'Nguyen Xuan Nhi';

UPDATE ThongTinGiaoVien
SET NgaySinh = '1997-12-12'
WHERE HotenGV = 'Nguyen Van Quyen';

SELECT * FROM ThongTinGiaoVien


/*=====XOA THONG TIN CUA MOT GIAO VIEN=====*/
GO
DELETE FROM ThongTinGiaoVien
WHERE HotenGV = 'Nguyen Van Quyen';

SELECT * FROM ThongTinGiaoVien


/*=====HIEN THI NHUNG HOC VIEN CHUA DONG HOC PHI=====*/
GO
SELECT * FROM HocPhi
WHERE Trangthai = 'Chua dong';


/*=====CAP NHAT VA HIEN THI TRANG THAI HOC PHI CHO HOC VIEN=====*/
GO
UPDATE HocPhi
SET Trangthai = 'Da dong'
WHERE HotenHV IN ('Pham Le Viet Hoang', 'Luong Chuc An', 'Quach Viet Anh');

SELECT * FROM Hocphi
WHERE Trangthai = 'Da dong';


/*=====TINH TONG VA HIEN THI HOC PHI CUA 1 HOC VIEN=====*/
GO
SELECT FORMAT(SUM(CONVERT(INT, REPLACE(Hocphi,'.', ''))), '#,##0') AS TongHocphi
FROM HocPhi
WHERE HotenHV = 'Tran Minh Quy';




