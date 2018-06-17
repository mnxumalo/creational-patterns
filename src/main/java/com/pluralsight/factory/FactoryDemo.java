package com.pluralsight.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		Website website = WebsiteFactory.getWebSite(WebsiteType.BLOG);
		System.out.println(website.getPages());

		Website website1 = WebsiteFactory.getWebSite(WebsiteType.SHOP);
		System.out.println(website1.getPages());
	}

}
