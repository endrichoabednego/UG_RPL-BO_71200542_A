
package com.ug6.soal1;

public class Phones
{
    private String phoneName;
    private String phoneCode;
    private String companyCode;
    private String androidCode;
    private int ramCapacity;
    private int romCapacity;
    private int cameraResolution;
    private float screenSize;

    public Phones(final String phoneName, final String phoneCode, final String companyCode, final String androidCode) {
        this.ramCapacity = 0;
        this.romCapacity = 0;
        this.cameraResolution = 0;
        this.setPhoneCode(phoneCode);
        this.setCompanyCode(companyCode);
        this.setAndroidCode(androidCode);
        this.setPhoneName(phoneName);
    }

    public Phones(final String phoneName, final String phoneCode, final String companyCode, final String androidCode, final int ramCapacity, final int romCapacity, final int cameraResolution, final float screenSize) {
        this.ramCapacity = 0;
        this.romCapacity = 0;
        this.cameraResolution = 0;
        this.setRamCapacity(ramCapacity);
        this.setPhoneCode(phoneCode);
        this.setPhoneName(phoneName);
        this.setAndroidCode(androidCode);
        this.setCompanyCode(companyCode);
        this.setRomCapacity(romCapacity);
        this.setCameraResolution(cameraResolution);
        this.setScreenSize(screenSize);
    }

    public String getPhoneName() {
        return this.phoneName;
    }

    public void setPhoneName(final String phoneName) {
        this.phoneName = phoneName;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setCompanyCode(final String companyCode) {
        this.companyCode = companyCode;
    }

    public String getAndroidCode() {
        return this.androidCode;
    }

    public void setAndroidCode(final String androidCode) {
        this.androidCode = androidCode;
    }

    public int getRamCapacity() {
        return this.ramCapacity;
    }

    public void setRamCapacity(final int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getCameraResolution() {
        return this.cameraResolution;
    }

    public void setRomCapacity(final int romCapacity) {
        this.romCapacity = romCapacity;
    }

    public int getRomCapacity() {
        return this.romCapacity;
    }

    public void setCameraResolution(final int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public void setPhoneCode(final String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setScreenSize(final float screenSize) {
        this.screenSize = screenSize;
    }

    public String getPhoneCode() {
        return this.phoneCode;
    }

    public float getScreenSize() {
        return this.screenSize;
    }
}
