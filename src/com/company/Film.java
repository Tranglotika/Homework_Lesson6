package com.company;

public class Film {
    public String id;
    public String name;
    public String type;
    public int length;
    public String producer;
    public int openingYear;

    public Film(String id,String name, String type, int length, String producer, int openingYear) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.length = length;
        this.producer = producer;
        this.openingYear = openingYear;
    }

    @Override
    public String toString() {
        return "Phim mã "+id+" tên là "+name+" thể loại "+type+" có độ dài "+length+" phút, được sản xuất bởi "+producer+" và phát hành vào năm "+openingYear+".";
    }
}
