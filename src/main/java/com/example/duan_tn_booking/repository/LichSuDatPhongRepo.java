package com.example.duan_tn_booking.repository;

import com.example.duan_tn_booking.entity.ChamSocKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LichLamViecRepo extends JpaRepository<ChamSocKhachHang,Integer> {
}
