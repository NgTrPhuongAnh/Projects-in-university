CREATE DATABASE QuanLySinhVien;
USE QuanLySinhVien;

/*===== BANG THONG TIN SINH VIEN =====*/
GO
CREATE TABLE ThongTinSinhVien
(
	MSV varchar(10) NOT NULL PRIMARY KEY,
	Hoten nvarchar(50) NOT NULL,
	NgaySinh Date,
	Gioi varchar(3),
	Lop varchar(7),
	SDT varchar(10)
)

/*===== BANG NGANH HOC =====*/
GO
CREATE TABLE NganhHoc
(
	IDNganh varchar(4) NOT NULL PRIMARY KEY,
	TenNganh nvarchar(30) NOT NULL,
	TongTin int
)

/*===== BANG DIEM SO =====*/
GO
CREATE TABLE DiemSo
(
	MSV varchar(10),
	Hoten nvarchar(50),
	Lop varchar(7),
	IDNganh varchar(4),
	MonHoc varchar(30),
	SoTin int,
	Diem decimal(3, 1),
	PRIMARY KEY (MSV, MonHoc),
	FOREIGN KEY (MSV) REFERENCES ThongTinSinhVien(MSV),
	FOREIGN KEY (IDNganh) REFERENCES NganhHoc(IDNganh)
)

/*===== BANG HOC PHI =====*/
GO
CREATE TABLE HocPhi
(
	MSV varchar(10) NOT NULL,
	Hoten nvarchar(50) NOT NULL,
	Lop varchar(7),
	IDNganh varchar(4),
	Hocphi varchar(15),
	Trangthai varchar(10),
	PRIMARY KEY (MSV, IDNganh),
	FOREIGN KEY (MSV) REFERENCES ThongTinSinhVien(MSV),
	FOREIGN KEY (IDNganh) REFERENCES NganhHoc(IDNganh)
)

/*===== THEM DU LIEU VAO BANG THONG TIN SINH VIEN =====*/
GO
INSERT INTO ThongTinSinhVien (MSV, Hoten, NgaySinh, Gioi, Lop, SDT)
VALUES
('2823210170', 'Nguyen Tran Phuong Anh', '2004-12-18', 'Nu', 'TH28.41', '0971499926'),
('2821234567', 'Khong Khanh Linh', '2005-11-09', 'Nu', 'LK28.02', '0999999999'),
('2621234567', 'Luc Van Lap', '2003-01-05', 'Nam', 'RM27.06', '0988888888'),
('2721234567', 'Pham Phu Hung', '2004-10-01', 'Nam', 'CO27.03', '0359876543'),
('2521234567', 'Dang Hoang Vuong', '2002-01-07', 'Nam', 'NA25.08', '0356739562'),
('2820987654', 'Tran Minh Phu', '2005-07-14', 'Nam', 'NT28.02', '0978765432'),
('2620987654', 'Le Thi Hoai', '2003-08-23', 'Nu', 'CD26.41', '0912345678'),
('2720987654', 'Vu Linh Nhi', '2004-02-03', 'Nu', 'DD27.07', '0928572847'),
('2520987654', 'Doan Hai Hung', '2002-10-04', 'Nam', 'NN25.17', '0921466839'),
('2624728462', 'Dang Nguyet Ha', '2002-12-12', 'Nu', 'MT26.10', '0381848294'),
('2721752747', 'Dao Huy Tuan', '2004-06-28', 'Nam', 'TH27.03', '0916365826'),
('2528284748', 'Nguyen Xuan Nhi', '2002-05-14', 'Nu', 'LK25.17', '0352859275')
SELECT * FROM ThongTinSinhVien

/*===== THEM DU LIEU VAO BANG NGANH HOC =====*/
GO
INSERT INTO NganhHoc (IDNganh, TenNganh, TongTin)
VALUES
('0101', 'Cong nghe thong tin', 155),
('0113', 'Luat kinh te', 120),
('0102', 'Cong nghe oto', 145),
('0111', 'Ngon ngu Anh', 150),
('0103', 'Co dien tu', 155),
('0104', 'Dien dien tu', 120),
('0112', 'Ngon ngu Trung', 145),  
('0114', 'Ngon ngu Nga', 150),
('0107', 'Thiet ke do hoa', 155),
('0108', 'Rang Ham Mat', 160)
SELECT * FROM NganhHoc

/*===== THEM DU LIEU VAO BANG DIEM SO =====*/
GO
INSERT INTO DiemSo (MSV, Hoten, Lop, IDNganh, MonHoc, SoTin, Diem)
VALUES
('2823210170', 'Nguyen Tran Phuong Anh', 'TH28.41', '0101', 'Lap trinh truc quan', 4, 9.1),
('2823210170', 'Nguyen Tran Phuong Anh', 'TH28.41', '0101', 'HA2', 3, 9.9),
('2821234567', 'Khong Khanh Linh', 'LK28.02', '0113', 'Luat dan su', 4, 8.5),
('2621234567', 'Luc Van Lap', 'RM27.06', '0108', 'Giai phau', 3, 6.4),
('2721234567', 'Pham Phu Hung', 'CO27.03', '0102', 'Thiet ke mach', 3, 8.8),
('2721234567', 'Pham Phu Hung', 'CO27.03', '0102', 'HA4', 3, 8.0),
('2521234567', 'Dang Hoang Vuong', 'NA25.08', '0111', 'HA5', 3, 8.2),
('2820987654', 'Tran Minh Phu', 'NT28.02', '0112', 'Trung 1', 3, 7.5),
('2620987654', 'Le Thi Hoai', 'CD26.41', '0103', 'He dieu hanh Linux', 2, 6.0),
('2720987654', 'Vu Linh Nhi', 'DD27.07', '0104', 'Nguyen ly mach', 4, 8.4),
('2520987654', 'Doan Hai Hung', 'NN25.17', '0114', 'Thiet ke vi mach', 4, 4.8),
('2624728462', 'Dang Nguyet Ha', 'MT26.10', '0107', 'Do hoa', 2, 5.6),
('2721752747', 'Dao Huy Tuan', 'TH27.03', '0101', 'HA4', 3, 7.0),
('2721752747', 'Dao Huy Tuan', 'TH27.03', '0101', 'Lap trinh truc quan', 3, 6.3),
('2528284748', 'Nguyen Xuan Nhi', 'LK25.17', '0113', 'The chat', 3, 7.5)
SELECT * FROM DiemSo

/*===== THEM DU LIEU VAO BANG HOC PHI =====*/
GO
INSERT INTO HocPhi (MSV, Hoten, Lop, IDNganh, Hocphi, Trangthai)
VALUES
('2823210170', 'Nguyen Tran Phuong Anh', 'TH28.41', '0101', '8.610.000', 'Chua dong'),
('2821234567', 'Khong Khanh Linh', 'LK28.02', '0113', '6.390.000', 'Da dong'),
('2621234567', 'Luc Van Lap', 'RM27.06', '0108', '8.610.000', 'Da dong'),
('2721234567', 'Pham Phu Hung', 'CO27.03', '0102', '8.610.000', 'Chua dong'),
('2521234567', 'Dang Hoang Vuong', 'NA25.08', '0111', '6.740.000', 'Chua dong'),
('2820987654', 'Tran Minh Phu', 'NT28.02', '0112', '6.740.000', 'Da dong'),
('2620987654', 'Le Thi Hoai', 'CD26.41', '0103', '6.390.000', 'Chua dong'),
('2720987654', 'Vu Linh Nhi', 'DD27.07', '0104', '6.390.000', 'Da dong'),
('2520987654', 'Doan Hai Hung', 'NN25.17', '0114', '6.740.000', 'Da dong'),
('2624728462', 'Dang Nguyet Ha', 'MT26.10', '0107', '7.850.000', 'Da dong'),
('2721752747', 'Dao Huy Tuan', 'TH27.03', '0101', '8.610.000', 'Chua dong'),
('2528284748', 'Nguyen Xuan Nhi', 'LK25.17', '0113', '6.390.000', 'Da dong')
SELECT * FROM HocPhi
