package ro.ase.cts.g1088;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OShop o = new OShop("Emag", "logo.jpg", new ArrayList<Prod>());

        Prod p1 = new Prod("Laptop", 3200.5, 1,1, 1123, "");
        Prod p2 = new Prod("Frigider", 207.95, 1,2, 1245, "");

        Prod p3 = new Prod(p1);

        p3.setQty(5);
        p3.setProdName("Paine");

        o.modifyProductsList(1,p1);
        o.modifyProductsList(1,p2);

        o.modifyProductsList(2, p1);
        System.out.println(p1.equals(p2));
    }
}

class OShop {
    private String onlineShopName;
    private String i;
    private ArrayList<Prod> products;

    OShop(String name, String img, ArrayList<Prod> products)
    {
        this.products = new ArrayList<Prod>();
        this.i = img;
        this.onlineShopName = name;
    }

    public void modifyProductsList(int what, Prod p)
    {
        if(what == 1)
        {
            this.products.add(p);
        }
        else
            this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getI() {
        return i;
    }

    public void setImg(String img) {
        this.i = img;
    }
}

class Prod
{
    private int prodId;
    private String prodName;
    private double productPrice;
    private int productType;
    private int productCategory;
    private int qty;
    private String exp; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Prod(String n, double p, int pt, int pc, int id, String exp)
    {
        prodName = n;
        productPrice = p;
        productType = pt;
        productCategory = pc;
        this.prodId = id;
        this.exp = exp;
    }

    public Prod(Prod p)
    {
        this.prodName = p.prodName;
        this.productPrice = p.productPrice;
        this.productType = p.productType;
        this.productCategory = p.productCategory;
        this.prodId = p.prodId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public boolean equals(Prod p)
    {
        if(p.prodId != this.prodId)
            return false;
        if(!p.prodName.equals(this.prodName))
            return false;
        if(p.productPrice != this.productPrice)
            return false;
        if(p.productType != p.productType)
            return false;
        if(p.productCategory != this.productCategory)
            return false;

        return true;
    }

    public void modify(boolean flag, double val)
    {
        if(flag)
            this.productPrice+=this.productPrice*val;
        if(!flag)
            this.productPrice-=this.productPrice*val/100;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class Order
{
    private ArrayList<Prod> l;
    private String addr;

    public Order()
    {
        l = new ArrayList<Prod>();
    }
    public void add(Prod p)
    {
        if(l.size() > 99)
            return;

        l.add(p);
    }

    public void remove(Prod p)
    {
        l.remove(p);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

class InventoryP
{
    private Prod p;
    private int q;

    public InventoryP(Prod p, int q)
    {
        this.p = new Prod(p);
        this.q = q;
    }
    public Prod getP() {
        return p;
    }

    public void setP(Prod p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}
