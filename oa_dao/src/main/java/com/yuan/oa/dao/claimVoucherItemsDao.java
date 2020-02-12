package com.yuan.oa.dao;

import com.yuan.oa.entity.claimVoucherItems;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("claimVoucherItems")
public interface claimVoucherItemsDao {
    void insert(claimVoucherItems claimVoucherItems);
    void update(claimVoucherItems claimVoucherItems);
    void delete(int id);
    List<claimVoucherItems> selectByClaimVoucher(int cvid);
}
