package com.yuan.oa.dao;

import com.yuan.oa.entity.dealRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dealRecordDao")
public interface DealRecordDao {
    void insert(dealRecord dealRecord);
    List<dealRecord> selectByClaimVoucher(int cvid);
}
