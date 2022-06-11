# SQL-Front 5.1  (Build 4.16)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: localhost    Database: db_datahellokindergarten
# ------------------------------------------------------
# Server version 5.5.5-10.4.24-MariaDB

#
# Source for table tbl_guru
#

DROP TABLE IF EXISTS `tbl_guru`;
CREATE TABLE `tbl_guru` (
  `nuptk_guru` char(18) NOT NULL,
  `nm_guru` varchar(40) DEFAULT NULL,
  `jk_guru` varchar(10) DEFAULT NULL,
  `alamat_guru` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

#
# Dumping data for table tbl_guru
#

LOCK TABLES `tbl_guru` WRITE;
/*!40000 ALTER TABLE `tbl_guru` DISABLE KEYS */;
INSERT INTO `tbl_guru` VALUES ('004089869150109','Meta Nugraheni','Perempuan','LemahPutih, Rt/Rw:09/04');
INSERT INTO `tbl_guru` VALUES ('004088869130103','Nurhikmah','Perempuan','Klambu, Rt/Rw:09/05');
INSERT INTO `tbl_guru` VALUES ('004089869170107','Puspita','Perempuan','LemahPutih,Rt/Rw:06/02');
/*!40000 ALTER TABLE `tbl_guru` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tbl_kelas
#

DROP TABLE IF EXISTS `tbl_kelas`;
CREATE TABLE `tbl_kelas` (
  `kd_kelas` char(6) NOT NULL DEFAULT '',
  `nm_kelas` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

#
# Dumping data for table tbl_kelas
#

LOCK TABLES `tbl_kelas` WRITE;
/*!40000 ALTER TABLE `tbl_kelas` DISABLE KEYS */;
INSERT INTO `tbl_kelas` VALUES ('01','TK A');
INSERT INTO `tbl_kelas` VALUES ('02','TK B');
/*!40000 ALTER TABLE `tbl_kelas` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tbl_mapela
#

DROP TABLE IF EXISTS `tbl_mapela`;
CREATE TABLE `tbl_mapela` (
  `kd_mapel` char(6) NOT NULL DEFAULT '',
  `nm_mapel` varchar(40) DEFAULT NULL,
  `durasi` char(2) DEFAULT NULL,
  `nuptk_gr` varchar(20) DEFAULT NULL,
  `TK_A` varchar(200) DEFAULT NULL,
  `TK_B` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

#
# Dumping data for table tbl_mapela
#

LOCK TABLES `tbl_mapela` WRITE;
/*!40000 ALTER TABLE `tbl_mapela` DISABLE KEYS */;
INSERT INTO `tbl_mapela` VALUES ('01','Spiritual Agama','40','004089869150109','Melalui pengenalan dan pembelajaran tentang agamanya','Nilai-nilai agama dan moral dengan pembelajaran, mengerjakan ibadah');
INSERT INTO `tbl_mapela` VALUES ('02','Fisik Motorik','40','004089869170107','Melalui kegiatan yang berkaitan dengan permainan fisik','Melalui kegiatan senam irama dan melakukan koordinasi bagian tubuh');
INSERT INTO `tbl_mapela` VALUES ('03','Kognitif','40','004089869150109','Dengan mengenal angka,huruf,simbol dan warna','Berpikir logis, membaca, berhitung, menulis');
INSERT INTO `tbl_mapela` VALUES ('04','Sosialemosional','40','004089869170107','Mengajak SIswa bermain sambil belajar dan bersikap kooperatif','Berkerjasama dalam kelompok dan memecahkan masalah yang ada');
/*!40000 ALTER TABLE `tbl_mapela` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tbl_nilaisiswa
#

DROP TABLE IF EXISTS `tbl_nilaisiswa`;
CREATE TABLE `tbl_nilaisiswa` (
  `no_penilaian` char(6) NOT NULL DEFAULT '',
  `nis_siswa` varchar(255) DEFAULT NULL,
  `nm_kelas` varchar(200) DEFAULT NULL,
  `semester` char(2) DEFAULT NULL,
  `tahun_pelajaran` varchar(40) DEFAULT NULL,
  `nilai_spiritual` char(1) DEFAULT NULL,
  `nilai_motorik` char(1) DEFAULT NULL,
  `nilai_kognitif` char(1) DEFAULT NULL,
  `nilai_sosialemosional` char(1) DEFAULT NULL,
  `nilai_tingkatpencapaiankeseluruhan` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

#
# Dumping data for table tbl_nilaisiswa
#

LOCK TABLES `tbl_nilaisiswa` WRITE;
/*!40000 ALTER TABLE `tbl_nilaisiswa` DISABLE KEYS */;
INSERT INTO `tbl_nilaisiswa` VALUES ('01','202001','TK B','1','2021-2022','B','A','B','B','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('02','202002','TK B','1','2021-2022','B','A','A','A','A');
INSERT INTO `tbl_nilaisiswa` VALUES ('03','202003','TK B','1','2021-2022','A','B','B','A','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('04','202004','TK B','1','2021-2022','A','A','A','B','A');
INSERT INTO `tbl_nilaisiswa` VALUES ('05','202005','TK B','1','2021-2022','B','A','A','B','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('06','202006','TK B','1','2021-2022','A','B','B','B','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('07','202007','TK B','1','2021-2022','A','B','A','A','A');
INSERT INTO `tbl_nilaisiswa` VALUES ('08','202008','TK B','1','2021-2022','A','B','A','A','A');
INSERT INTO `tbl_nilaisiswa` VALUES ('09','202009','TK B','1','2021-2022','A','B','B','A','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('10','202010','TK B','1','2021-2022','B','A','A','A','A');
INSERT INTO `tbl_nilaisiswa` VALUES ('01','202101','TK A','1','2021-2022','A','B','A','B','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('02','202102','TK A','1','2021-2022','B','B','B','A','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('03','202103','TK A','1','2021-2022','A','A','A','B','A');
INSERT INTO `tbl_nilaisiswa` VALUES ('04','202104','TK A','1','2021-2022','B','B','A','A','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('05','202105','TK A','1','2021-2022','B','B','A','A','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('06','202106','TK A','1','2021-2022','A','B','A','A','A');
INSERT INTO `tbl_nilaisiswa` VALUES ('07','202107','TK A','1','2021-2022','B','A','B','B','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('08','202108','TK A','1','2021-2022','A','B','A','B','B');
INSERT INTO `tbl_nilaisiswa` VALUES ('09','202109','TK A','1','2021-2022','A','A','A','B','A');
INSERT INTO `tbl_nilaisiswa` VALUES ('10','202110','TK A','1','2021-2022','A','B','B','A','B');
/*!40000 ALTER TABLE `tbl_nilaisiswa` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tbl_siswatk
#

DROP TABLE IF EXISTS `tbl_siswatk`;
CREATE TABLE `tbl_siswatk` (
  `nis_siswa` char(6) NOT NULL DEFAULT '',
  `nm_siswa` varchar(40) DEFAULT NULL,
  `tgllahir_siswa` varchar(20) DEFAULT NULL,
  `jk_siswa` varchar(20) DEFAULT NULL,
  `tahun_pelajaran` varchar(10) DEFAULT NULL,
  `kd_kelas` char(6) DEFAULT NULL,
  `alamat_siswa` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

#
# Dumping data for table tbl_siswatk
#

LOCK TABLES `tbl_siswatk` WRITE;
/*!40000 ALTER TABLE `tbl_siswatk` DISABLE KEYS */;
INSERT INTO `tbl_siswatk` VALUES ('202102','Annisa Noviana','2016-11-19','Perempuan','2021-2022','01','LemahPutih, Rt/Rw: 03/03');
INSERT INTO `tbl_siswatk` VALUES ('202101','Adil Juliansyah','2016-07-09','Laki – Laki','2021-2022','01','Klambu, Rt/Rw: 01/03');
INSERT INTO `tbl_siswatk` VALUES ('202103','Bertania Febri','2017-02-10','Perempuan','2021-2022','01','Klambu, Rt/Rw: 09/09');
INSERT INTO `tbl_siswatk` VALUES ('202104','Fadhil Irfan Kamil','2016-11-12','Laki – Laki','2021-2022','01','Klambu, Rt/Rw: 04/09');
INSERT INTO `tbl_siswatk` VALUES ('202105','Firmansyah Dwi','2017-01-17','Laki – Laki','2021-2022','01','LemahPutih, Rt/Rw: 01/02');
INSERT INTO `tbl_siswatk` VALUES ('202106','Lisa Pinkan','2016-01-04','Perempuan','2021-2022','01','Klambu, Rt/Rw: 01/04');
INSERT INTO `tbl_siswatk` VALUES ('202107','Melati Kusuma Bangsa','2016-10-03','Perempuan','2021-2022','01','Klambu, Rt/Rw: 06/09');
INSERT INTO `tbl_siswatk` VALUES ('202108','Neiko Reita','2017-02-01','Perempuan','2021-2022','01','Klambu, Rt/Rw: 06/09');
INSERT INTO `tbl_siswatk` VALUES ('202109','Putri Anjelita','2017-01-19','Perempuan','2021-2022','01','LemahPutih, Rt/Rw: 07/09');
INSERT INTO `tbl_siswatk` VALUES ('202110','Siti Rahayu','2016-10-16','Perempuan','2021-2022','01','LemahPutih, Rt/Rw: 06/09');
INSERT INTO `tbl_siswatk` VALUES ('202001','Abdul Rozaq','2015-09-09','Laki – Laki','2021-2022','02','Klambu, Rt/Rw: 06/09');
INSERT INTO `tbl_siswatk` VALUES ('202002','Abde Ferdino','2015-08-19','Laki – Laki','2021-2022','02','LemahPutih, Rt/Rw: 07/09');
INSERT INTO `tbl_siswatk` VALUES ('202003','Alfian Fernanda','2015-10-10','Laki - Laki','2021-2022','02','Klambu, Rt/Rw: 09/09');
INSERT INTO `tbl_siswatk` VALUES ('202004','Aisyah Nur','2015-11-27','Perempuan','2021-2022','02','Klambu, Rt/Rw: 04/09');
INSERT INTO `tbl_siswatk` VALUES ('202005','Belinda Benedict','2015-12-17','Perempuan','2021-2022','02','LemahPutih, Rt/Rw: 06/09');
INSERT INTO `tbl_siswatk` VALUES ('202006','Bima Sakti','2016-01-04','Laki – Laki','2021-2022','02','Klambu, Rt/Rw: 07/06');
INSERT INTO `tbl_siswatk` VALUES ('202007','Cantika','2016-02-01','Perempuan','2021-2022','02','Klambu, Rt/Rw: 06/09');
INSERT INTO `tbl_siswatk` VALUES ('202008','Revandra Putra','2015-12-29','Laki-Laki','2021-2022','02','Klambu, Rt/Rw: 06/09');
INSERT INTO `tbl_siswatk` VALUES ('202009','Sivana','2015-10-19','Perempuan','2021-2022','02','LemahPutih, Rt/Rw: 07/09');
INSERT INTO `tbl_siswatk` VALUES ('202010','Zulfikri','2015-11-17','Laki – Laki','2021-2022','02','LemahPutih, Rt/Rw: 06/09');
/*!40000 ALTER TABLE `tbl_siswatk` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tbl_user
#

DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `username` varchar(50) NOT NULL DEFAULT '',
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

#
# Dumping data for table tbl_user
#

LOCK TABLES `tbl_user` WRITE;
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` VALUES ('admin','admin1234');
INSERT INTO `tbl_user` VALUES ('orangtua','ortu1234');
INSERT INTO `tbl_user` VALUES ('pengajar','guru1234');
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
