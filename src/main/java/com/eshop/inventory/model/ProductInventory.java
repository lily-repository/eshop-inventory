package com.eshop.inventory.model;

/**
 * * 库存数量model
 *
 * @author: RenLiLi
 * @date: 2021/7/22 13:27
 */
public class ProductInventory {
    /**
     * 商品ID
     */
    private Integer productId;

    /**
     * 库存数量
     */
    private Long inventoryCnt;

    public ProductInventory() {
    }

    public ProductInventory(Integer productId, Long inventoryCnt) {
        this.productId = productId;
        this.inventoryCnt = inventoryCnt;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Long getInventoryCnt() {
        return inventoryCnt;
    }

    public void setInventoryCnt(Long inventoryCnt) {
        this.inventoryCnt = inventoryCnt;
    }
}
