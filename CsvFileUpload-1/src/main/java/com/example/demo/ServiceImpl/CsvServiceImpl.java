package com.example.demo.ServiceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.CsvRepository;
import com.example.demo.model.CsvFile;
import com.example.demo.service.CsvService;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
@Service
public class CsvServiceImpl implements CsvService {
@Autowired
CsvRepository csvRepository;

@Override
public ResponseEntity<String> uploadFile(MultipartFile multipartFile) throws Exception {
	List<CsvFile> list = csvRepository.findAll();
	CsvParserSettings csvParserSettings = new CsvParserSettings();
	csvParserSettings.setHeaderExtractionEnabled(true);
	CsvParser parser = new CsvParser(csvParserSettings);
	List<com.univocity.parsers.common.record.Record> records = parser.parseAllRecords(multipartFile.getInputStream());
	records.forEach(record-> {
		CsvFile csvFile=new CsvFile();
		csvFile.setItemId(record.getString("itemId"));
		csvFile.setItemName(record.getString("itemName"));
		csvFile.setBrand(record.getString("brand"));
		csvFile.setDimensionUnit(record.getString("dimensionUnit"));
		csvFile.setEan(record.getString("ean"));
		csvFile.setInventoryAccount(record.getString("inventoryAccount"));
		csvFile.setIsbn(record.getString("isbn"));
		csvFile.setIsComboProduct(record.getBoolean("isComboProduct"));
		csvFile.setIsReturnableItem(record.getBoolean("isReturnableItem"));
		csvFile.setItemType(record.getString("itemType"));
		csvFile.setLastSyncTime(record.getString("lastSyncTime"));
		csvFile.setManufacturer(record.getString("manufacturer"));
		csvFile.setOpeningStock(record.getString("openingStock"));
		csvFile.setOpeningStockValue(record.getString("openingStockValue"));
		csvFile.setPackageHeight(record.getLong("packageHeight"));
		csvFile.setPackageLength(record.getLong("packageLength"));
		csvFile.setPackageWeight(record.getLong("packageWeight"));
		csvFile.setPackageWidth(record.getLong("packageWidth"));
		csvFile.setPartNumber(record.getLong("partNumber"));
		csvFile.setPreferredVendor(record.getString("preferredVendor"));
		csvFile.setProductTypes(record.getString("productTypes"));
		csvFile.setPurchaseAccount(record.getString("purchaseAccount"));
		csvFile.setPurchaseDescription(record.getString("purchaseDescription"));
		csvFile.setPurchasePrice(record.getString("purchasePrice"));
		csvFile.setRecoderLevel(record.getString("recoderLevel"));
		csvFile.setReferanceId(record.getLong("referanceId"));
		csvFile.setSalesAccount(record.getString("salesAccount"));
		csvFile.setSalesDescription(record.getString("salesDescription"));
		csvFile.setSellingPrice(record.getString("sellingPrice"));
		csvFile.setSku(record.getString("sku"));
		csvFile.setSource(record.getLong("source"));
		csvFile.setStatus(record.getString("status"));
		csvFile.setStockOnHand(record.getLong("stockOnHand"));
		csvFile.setTaxName(record.getString("taxName"));
		csvFile.setTaxPercentage(record.getLong("taxPercentage"));
		csvFile.setTaxType(record.getString("taxType"));
		csvFile.setUnit(record.getString("unit"));
		csvFile.setUpc(record.getString("upc"));
		csvFile.setWeightUnit(record.getString("weightUnit"));
		list.add(csvFile);
		csvRepository.saveAll(list);
	});
	return null;
}

}
