package com.engeto.seller;

import java.time.LocalDate;

public interface Seller {
    public Integer getSellerId();

    public void setSellerCar(String sellerCar);
    public String getSellerCar();

    public void setSellerName(String sellerName);
    public String getSellerName();

    public void setSellerBirthDate(LocalDate sellerBirthDate);
    public LocalDate getSellerBirthDate();

    public void setNumberOfContracts(Integer numberOfContracts);
    public Integer getNumberOfContracts();

    public void setTotalAmount(float totalAmount);
    public float getTotalAmount();

    public void setSellerAddressCity(String sellerAddressCity);
    public String getSellerAddressCity();
}
