package com.company.step_definitions;

import com.company.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class BrokenLinks {

	public static void main(String[] args) {
		String homePage = "https://undostres.com.mx/";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		DriverUtil.getDriver().get(homePage);

		List<WebElement> links = DriverUtil.getDriver().findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			 //System.out.println(url);

			if (url == null || url.isEmpty()) {
				System.out.println(url+"URL is either not configured for anchor tag or it is empty");
				continue;
			}

//			if (!url.startsWith(homePage)) {
//				System.out.println("URL belongs to another domain, skipping it.");
//				continue;
//			}

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");
				huc.setConnectTimeout(3000);

				huc.connect();

				respCode = huc.getResponseCode();
				System.out.println(huc.getResponseMessage());
				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " is a valid link");
				}

			} catch (MalformedURLException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		DriverUtil.closeDriver();

	}
}