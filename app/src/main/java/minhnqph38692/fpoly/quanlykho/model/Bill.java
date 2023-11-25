package minhnqph38692.fpoly.quanlykho.model;

public class Bill {
    int id ; //ma hoa don
    int quanity;//>0 : nhap kho , <0: xuat kho
    int productID ;
    String nameProduct;
    String createdByuser;//tao boi ai!!!
    String createdDate;//ngay tao hoa don
    String note;//ghi chú trường hợp đặc biệt

    public Bill(int id, int quanity, int productID, String nameProduct, String createdByuser, String createdDate, String note) {
        this.id = id;
        this.quanity = quanity;
        this.productID = productID;
        this.nameProduct = nameProduct;
        this.createdByuser = createdByuser;
        this.createdDate = createdDate;
        this.note = note;
    }

    public Bill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCreatedByuser() {
        return createdByuser;
    }

    public void setCreatedByuser(String createdByuser) {
        this.createdByuser = createdByuser;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
