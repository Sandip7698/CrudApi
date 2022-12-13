package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class CsvFile {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String itemId;
    private String itemName;
    private String salesDescription;
    private String sellingPrice;
    private String salesAccount;
    private Boolean isReturnableItem;
    private String brand;
    private String manufacturer;
    private Long packageWeight;
    private Long packageLength;
    private Long packageWidth;
    private Long packageHeight;
    private String dimensionUnit;
    private String weightUnit;
    private String taxName;
    private Long taxPercentage;
    private String taxType;
    private String productTypes;
    private Long source;
    private Long referanceId;
    private String lastSyncTime;
    private String status;
    private String unit;
    private String sku;
    private String upc;
    private String ean;
    private String isbn;
    private Long partNumber;
    private String purchasePrice;
    private String purchaseAccount;
    private String purchaseDescription;
    private String inventoryAccount;
    private String recoderLevel;
    private String preferredVendor;
    private String openingStock;
    private String openingStockValue;
    private Long stockOnHand;
    private Boolean isComboProduct;
    private String itemType;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSalesDescription() {
		return salesDescription;
	}
	public void setSalesDescription(String salesDescription) {
		this.salesDescription = salesDescription;
	}
	public String getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getSalesAccount() {
		return salesAccount;
	}
	public void setSalesAccount(String salesAccount) {
		this.salesAccount = salesAccount;
	}
	public Boolean getIsReturnableItem() {
		return isReturnableItem;
	}
	public void setIsReturnableItem(Boolean isReturnableItem) {
		this.isReturnableItem = isReturnableItem;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Long getPackageWeight() {
		return packageWeight;
	}
	public void setPackageWeight(Long packageWeight) {
		this.packageWeight = packageWeight;
	}
	public Long getPackageLength() {
		return packageLength;
	}
	public void setPackageLength(Long packageLength) {
		this.packageLength = packageLength;
	}
	public Long getPackageWidth() {
		return packageWidth;
	}
	public void setPackageWidth(Long packageWidth) {
		this.packageWidth = packageWidth;
	}
	public Long getPackageHeight() {
		return packageHeight;
	}
	public void setPackageHeight(Long packageHeight) {
		this.packageHeight = packageHeight;
	}
	public String getDimensionUnit() {
		return dimensionUnit;
	}
	public void setDimensionUnit(String dimensionUnit) {
		this.dimensionUnit = dimensionUnit;
	}
	public String getWeightUnit() {
		return weightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}
	public String getTaxName() {
		return taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public Long getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(Long taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getProductTypes() {
		return productTypes;
	}
	public void setProductTypes(String productTypes) {
		this.productTypes = productTypes;
	}
	public Long getSource() {
		return source;
	}
	public void setSource(Long source) {
		this.source = source;
	}
	public Long getReferanceId() {
		return referanceId;
	}
	public void setReferanceId(Long referanceId) {
		this.referanceId = referanceId;
	}
	public String getLastSyncTime() {
		return lastSyncTime;
	}
	public void setLastSyncTime(String lastSyncTime) {
		this.lastSyncTime = lastSyncTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Long getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(Long partNumber) {
		this.partNumber = partNumber;
	}
	public String getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getPurchaseAccount() {
		return purchaseAccount;
	}
	public void setPurchaseAccount(String purchaseAccount) {
		this.purchaseAccount = purchaseAccount;
	}
	public String getPurchaseDescription() {
		return purchaseDescription;
	}
	public void setPurchaseDescription(String purchaseDescription) {
		this.purchaseDescription = purchaseDescription;
	}
	public String getInventoryAccount() {
		return inventoryAccount;
	}
	public void setInventoryAccount(String inventoryAccount) {
		this.inventoryAccount = inventoryAccount;
	}
	public String getRecoderLevel() {
		return recoderLevel;
	}
	public void setRecoderLevel(String recoderLevel) {
		this.recoderLevel = recoderLevel;
	}
	public String getPreferredVendor() {
		return preferredVendor;
	}
	public void setPreferredVendor(String preferredVendor) {
		this.preferredVendor = preferredVendor;
	}
	public String getOpeningStock() {
		return openingStock;
	}
	public void setOpeningStock(String openingStock) {
		this.openingStock = openingStock;
	}
	public String getOpeningStockValue() {
		return openingStockValue;
	}
	public void setOpeningStockValue(String openingStockValue) {
		this.openingStockValue = openingStockValue;
	}
	public Long getStockOnHand() {
		return stockOnHand;
	}
	public void setStockOnHand(Long stockOnHand) {
		this.stockOnHand = stockOnHand;
	}
	public Boolean getIsComboProduct() {
		return isComboProduct;
	}
	public void setIsComboProduct(Boolean isComboProduct) {
		this.isComboProduct = isComboProduct;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
}
