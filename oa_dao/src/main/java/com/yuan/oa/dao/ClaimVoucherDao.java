package com.yuan.oa.dao;

import com.yuan.oa.entity.claimVoucher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("claimVoucherDao")
public interface ClaimVoucherDao {
    void insert(claimVoucher claimVoucher);
    void update(claimVoucher claimVoucher);
    void delete(int id);
    claimVoucher select(int id);
    List<claimVoucher> selectByCreateSn(String csn);
    List<claimVoucher> selectByNextDealSn(String ndsn);
}
