package com.engeto.seller;

import java.time.LocalDate;

/**
 * The seller class provides data about the seller.
 *
 * Author: Tomáš Kaplan
 *
 */
public class Seller {
    String sellerName;
    Integer sellerId;
    LocalDate sellerBirthDate;
    Integer numberOfContracts;
    float totalAmount;
    String sellerAddressCity;

    static int counter = 0; // Statické počítadlo pro ID prodejce

    public Seller() {
        counter++;
        this.sellerId = counter; // Nastavení ID na aktuální hodnotu počítadla
    }


    public Integer getSellerId() {
        return sellerId;
    }

    public String getSellerCar() {
        return sellerCar;
    }

    public void setSellerCar(String sellerCar) {
        this.sellerCar = sellerCar;
    }

    String sellerCar;

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    public LocalDate getSellerBirthDate() {
        return sellerBirthDate;
    }

    public void setSellerBirthDate(LocalDate sellerBirthDate) {
        this.sellerBirthDate = sellerBirthDate;
    }



    public Integer getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(Integer numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSellerAddressCity() {
        return sellerAddressCity;
    }

    public void setSellerAddressCity(String sellerAddressCity) {
        this.sellerAddressCity = sellerAddressCity;
    }

}



