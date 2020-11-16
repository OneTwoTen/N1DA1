CREATE DATABASE QLNSCT
GO
USE QLNSCT
GO

CREATE TABLE NHANVIEN(
MaNV nvarchar(50) not null,
TenNV nvarchar(50) not null,
ĐiaChi nvarchar(150) not null,
SDT int not null,
NgaySinh Date not null,
NoiSinh nvarchar(150) not null,
CMND int not null,
GioiTinh bit NOT NULL DEFAULT 0,
Emai nvarchar(100) not null ,
TinhTrangHonNhan nvarchar(50) not null,
TrangThaiLamViec nvarchar(50) not null,
SDTKhac int ,
Anh nvarchar(50) not null DEFAULT 'chuyen-de.png',
GhiChu nvarchar(225), 
PRIMARY KEY(MaNV),

)
GO
CREATE TABLE TAIKHOAN(
MaTK nvarchar(50) NOT NULL,
MaNV nvarchar(50) not null,
MatKhau nvarchar(50) NOT NULL,
HoTen nvarchar(50) NOT NULL,
VaiTro bit NOT NULL DEFAULT 0,
PRIMARY KEY(MaTK),
FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
)
GO
CREATE TABLE PhongBan(
MaPB nvarchar(50)not null,
MaNV nvarchar(50) not null, 
TenPB nvarchar(50) not null,
PRIMARY KEY(MaPB),
FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)ON UPDATE CASCADE
)
GO
CREATE TABLE HOPDONG(
MaHD nvarchar(50) not null,
NgayKy Date not null,
HoTen nvarchar(50)not null,
LoaiHopDong nvarchar(150) not null,
NgayBatDau Date not null,
NgayKetThuc Date not null,
ThuViecTu Date not null,
ThuViecDen Date not null,
ChucVu nvarchar(100) not null,
CongViecLam nvarchar(500) not null,
DungCu nvarchar(225) ,
TrinhDo nvarchar (50) null,
MaNV nvarchar(50) not null, 
PRIMARY KEY(MaHD),
FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)ON UPDATE CASCADE
)
GO
CREATE TABLE NGHIPHEP(
MaNghiPhep int IDENTITY(1,1) NOT NULL,
MaNV nvarchar(50)not null,
HoTen nvarchar(50) not null,
PhongBan nvarchar(50) not null,
NgayXinNghi Date not null,
Loai nvarchar not null,
PRIMARY KEY(MaNghiPhep),
FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
)
GO
CREATE TABLE THANNHAN(
MaTN nvarchar(50) not null,
HoTen nvarchar(50) not null,
TinhTrangHonNhan nvarchar(50) not null,
Bo nvarchar(500) not null,
Me nvarchar(500) not null,
Brother nvarchar(500) not null,
VoChong nvarchar(500) not null,
Con nvarchar(500) not null,
MaNV nvarchar(50) not null, 
PRIMARY KEY(MaTN),
FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)ON UPDATE CASCADE
)
GO
CREATE TABLE LUONG(
MaPB nvarchar(50)not null,
MaNV nvarchar(50) not null, 
HoTen nvarchar(50) not null,
Luong float NOT NULL DEFAULT 0,
BacLuong int not null,
PRIMARY KEY(MaPB,MaNV),
FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
)
GO
CREATE TABLE DieuChuyenNhanSu(
MaDC int IDENTITY(1,1) NOT NULL,
MaNV nvarchar(50) not null,
MaPB1 nvarchar(50)not null,
TenPB1 nvarchar(50) not null,
ChucVu1 nvarchar(50) not null,
NgayDieuChuyen Date not null,
ThoiGianBatDau1 Date not null,
ThoiGianLamViec Date not null,
DonViTruocDo nvarchar(50) not null,
TenPB2 nvarchar(50) not null,
MaPB2 nvarchar(50) not null,
ThoiGianBatDau2 Date not null,
ChucVu2 nvarchar(50) not null,
TienNhiem nvarchar(50)
PRIMARY KEY(MaDC),
FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
)
GO
CREATE TABLE BaoHiem(
MaBH int IDENTITY(1,1) NOT NULL,
MaNV nvarchar(50) not null,
LoaiBaoHiem nvarchar(225) not null,
SoTien float NOT NULL DEFAULT 0,
PRIMARY KEY(MaBH),
FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)ON UPDATE CASCADE
)
go

