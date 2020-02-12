package com.yuan.oa.biz;

import com.yuan.oa.entity.claimVoucher;
import com.yuan.oa.entity.claimVoucherItems;
import com.yuan.oa.entity.dealRecord;

import java.util.List;

public interface ClaimVoucherBiz {

    void save(claimVoucher claimVoucher, List<claimVoucherItems> items);

    claimVoucher get(int id);
    List<claimVoucherItems> getItems(int cvid);
    List<dealRecord> getRecords(int cvid);

    List<claimVoucher> getForSelf(String sn);
    List<claimVoucher> getForDeal(String sn);

    void update(claimVoucher claimVoucher,List<claimVoucherItems> items);

    void submit(int id);
    void deal(dealRecord dealRecord);
}
