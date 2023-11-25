package minhnqph38692.fpoly.quanlykho.model;

public class Product {
    int id;//khoa chinh , tu dong tu 0->n
    String ten;//ten sp
    int quantity;//so luong cua sp
    String price;//gia ban cua sp
    String photo;//anh cua so khi vao kho
    String userID;//nguoi tao san pham

    public Product() {
    }

    public Product(int id, String ten, int quantity, String price, String photo, String userID) {
        this.id = id;
        this.ten = ten;
        this.quantity = quantity;
        this.price = price;
        this.photo = photo;
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
