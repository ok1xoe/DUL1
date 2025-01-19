package com.engeto.seller;

import java.time.LocalDate;

/**
 * The seller class provides data about the seller.
 *
 * Author: Tomáš Kaplan
 *
 */
public class CarrotSeller implements Seller{
    String sellerName;
    Integer sellerId;
    LocalDate sellerBirthDate;
    Integer numberOfContracts;
    float totalAmount;
    String sellerAddressCity;
    String sellerCar;

    static int counter = 0; // Statické počítadlo pro ID prodejce

    public CarrotSeller() {
        counter++;
        this.sellerId = counter; // Nastavení ID na aktuální hodnotu počítadla
    }


    @Override
    public Integer getSellerId() {
        return sellerId;
    }

    @Override
    public String getSellerCar() {
        return sellerCar;
    }

    @Override
    public void setSellerCar(String sellerCar) {
        this.sellerCar = sellerCar;
    }


    @Override
    public String getSellerName() {
        return sellerName;
    }

    @Override
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    @Override
    public LocalDate getSellerBirthDate() {
        return sellerBirthDate;
    }

    @Override
    public void setSellerBirthDate(LocalDate sellerBirthDate) {
        this.sellerBirthDate = sellerBirthDate;
    }

    @Override
    public Integer getNumberOfContracts() {
        return numberOfContracts;
    }

    @Override
    public void setNumberOfContracts(Integer numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    @Override
    public float getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String getSellerAddressCity() {
        return sellerAddressCity;
    }

    @Override
    public void setSellerAddressCity(String sellerAddressCity) {
        this.sellerAddressCity = sellerAddressCity;
    }

}



