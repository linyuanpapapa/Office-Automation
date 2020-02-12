package com.yuan.oa.dto;

import com.yuan.oa.entity.claimVoucher;
import com.yuan.oa.entity.claimVoucherItems;

import java.util.List;

public class ClaimVoucherInfo {
    private claimVoucher claimVoucher;
    private List<claimVoucherItems> items;

    public com.yuan.oa.entity.claimVoucher getClaimVoucher() {
        return claimVoucher;
    }

    public void setClaimVoucher(com.yuan.oa.entity.claimVoucher claimVoucher) {
        this.claimVoucher = claimVoucher;
    }

    public List<claimVoucherItems> getItems() {
        return items;
    }

    public void setItems(List<claimVoucherItems> items) {
        this.items = items;
    }
}
