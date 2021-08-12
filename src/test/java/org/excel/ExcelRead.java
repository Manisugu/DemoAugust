package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ExcelRead {
	
	@Test
	public void test1() {
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	 @Ignore
	 @Test
	 public void test2() {
			Assert.assertTrue(false);
			Assert.assertTrue(true);
			Assert.assertTrue(true);
		}
	 @Test
	 public void test3() {
			Assert.assertTrue(true);
			Assert.assertTrue(true);
			Assert.assertTrue(true);
		}
}