package minhnqph38692.fpoly.quanlykho.model;
/*
*Created by minhnqph38692
*
 */
public class BillDetail {
    int id;
    int billID;//khoa ngoai o bang Bill
    int quantity;//so luong sp
    String createdDate;

    public BillDetail(int id, int billID, int quantity, String createdDate) {
        this.id = id;
        this.billID = billID;
        this.quantity = quantity;
        this.createdDate = createdDate;
    }

    public BillDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
